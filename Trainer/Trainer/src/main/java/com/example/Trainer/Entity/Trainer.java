package com.example.Trainer.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="trainer")
public class Trainer {
    @Id
    @Column(name="id")
    int id;

    @Column(name="name")
    String name;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="trainerdetailid")
    TrainerDetail trainerDetail;

    public Trainer(){

    }

    public Trainer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TrainerDetail getTrainerDetail() {
        return trainerDetail;
    }

    public void setTrainerDetail(TrainerDetail trainerDetail) {
        this.trainerDetail = trainerDetail;
    }

    @Override
    public String toString() {
        return "Trainer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", trainerDetail=" + trainerDetail +
                '}';
    }
}
