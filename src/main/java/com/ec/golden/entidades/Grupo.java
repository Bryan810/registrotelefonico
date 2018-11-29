package com.ec.golden.entidades;


import lombok.Data;

@Data
public class Grupo {

    private String nombreGrupo;


    protected Grupo(){}
    public Grupo(String nombreGrupo) {
        this.nombreGrupo = nombreGrupo;
    }
}
