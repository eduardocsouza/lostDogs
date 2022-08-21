package com.ecs.lostdogs.entites;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "tb_dog")
public class Dog implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @PrimaryKeyJoinColumn(name = "dog_id")
    private Long id;
    private String name;
    private String breed;
    private String age;

    @ManyToOne
    @JoinColumn(name = "guardian_id")
    private Guardian guardian;

//    @ManyToOne
//    @JoinColumn(name = "doctor_id")
//    private Doctor doctor;

    public Dog() {
    }

    public Dog(String name, String breed, String age, Guardian guardian){
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.guardian = guardian;
//        this.doctor = doctor;
//        , Guardian guardian, Doctor doctor
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

//    public Doctor getDoctor() {
//        return doctor;
//    }
//
//    public void setDoctor(Doctor doctor) {
//        this.doctor = doctor;
//    }

    public Guardian getGuardian() {
        return guardian;
    }

    public void setGuardian(Guardian guardian) {
        this.guardian = guardian;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return id.equals(dog.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
