package com.example.App_gestion.Services;

import java.util.List;
import java.util.Optional;

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

    public List<negocio> getAllNegocio() {
        return negociorepository.findAll();
    }

    public Optional<negocio> getByIdNegocio(Long id){
        return negociorepository.findById(id);
    }


    public void deleteByid(Long id){
    
        negociorepository.deleteById(id);
        
        
    }


    public void saveOrUpdate(negocio mynegocio){
        negociorepository.save(mynegocio);
    }

 
 


}
