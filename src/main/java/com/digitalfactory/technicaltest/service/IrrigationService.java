package com.digitalfactory.technicaltest.service;

import com.digitalfactory.technicaltest.model.IrrigationRequest;
import org.springframework.stereotype.Service;

@Service
public interface IrrigationService {
    void configure(IrrigationRequest irrigationRequest);
}
