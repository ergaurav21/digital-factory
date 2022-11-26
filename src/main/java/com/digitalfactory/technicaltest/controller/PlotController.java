package com.digitalfactory.technicaltest.controller;

import com.digitalfactory.technicaltest.model.ConfigurePlotRequest;
import com.digitalfactory.technicaltest.model.DTO.PlotDTO;
import com.digitalfactory.technicaltest.model.PlotRequest;
import com.digitalfactory.technicaltest.service.PlotService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@Slf4j
public class PlotController {

    private final PlotService plotService;

    @Autowired
    public PlotController(PlotService plotService) {
        this.plotService = plotService;
    }

    @ApiOperation("Add a Plot of Land")
    @ApiResponses({
            @io.swagger.annotations.ApiResponse(code = 202, message = "Accepted"),
            @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request")
    })
    @PostMapping("/plot")
    public ResponseEntity add(@RequestBody @Valid final PlotRequest addPlotRequest) {
        PlotController.log.info("Request : {}", addPlotRequest);
        plotService.create(addPlotRequest);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @ApiOperation("update a Plot of Land")
    @ApiResponses({
            @io.swagger.annotations.ApiResponse(code = 202, message = "Accepted"),
            @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request")
    })
    @PutMapping("/plot/{id}")
    public ResponseEntity update(@PathVariable Long id, @RequestBody @Valid final PlotRequest plotRequest) {
        PlotController.log.info("Request : {}", plotRequest);
        plotService.update(id, plotRequest);
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }

    @ApiOperation("Get List of Plots")
    @ApiResponses({@io.swagger.annotations.ApiResponse(code = 200, message = "ok")})
    @GetMapping("/plots")
    public ResponseEntity<List<PlotDTO>> getPlots() {
        List<PlotDTO> plotDTOS = plotService.getPlots();
        return new ResponseEntity(plotDTOS, HttpStatus.OK);
    }

    @ApiOperation("Configure a Plot of Land")
    @ApiResponses({
            @io.swagger.annotations.ApiResponse(code = 202, message = "Accepted"),
            @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request")
    })
    @PostMapping("/plot/configure")
    public ResponseEntity configure(@RequestBody @Valid final ConfigurePlotRequest configurePlotRequest) {
        PlotController.log.info("Request : {}", configurePlotRequest);
        plotService.configure(configurePlotRequest);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }


}
