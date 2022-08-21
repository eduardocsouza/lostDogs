package com.ecs.lostdogs.entites;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "tb_guardian")
public class Guardian implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @PrimaryKeyJoinColumn(name = "guardian_id")
    private Long id;
    private String name;
    private String number;

    @OneToMany(mappedBy = "guardian")
    private List<Dog> dog = new ArrayList<>();

    public Guardian() {
    }

    public Guardian(String name, String number) {
        this.name = name;
        this.number = number;
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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public List<Dog> getDog() { return dog; }

    public void addDog(Dog dog){
        this.dog.add(dog);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Guardian guardian)) return false;
        return getId().equals(guardian.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
