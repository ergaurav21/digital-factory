package com.digitalfactory.technicaltest.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "tbl_plots")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Plot {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "plot_id", unique = true, updatable = false, nullable = false)
    private Long plotId;

    @Column(name = "longitude", nullable = false)
    private String longitude;

    @Column(name = "latitude", nullable = false)
    private String latitude;

    @Column(name = "area", nullable = false)
    private double area;

    @Column(name = "unit", nullable = false)
    private String unit;

    @Column(name = "soil_type", nullable = false)
    private String soilType;

    @Column(name = "moisturizer_availability", nullable = false)
    private String moisturizerAvailability;

    @Column(name = "soil_toxicity", nullable = false)
    private String soilToxicity;

    @Column(name = "creation_date", nullable = false)
    private Date creationDate;

    @Column(name = "last_modified", nullable = false)
    private Date lastModified;

}
