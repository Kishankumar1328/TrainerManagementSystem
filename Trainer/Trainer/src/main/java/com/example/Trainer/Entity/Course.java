package com.example.Trainer.Entity;
import jakarta.persistence.*;
import org.hibernate.engine.internal.Cascade;
import java.util.List;
import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "course")
public class Course {

    @Id
    @Column(name = "id")
    int id;

    @Column(name = "coursename")
    String coursename;



    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "trainerdetail")
    List<TrainerDetail> trainerDetails = new ArrayList<>();

    public Course() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public List<TrainerDetail> getTrainerDetails() {
        return trainerDetails;
    }

    public void setTrainerDetails(List<TrainerDetail> trainerDetails) {
        this.trainerDetails = trainerDetails;
    }

    public Course(int id, String coursename) {
        this.id = id;
        this.coursename = coursename;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", coursename='" + coursename + '\'' +
                ", trainerDetails=" + trainerDetails +
                '}';
    }
}

