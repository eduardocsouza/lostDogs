package com.ecs.lostdogs.services;

import com.ecs.lostdogs.entites.Guardian;
import com.ecs.lostdogs.repository.GuardianRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicesGuardian {

    @Autowired
    private GuardianRepository repository;


    public Guardian saveGuardian(Guardian guardian){
        return repository.save(guardian);
    }

    public List<Guardian> findAll(){
        return repository.findAll();
    }
}
