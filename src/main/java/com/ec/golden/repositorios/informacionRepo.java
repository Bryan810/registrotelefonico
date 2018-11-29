package com.ec.golden.repositorios;


import com.ec.golden.entidades.informacion.Informacion;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface informacionRepo extends MongoRepository<Informacion, String> {
    Informacion findByIdInformacion(String id);
}
