package com.example.onetomany.entities.unidirectional;

import lombok.Setter;

import javax.persistence.*;

@Setter
@Entity
@Table(name="Subject")
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="candidate_id",referencedColumnName = "id")
    private Candidate candidate;
}
