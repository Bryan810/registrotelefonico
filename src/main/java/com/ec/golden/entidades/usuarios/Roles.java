package com.ec.golden.entidades.usuarios;


import lombok.Data;

@Data
public class Roles {
    private String role;


    protected Roles() {}

    public Roles(String role) {
        this.role = role;
    }
}
