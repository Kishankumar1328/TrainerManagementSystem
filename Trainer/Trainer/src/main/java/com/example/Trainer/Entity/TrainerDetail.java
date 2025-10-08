package com.example.Trainer.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="trainerdetail")
public class TrainerDetail {
    @Id
    @Column(name="id")
    int id;

    @Column(name="youtube")
    String youtube;

    @Column(name="mobileno")
    int mobileno;


    TrainerDetail(){

    }
    public TrainerDetail(int id, String youtube, int mobileno) {
        this.id = id;
        this.youtube = youtube;
        this.mobileno = mobileno;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getYoutube() {
        return youtube;
    }

    public void setYoutube(String youtube) {
        this.youtube = youtube;
    }

    public int getMobileno() {
        return mobileno;
    }

    public void setMobileno(int mobileno) {
        this.mobileno = mobileno;
    }





}
