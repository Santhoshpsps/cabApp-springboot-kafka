package com.psps.cab_driver.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import static com.psps.cab_driver.constant.AppConstant.CAB_LOCATION;

@Service
public class CabLocationService {

    @Autowired
    private KafkaTemplate<String,Object> kafkaTemplate;

    public void publishLocation(String message){
        kafkaTemplate.send(CAB_LOCATION,message);
    }
}
