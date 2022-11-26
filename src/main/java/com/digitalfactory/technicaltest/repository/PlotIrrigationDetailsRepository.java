package com.digitalfactory.technicaltest.repository;

import com.digitalfactory.technicaltest.entity.PlotIrrigationDetails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlotIrrigationDetailsRepository extends CrudRepository<PlotIrrigationDetails, Long> {


}
