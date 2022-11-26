package com.digitalfactory.technicaltest.repository;

import com.digitalfactory.technicaltest.entity.PlotSensor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlotSensorRepository extends CrudRepository<PlotSensor, Long> {
}
