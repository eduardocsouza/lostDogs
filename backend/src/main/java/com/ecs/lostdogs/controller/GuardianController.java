package com.ecs.lostdogs.controller;

import com.ecs.lostdogs.entites.Guardian;
import com.ecs.lostdogs.services.ServicesGuardian;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/guardian")
public class GuardianController {

    @Autowired
    public ServicesGuardian services;

    @PostMapping("/add")
    public Guardian saveGuardian(@RequestBody Guardian guardian){
        return services.saveGuardian(guardian);
    }
}
