package com.ec.golden.entidades.informacion;


import lombok.Data;

@Data
public class Preferencias {

    private String nombrePref;


    protected Preferencias(){}
    public Preferencias(String nombrePref) {
        this.nombrePref = nombrePref;
    }
}
