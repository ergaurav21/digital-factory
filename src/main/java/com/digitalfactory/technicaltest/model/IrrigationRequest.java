package com.digitalfactory.technicaltest.model;

import com.digitalfactory.technicaltest.entity.Plot;
import com.digitalfactory.technicaltest.entity.PlotSensor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IrrigationRequest {

    private long sensorId;
    private long plotId;

    public PlotSensor toPlotSensorEntity() {
        Plot plot = new Plot();
        plot.setPlotId(plotId);
        return PlotSensor.builder().sensorId(sensorId).plot(plot).build();
    }

}
