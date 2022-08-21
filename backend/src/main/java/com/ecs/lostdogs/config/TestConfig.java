package com.ecs.lostdogs.config;

import com.ecs.lostdogs.entites.Doctor;
import com.ecs.lostdogs.entites.Dog;
import com.ecs.lostdogs.entites.Guardian;
import com.ecs.lostdogs.repository.DoctorRepository;
import com.ecs.lostdogs.repository.DogRepository;
import com.ecs.lostdogs.repository.GuardianRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private DoctorRepository doctorRepository;

    @Autowired
    private GuardianRepository guardianRepository;

    @Autowired
    private DogRepository dogRepository;

    @Override
    public void run(String... args) throws Exception {
        Doctor doctor = new Doctor("Mario", "CRM_12334");
        Guardian guardian = new Guardian("Eduardo", "81984493777");

        Dog dog = new Dog("Toto", "Pasto Alemao", "5", guardian);



        doctorRepository.save(doctor);
        guardianRepository.save(guardian);
        dogRepository.save(dog);
    }
}
