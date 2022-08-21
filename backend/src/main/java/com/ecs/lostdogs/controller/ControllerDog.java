package com.ecs.lostdogs.controller;

import com.ecs.lostdogs.entites.Dog;
import com.ecs.lostdogs.entites.Guardian;
import com.ecs.lostdogs.services.ServicesDog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/dog")
public class ControllerDog {

    @Autowired
    private ServicesDog services;

    @GetMapping("/all")
    public List<Dog> findAll(){
        return services.findAll();
    }

    @PostMapping("/add")
    public Dog addDog(@RequestBody Dog dog, Guardian guardian){
        Dog dg = new Dog(dog.getName(), dog.getBreed(), dog.getAge(), guardian);
        return services.saveDog(dg);
    }

    @GetMapping("/{id}")
    public Dog findById(@PathVariable Long id){
        return services.findById(id);
    }
}
