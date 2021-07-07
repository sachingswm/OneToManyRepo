package com.example.onetomany.repositories;

import com.example.onetomany.entities.unidirectional.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectDao extends JpaRepository<Subject,Integer> {
}
