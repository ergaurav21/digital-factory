package com.digitalfactory.technicaltest.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "tbl_plot_sensor_mapping")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PlotSensor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, updatable = false, nullable = false)
    private Long id;

    @OneToOne
    @Column(name = "plot_id", updatable = false, nullable = false)
    private Plot plot;

    @Column(name = "sensor_id", updatable = false, nullable = false)
    private long sensorId;

}
