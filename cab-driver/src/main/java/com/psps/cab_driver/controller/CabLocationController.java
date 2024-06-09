package com.psps.cab_driver.controller;

import com.psps.cab_driver.service.CabLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController()
@RequestMapping("/location")
public class CabLocationController {

    @Autowired
    CabLocationService cabLocationService;

    @PutMapping("/publish")
    public ResponseEntity updateLocation() throws InterruptedException {
        int n=0;
        while (n<100) {
            cabLocationService.publishLocation(Math.random() + " , " + Math.random());
            Thread.sleep(500);
            n++;
        }

        return new ResponseEntity(Map.of("message","Location Updated to User"),HttpStatus.OK);
    }
}
