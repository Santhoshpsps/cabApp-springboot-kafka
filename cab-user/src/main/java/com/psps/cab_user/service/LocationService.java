package com.psps.cab_user.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class LocationService {
@KafkaListener(topics = "cab-location-topic", groupId = "user-group")
    public void consume(String message){
    System.out.println("User received cab's Location: "+message);
}
}
