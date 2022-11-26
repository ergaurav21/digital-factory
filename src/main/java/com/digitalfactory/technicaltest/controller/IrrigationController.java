package com.digitalfactory.technicaltest.controller;

import com.digitalfactory.technicaltest.model.ConfigurePlotRequest;
import com.digitalfactory.technicaltest.model.IrrigationRequest;
import com.digitalfactory.technicaltest.service.IrrigationService;
import com.digitalfactory.technicaltest.service.PlotService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@Slf4j
public class IrrigationController {

    private final IrrigationService irrigationService;

    @Autowired
    public IrrigationController(IrrigationService irrigationService) {
        this.irrigationService = irrigationService;
    }

    @ApiOperation("Prepare land for irrigation")
    @ApiResponses({
            @io.swagger.annotations.ApiResponse(code = 202, message = "Accepted"),
            @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request")
    })
    @PostMapping("/irrigation/prepare")
    public ResponseEntity prepare(@RequestBody @Valid final IrrigationRequest irrigationRequest) {
        IrrigationController.log.info("Request : {}", irrigationRequest);
        irrigationService.configure(irrigationRequest);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

}
