package com.example.App_gestion.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.App_gestion.Entities.negocio;
import com.example.App_gestion.Services.negocioservice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping(path = "/api/v1/negocio")
public class controllernegocio {

    @Autowired
    private negocioservice negocioservice;

    @GetMapping
    public List<negocio> getAll() {
        return negocioservice.getAllNegocio();

    }
    
    @GetMapping ("{Idnegocio}")
    public Optional<negocio> getByIdAll(@PathVariable("Idnegocio") Long Idnegocio) {
        return negocioservice.getByIdNegocio(Idnegocio);

    }
   
   @DeleteMapping("{Idnegocio}")
   public void deletebyId(@PathVariable("Idnegocio") Long Idnegocio){
    negocioservice.deleteByid(Idnegocio);
   }
    
   @PostMapping
   public void saveOrUpdate(@RequestBody negocio mynegocio){
      negocioservice.saveOrUpdate(mynegocio);
   }

}
