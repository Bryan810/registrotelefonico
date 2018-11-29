package com.ec.golden.entidades.usuarios;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "Usuarios")
public class Usuario {
    @Id
    private String idUsuario;
    @Indexed(direction = IndexDirection.ASCENDING)
    private String usuario;
    private String nombre;
    private String apellido;
    private String clave;
    private Roles rol;

    public Usuario(String usuario, String nombre, String apellido, String clave, Roles rol) {
        this.usuario = usuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.clave = clave;
        this.rol = rol;
    }

    public Usuario() {
    }

    public Usuario (Usuario usr){
        this.usuario = usuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.clave = clave;
        this.rol = rol;
    }
}
