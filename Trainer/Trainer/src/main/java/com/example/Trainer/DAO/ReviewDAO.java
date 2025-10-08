package com.example.Trainer.DAO;

import com.example.Trainer.Entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewDAO extends JpaRepository<Review,Integer> {
}
