package com.ecs.lostdogs.repository;

import com.ecs.lostdogs.entites.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {

}
