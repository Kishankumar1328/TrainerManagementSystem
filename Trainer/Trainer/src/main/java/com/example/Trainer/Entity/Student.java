package com.example.Trainer.Entity;

import jakarta.persistence.*;
import org.hibernate.engine.internal.Cascade;

@Entity
@Table(name="student")
public class Student {
    @Id
    @Column(name="id")
    int id;
    @Column(name="name")
    String name;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="courseid")
    Course course;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="trainerid")
    Trainer trainer;



    public Student(){

    }
    public Student(int id, String name) {
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

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", course=" + course +
                ", trainer=" + trainer +
                '}';
    }
}
