package com.example.onetomany.repositories;

import com.example.onetomany.entities.bidirectional.PhoneNumber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhoneNumberDao extends JpaRepository<PhoneNumber,Integer> {
}
