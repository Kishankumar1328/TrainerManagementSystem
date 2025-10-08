package com.example.Trainer;

import com.example.Trainer.DAO.TrainerDAO;
import com.example.Trainer.Entity.Course;
import com.example.Trainer.Entity.Trainer;
import com.example.Trainer.Entity.TrainerDetail;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TrainerApplication {



    public static void main(String[] args) {
        SpringApplication.run(TrainerApplication.class, args);
    }



    @Bean
    public CommandLineRunner commandLineRunner(TrainerDAO trainerDAO) {
        return runnable -> {
            createTrainer(trainerDAO);
        };
    }

    public void createTrainer(TrainerDAO trainerDAO) {
        Trainer t1 = new Trainer(1, "kish");
        TrainerDetail td1 = new TrainerDetail(1, "techai", 638038318);

        t1.setTrainerDetail(td1);
        trainerDAO.save(t1);
    }


}