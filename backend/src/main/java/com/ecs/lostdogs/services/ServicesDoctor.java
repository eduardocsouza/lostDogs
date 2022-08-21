package com.ecs.lostdogs.services;

import com.ecs.lostdogs.entites.Doctor;
import com.ecs.lostdogs.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicesDoctor {

    @Autowired
    private DoctorRepository repository;

    public Doctor addDoctor(Doctor doctor){
        return repository.save(doctor);
    }

    public List<Doctor> findAll(){
        return repository.findAll();
    }
}
