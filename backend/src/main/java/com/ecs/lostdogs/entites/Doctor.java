package com.ecs.lostdogs.entites;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
@Entity
@Table(name = "tb_doctor")
public class Doctor implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @PrimaryKeyJoinColumn(name = "doctor_id")
    private Long id;
    private String name;
    private String identification;

//    @OneToMany(mappedBy = "doctor")
//    private List<Dog> dog = new ArrayList<>();

    public Doctor() {
    }

    public Doctor(String name, String identification ) {
        this.name = name;
        this.identification = identification;
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

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

//    public List<Dog> getDog() {
//        return dog;
//    }
//
//    public void addDog(Dog dog){
//        this.dog.add(dog);
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Doctor doctor)) return false;
        return getId().equals(doctor.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
