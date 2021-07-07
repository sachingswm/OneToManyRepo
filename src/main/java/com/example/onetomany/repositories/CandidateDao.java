package com.example.onetomany.repositories;

import com.example.onetomany.entities.unidirectional.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateDao extends JpaRepository<Candidate,Integer> {
}
