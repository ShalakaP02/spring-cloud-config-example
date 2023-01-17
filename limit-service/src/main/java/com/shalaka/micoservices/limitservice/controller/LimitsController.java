package com.shalaka.micoservices.limitservice.controller;

import com.shalaka.micoservices.limitservice.bean.Limit;
import com.shalaka.micoservices.limitservice.config.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public Limit fetchLimits(){
        //return new Limit(1,1000);
        return new Limit(configuration.getMinimum(),configuration.getMaximum());
    }
}
