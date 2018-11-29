package com.ec.golden.entidades;


import lombok.Data;

@Data
public class Pais {

    private String nombrePais;

    public Pais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    protected Pais(){}
}
