package com.ec.golden.entidades.informacion;

import lombok.Data;

@Data
public class RedesSociales {

    private String nombreRedSocial;


    protected RedesSociales() {
    }

    public RedesSociales(String nombreRedSocial) {
        this.nombreRedSocial = nombreRedSocial;
    }
}
