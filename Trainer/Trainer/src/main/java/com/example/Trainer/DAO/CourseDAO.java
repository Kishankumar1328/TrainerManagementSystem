package com.example.Trainer.DAO;

import com.example.Trainer.Entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDAO extends JpaRepository<Course,Integer> {
}
