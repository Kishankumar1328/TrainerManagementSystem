package com.example.Trainer.Entity;

import jakarta.persistence.*;
import org.hibernate.engine.internal.Cascade;

@Entity
@Table(name="review")
public class Review {
    @Id
    @Column(name="id")
    int id;

    @Column(name="description")
    String description;



    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="studentid")
    Student student;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="trainerid")
    Trainer trainer;



    public Review() {

    }

    public Review(int id, String description) {
        this.id = id;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    @Override
    public String toString() {
        return "Review{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", student=" + student +
                ", trainer=" + trainer +
                '}';
    }
}
