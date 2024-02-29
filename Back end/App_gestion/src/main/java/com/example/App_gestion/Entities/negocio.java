package com.example.App_gestion.Entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

import java.io.Serializable;


@jakarta.persistence.Entity
@Table(name = "negocio")
public class negocio implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "negocio_sequence")
    @SequenceGenerator(name = "negocio_sequence", sequenceName = "negocio_sequence", allocationSize = 100)
    private Long id;
    private String nombre;

}