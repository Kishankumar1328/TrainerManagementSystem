package com.example.Trainer.DAO;

import com.example.Trainer.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDAO extends JpaRepository<Student,Integer> {
}
