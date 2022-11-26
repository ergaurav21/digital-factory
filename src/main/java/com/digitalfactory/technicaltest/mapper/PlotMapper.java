package com.digitalfactory.technicaltest.mapper;


import com.digitalfactory.technicaltest.model.DTO.PlotDTO;
import com.digitalfactory.technicaltest.entity.Plot;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

@Component
public class PlotMapper {

    public List<PlotDTO> plotsToPlotDTOList(Iterable<Plot> plotIterable) {
        List<PlotDTO> plotDTOS = new ArrayList<>();

        if (!Objects.isNull(plotIterable)) {
            Iterator<Plot> it = plotIterable.iterator();

            while (it.hasNext()) {
                Plot plot = it.next();
                PlotDTO plotDTO = new PlotDTO();
                plotDTO.setArea(plot.getArea());
                plotDTO.setLongitude(plot.getLongitude());
                plotDTO.setLatitude(plot.getLatitude());
                plotDTO.setUnit(plot.getUnit());
                plotDTO.setSoilToxicity(plot.getSoilToxicity());
                plotDTO.setMoisturizerAvailability(plot.getMoisturizerAvailability());
                plotDTO.setSoilType(plot.getSoilType());
                plotDTO.setId(plotDTO.getId());
                plotDTOS.add(plotDTO);
            }
        }
        return plotDTOS;
    }

}
