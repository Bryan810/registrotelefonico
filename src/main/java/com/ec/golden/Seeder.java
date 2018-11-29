package com.ec.golden;

import com.ec.golden.entidades.*;
import com.ec.golden.repositorios.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

@Component
public class Seeder implements CommandLineRunner {
    private informacionRepo infoRepo;


    public Seeder(informacionRepo infoRepo) {
        this.infoRepo = infoRepo;
    }


    @Override
    public void run(String... args) throws Exception {
        Informacion info = new Informacion(
                new Pais("Ecuador"),
                new Date(),
                "Bryan",
                true,
                new GregorianCalendar(1992, 07, 20).getTime(),
                Arrays.asList(
                        new Preferencias("Rock"),
                        new Preferencias("Tatuajes")
                ),
                "0984623854",
                "@Bryan810",
                Arrays.asList(
                        new RedesSociales("Twitter")
                ),
                "Contraseña",
                "Contraseña2",
                "Contraseña3",
                new Grupo("Limpieza"),
                "A1",
                "pruebaa123@hotmail.com",
                "ContraseñaMail",
                "http://twitter.com/acavaunaurl",
                new Date()
        );



        Informacion info1 = new Informacion(
                new Pais("Ecuador"),
                new Date(),
                "Bryan",
                true,
                new GregorianCalendar(1992, 07, 20).getTime(),
                Arrays.asList(
                        new Preferencias("Rock"),
                        new Preferencias("Tatuajes")
                ),
                "0984623854",
                "@Bryan8101",
                Arrays.asList(
                        new RedesSociales("Twitter")
                ),
                "Contraseña",
                "Contraseña2",
                "Contraseña3",
                new Grupo("Limpieza"),
                "A1",
                "pruebaa123@hotmail.com",
                "ContraseñaMail",
                "http://twitter.com/acavaunaurl",
                new Date()
        );

//        //Elimino todos los registros
//        this.infoRepo.deleteAll();
//        //agrego los registros
//        List<Informacion> infoAdd= Arrays.asList(info,info1);
//        this.infoRepo.saveAll(infoAdd);

    }
}
