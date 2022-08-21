package com.ecs.lostdogs.repository;

import com.ecs.lostdogs.entites.Guardian;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuardianRepository extends JpaRepository<Guardian, Long> {
}
