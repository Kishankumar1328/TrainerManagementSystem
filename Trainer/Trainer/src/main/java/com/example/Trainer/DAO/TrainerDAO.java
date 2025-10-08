package com.example.Trainer.DAO;

import com.example.Trainer.Entity.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainerDAO extends JpaRepository<Trainer,Integer> {
}