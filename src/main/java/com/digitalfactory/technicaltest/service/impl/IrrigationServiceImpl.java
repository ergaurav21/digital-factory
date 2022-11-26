package com.digitalfactory.technicaltest.service.impl;

import com.digitalfactory.technicaltest.entity.PlotSensor;
import com.digitalfactory.technicaltest.model.IrrigationRequest;
import com.digitalfactory.technicaltest.repository.PlotSensorRepository;
import com.digitalfactory.technicaltest.service.IrrigationService;

public class IrrigationServiceImpl implements IrrigationService {
    private final PlotSensorRepository plotSensorRepository;

    public IrrigationServiceImpl(PlotSensorRepository plotSensorRepository) {
        this.plotSensorRepository = plotSensorRepository;
    }


    @Override
    public void configure(IrrigationRequest irrigationRequest) {
        PlotSensor plotSensor = irrigationRequest.toPlotSensorEntity();
        plotSensorRepository.save(plotSensor);
    }
}
