package com.example.App_gestion.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
// import javax.transaction.Transactional;

import com.example.App_gestion.Entities.negocio;
import com.example.App_gestion.repository.negociorepository;

@Service
// @Transactional
public class negocioservice {
   
    @Autowired
    negociorepository negociorepository;


    public List<negocio> getNegocio(){
        return negociorepository.findAll();
    }
}
