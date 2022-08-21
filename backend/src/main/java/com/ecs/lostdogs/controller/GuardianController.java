package com.ecs.lostdogs.controller;

import com.ecs.lostdogs.entites.Dog;
import com.ecs.lostdogs.entites.Guardian;
import com.ecs.lostdogs.services.ServicesGuardian;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/guardian")
public class GuardianController {

    @Autowired
    public ServicesGuardian services;

    @PostMapping("/add")
    public Guardian saveGuardian(@RequestBody Guardian guardian){
        return services.saveGuardian(guardian);
    }

    @GetMapping("/all")
    public List<Guardian> findAll(){
        return services.findAll();
    }
}
