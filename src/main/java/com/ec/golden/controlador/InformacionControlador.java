package com.ec.golden.controlador;


import com.ec.golden.entidades.informacion.Informacion;
import com.ec.golden.repositorios.informacionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Informacion")
public class InformacionControlador {
    @Autowired
    private informacionRepo informacioRepo;

    public InformacionControlador(informacionRepo informacioRepo) {
        this.informacioRepo = informacioRepo;
    }


    @GetMapping("/Listar")
    public List<Informacion> getAll() {
        List<Informacion> info = this.informacioRepo.findAll();
        return info;
    }
//
//    @GetMapping("/Listar")
//    public String informacio(Model model) {
//        model.addAttribute("info", informacioRepo.findAll());
//        return "/webapp/Vistas/ListarInformacion";
//    }


    @PutMapping
    public void insert(@RequestBody Informacion informacion) {
        this.informacioRepo.insert(informacion);

    }


    public void update(@RequestBody Informacion informacion) {
        this.informacioRepo.save(informacion);

    }


    @DeleteMapping("/Listar/{id}")
    public void delete(@PathVariable("id") String id) {
        this.informacioRepo.deleteById(id);
    }

    @GetMapping("/Listar/{id}")
    public Informacion getById(@PathVariable("id") String id) {
        Informacion info = this.informacioRepo.findByIdInformacion(id);
        return info;
    }

    @GetMapping("/numTelefono/{numTelefono}")
    public Informacion getByNumTelefono(@PathVariable("numTelefono") String numTelefono) {
        Informacion info = this.informacioRepo.findByNumTelefono(numTelefono);
        return info;
    }


    @GetMapping("/Pais/{pais}")
    public List<Informacion> getAllByPais(@PathVariable("pais") String pais) {
        List<Informacion> info = this.informacioRepo.findByPais(pais);
        return info;
    }


    @GetMapping("/Grupo/{grupo}")
    public List<Informacion> getAllByGrupo(@PathVariable("grupo") String grupo) {
        List<Informacion> info = this.informacioRepo.findByGrupo(grupo);
        return info;
    }


    @GetMapping("/Redes/{red}")
    public List<Informacion> getAllByRedes(@PathVariable("red") String red) {
        List<Informacion> info = this.informacioRepo.findByRedes(red);
        return info;
    }

    @GetMapping("/Preferencia/{pref}")
    public List<Informacion> getAllByPreferencia(@PathVariable("pref") String pref) {
        List<Informacion> info = this.informacioRepo.findByPreferencia(pref);
        return info;
    }

    @GetMapping("/Cuentas")
    public String countCuentas() {
        Long num = this.informacioRepo.count();
        return num.toString();
    }
}
