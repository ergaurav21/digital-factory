package com.digitalfactory.technicaltest.model;

import com.digitalfactory.technicaltest.entity.Plot;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class PlotRequest {

    @NotEmpty
    private String longitude;

    @NotEmpty
    private String latitude;

    @NotEmpty
    private double area;

    @NotEmpty
    private String unit;

    @NotEmpty
    private String soilType;

    @NotEmpty
    private String moisturizerAvailability;

    @NotEmpty
    private String soilToxicity;


    public Plot toPlotEntity() {
        return Plot.builder().longitude(longitude).latitude(latitude).area(area).unit(unit).soilType(soilType).soilToxicity(soilToxicity).moisturizerAvailability(moisturizerAvailability).build();
    }
}
