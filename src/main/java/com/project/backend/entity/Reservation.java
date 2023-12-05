package com.project.backend.entity;


import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table( name = "Reservation")
public class Reservation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idReservation")
    private long  idReservation;
    private boolean estValide;
    @Temporal(TemporalType.DATE)
    private Date anneeUniversitaire;
}