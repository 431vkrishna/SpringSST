package com.devconnect.DevConnectB.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.*;

@RestController
public class HealthController {
    //URL Get /health
    @GetMapping("/health")
    public String getHealth(){
        return "Springboot Application running HEALTHY";
    }

    //GET /api/v1/status
    @GetMapping("api/v1/status")

    public Map<String,Object> getStatus(){
        Map<String,Object>map=new HashMap<>();
        map.put("status","OK");
        map.put("Service","DevConnectB");
        map.put("version","0.0.0.1");
        map.put("timestamp", LocalDateTime.now().toString());

        return map;
    }
}
