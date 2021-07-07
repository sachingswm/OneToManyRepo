package com.example.onetomany.repositories;

import com.example.onetomany.entities.bidirectional.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonDao extends JpaRepository<Person,Integer> {
}
