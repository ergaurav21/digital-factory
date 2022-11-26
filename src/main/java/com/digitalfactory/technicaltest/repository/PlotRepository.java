package com.digitalfactory.technicaltest.repository;

import com.digitalfactory.technicaltest.entity.Plot;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlotRepository extends CrudRepository<Plot, Long> {




}
