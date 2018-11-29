package com.ec.golden.entidades;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Document(collection = "Informacion")
public class Informacion {

    @Id
    private String idInformacion;
    @Indexed(direction = IndexDirection.ASCENDING)
    private Pais pais;
    private Date fechaCreacion;
    private String nombre;
    private Boolean sexo;
    private Date fechaNacimiento;
    private List<Preferencias> preferencias;
    private String numTelefono;
    @Indexed(unique = true)
    private String usuario;
    private List<RedesSociales> redes;
    private String contraseniaTW;
    private String contraseniaFB;
    private String contraseniaIG;
    private Grupo grupo;
    private String paqChip;
    private String email;
    private String contraseniaMail;
    private String fuente;
    private Date fechaRecarga;

    protected Informacion(){
        this.redes = new ArrayList<>();
    }



    public Informacion(Pais pais, Date fechaCreacion, String nombre, Boolean sexo,
                       Date fechaNacimiento, List<Preferencias> preferencias, String numTelefono, String usuario,
                       List<RedesSociales> redes, String contraseniaTW, String contraseniaFB, String contraseniaIG,
                       Grupo grupo, String paqChip, String email, String contraseniaMail, String fuente,
                       Date fechaRecarga) {
        this.pais = pais;
        this.fechaCreacion = fechaCreacion;
        this.nombre = nombre;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
        this.preferencias = preferencias;
        this.numTelefono = numTelefono;
        this.usuario = usuario;
        this.redes = redes;
        this.contraseniaTW = contraseniaTW;
        this.contraseniaFB = contraseniaFB;
        this.contraseniaIG = contraseniaIG;
        this.grupo = grupo;
        this.paqChip = paqChip;
        this.email = email;
        this.contraseniaMail = contraseniaMail;
        this.fuente = fuente;
        this.fechaRecarga = fechaRecarga;
    }
}

