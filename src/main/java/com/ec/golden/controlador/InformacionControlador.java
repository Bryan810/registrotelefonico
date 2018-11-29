package com.ec.golden.controlador;


import com.ec.golden.entidades.informacion.Informacion;
import com.ec.golden.repositorios.informacionRepo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Informacion")
public class InformacionControlador {

    private informacionRepo informacioRepo;

    public InformacionControlador(informacionRepo informacioRepo) {
        this.informacioRepo = informacioRepo;
    }


    @GetMapping("/Listar")
    public List<Informacion> getAll(){
        List<Informacion> info = this.informacioRepo.findAll();
        return info;
    }

    @PutMapping
    public void insert(@RequestBody Informacion informacion){
        this.informacioRepo.insert(informacion);
    }


    public void update(@RequestBody Informacion informacion){
        this.informacioRepo.save(informacion);
    }


    @DeleteMapping("/Listar/{id}")
    public void delete(@PathVariable("id") String id){
        this.informacioRepo.deleteById(id);
    }

    @GetMapping("/Listar/{id}")
    public Informacion getById(@PathVariable("id") String id){
        Informacion info =  this.informacioRepo.findByIdInformacion(id);
        return info;
    }
}
