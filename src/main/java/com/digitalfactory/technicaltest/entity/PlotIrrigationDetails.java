package com.digitalfactory.technicaltest.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tbl_plot_irrigation")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PlotIrrigationDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, updatable = false, nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "plot_id", referencedColumnName = "plot_id")
    private Plot plot;

    @Column(name = "start_time", nullable = false)
    private Date startTime;

    @Column(name = "end_time", nullable = false)
    private Date endTime;

    @Column(name = "water_amount", nullable = false)
    private double waterAmount;

    @Column(name = "status", nullable = false)
    private boolean status;

}
