package com.digitalfactory.technicaltest.service;

import com.digitalfactory.technicaltest.model.ConfigurePlotRequest;
import com.digitalfactory.technicaltest.model.DTO.PlotDTO;
import com.digitalfactory.technicaltest.model.PlotRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PlotService {
   Long create(final PlotRequest addPlotRequest);

   Long update(Long id, PlotRequest updatePlotRequest);

   List<PlotDTO> getPlots();

   void configure(ConfigurePlotRequest configurePlotRequest);
}
