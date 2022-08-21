package com.ecs.lostdogs.services;

import com.ecs.lostdogs.entites.Dog;
import com.ecs.lostdogs.entites.Guardian;
import com.ecs.lostdogs.repository.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicesDog {

    @Autowired
    private DogRepository repository;

    public List<Dog> findAll(){
        return repository.findAll();
    }

    public Dog saveDog(Dog dog){return repository.save(dog);}

    public Dog findById(Long id){
        return repository.findById(id).get();
    }


}
