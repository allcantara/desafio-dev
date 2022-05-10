package com.bycoders.infrastructure.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@Api(tags = "Info")
public class ByCodersController {

    @GetMapping
    @ApiOperation(value = "Get info api.")
    public ResponseEntity<String> findOne() {
        return new ResponseEntity<>("Api version: 1.0.0", HttpStatus.OK);
    }
}
