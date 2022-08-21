package com.ecs.lostdogs.repository;

import com.ecs.lostdogs.entites.Dog;
import com.ecs.lostdogs.entites.Guardian;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DogRepository extends JpaRepository<Dog, Long> {

}
