package com.digitalfactory.technicaltest.model.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PlotDTO {
    private String id;
    private String longitude;
    private String latitude;
    private double area;
    private String unit;
    private String soilType;
    private String moisturizerAvailability;
    private String soilToxicity;

}
