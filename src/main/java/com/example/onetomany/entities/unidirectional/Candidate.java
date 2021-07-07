package com.example.onetomany.entities.unidirectional;

import lombok.Setter;

import javax.persistence.*;

@Setter
@Entity
@Table(name="Candidate")
public class Candidate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
}
