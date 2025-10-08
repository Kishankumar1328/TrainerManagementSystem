package com.example.Trainer.DAO;

import com.example.Trainer.Entity.TrainerDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainerDetailDAO extends JpaRepository<TrainerDetail,Integer> {
}