package com.ec.golden.entidades;


import lombok.Data;

@Data
public class Preferencias {

    private String nombrePref;


    protected Preferencias(){}
    public Preferencias(String nombrePref) {
        this.nombrePref = nombrePref;
    }
}
