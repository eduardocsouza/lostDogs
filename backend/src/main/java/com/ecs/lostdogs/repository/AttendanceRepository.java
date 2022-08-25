package com.ecs.lostdogs.repository;

import com.ecs.lostdogs.entites.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttendanceRepository extends JpaRepository<Attendance, Long> {
}
