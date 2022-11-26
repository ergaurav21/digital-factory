package com.digitalfactory.technicaltest.service.impl;

import com.digitalfactory.technicaltest.service.PlotService;
import com.digitalfactory.technicaltest.entity.Plot;
import com.digitalfactory.technicaltest.entity.PlotIrrigationDetails;
import com.digitalfactory.technicaltest.mapper.PlotMapper;
import com.digitalfactory.technicaltest.model.ConfigurePlotRequest;
import com.digitalfactory.technicaltest.model.DTO.PlotDTO;
import com.digitalfactory.technicaltest.model.PlotRequest;
import com.digitalfactory.technicaltest.repository.PlotIrrigationDetailsRepository;
import com.digitalfactory.technicaltest.repository.PlotRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class PlotServiceImpl implements PlotService {
    private final PlotRepository plotRepository;
    private final PlotMapper plotMapper;

    private final PlotIrrigationDetailsRepository irrigationDetailsRepository;

    @Autowired
    public PlotServiceImpl(
            PlotRepository plotRepository, PlotMapper plotMapper, PlotIrrigationDetailsRepository irrigationDetailsRepository) {
        this.plotRepository = plotRepository;
        this.plotMapper = plotMapper;
        this.irrigationDetailsRepository = irrigationDetailsRepository;
    }

    public Long create(final PlotRequest plotRequest) {
        validate(plotRequest);
        Plot plot = plotRequest.toPlotEntity();
        plot.setCreationDate(new Date());

        Plot out = plotRepository.save(plot);
        return out.getPlotId();
    }


    public Long update(Long id, PlotRequest plotRequest) {
        validate(plotRequest);
        Optional<Plot> optionalPlot = plotRepository.findById(id);
        if (optionalPlot.isPresent()) {
            Plot plot = optionalPlot.get();
            plot.setLongitude(plotRequest.getLongitude());
            plot.setLatitude(plotRequest.getLatitude());
            plot.setArea(plotRequest.getArea());
            plot.setSoilType(plotRequest.getSoilType());
            plot.setSoilToxicity(plotRequest.getSoilToxicity());
            plot.setMoisturizerAvailability(plotRequest.getMoisturizerAvailability());
            plot.setLastModified(new Date());
            Plot out = plotRepository.save(plot);
            return out.getPlotId();
        }

        throw new IllegalArgumentException("Invalid id provided");
    }

    @Override
    public List<PlotDTO> getPlots() {
        return plotMapper.plotsToPlotDTOList(plotRepository.findAll());
    }

    @Override
    public void configure(ConfigurePlotRequest configurePlotRequest) {
        PlotIrrigationDetails plotIrrigationDetails = configurePlotRequest.toPlotIrrigationDetails();
        irrigationDetailsRepository.save(plotIrrigationDetails);
    }

    private void validate(PlotRequest plotRequest) {
        if (Objects.isNull(plotRequest.getLatitude())) {
            throw new IllegalArgumentException("Empty latitude");
        }

        if (Objects.isNull(plotRequest.getLongitude())) {
            throw new IllegalArgumentException("Empty Longitude");
        }

        if (Objects.isNull(plotRequest.getArea())) {
            throw new IllegalArgumentException("Empty Area");
        }

        if (Objects.isNull(plotRequest.getUnit())) {
            throw new IllegalArgumentException("Empty Unit");
        }

        if (Objects.isNull(plotRequest.getSoilType())) {
            throw new IllegalArgumentException("Empty SoilType");
        }
    }
}
