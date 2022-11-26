package com.digitalfactory.technicaltest.model;

import com.digitalfactory.technicaltest.entity.Plot;
import com.digitalfactory.technicaltest.entity.PlotIrrigationDetails;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Data
public class ConfigurePlotRequest {
    @NotEmpty
    private Long plotId;
    @NotEmpty
    private IrrigationSlot irrigationSlot;

    @Getter
    @Setter
    public static class IrrigationSlot {

        @NotEmpty
        private Date startDate;
        @NotEmpty
        private Date endDate;
        @NotEmpty
        private Double waterAmount;

    }


    public PlotIrrigationDetails toPlotIrrigationDetails() {
        Plot plot = new Plot();
        plot.setPlotId(plotId);
        return PlotIrrigationDetails.builder().plot(plot).startTime(irrigationSlot.getStartDate()).
                endTime(irrigationSlot.getEndDate()).waterAmount(irrigationSlot.getWaterAmount()).build();
    }
}
