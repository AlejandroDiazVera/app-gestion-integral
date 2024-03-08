package com.example.App_gestion.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.App_gestion.Entities.negocio;

@Repository
public interface negociorepository extends JpaRepository<negocio, Long> {
  
}
