package com.ecs.lostdogs.controller;


import com.ecs.lostdogs.entites.Doctor;
import com.ecs.lostdogs.services.ServicesDoctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

    @Autowired
    private ServicesDoctor services;

    @PostMapping("/add")
    public Doctor addDoctor(@RequestBody Doctor doctor){
        return services.addDoctor(doctor);
    }

    @GetMapping("/all")
    public List<Doctor> findAll(){
        return services.findAll();
    }
}
