package com.ecs.lostdogs.services;

import com.ecs.lostdogs.entites.Attendance;
import com.ecs.lostdogs.repository.AttendanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicesAttendance {

    @Autowired
    private AttendanceRepository repository;

    public Attendance save(Attendance attendance){
        return repository.save(attendance);
    }
}
