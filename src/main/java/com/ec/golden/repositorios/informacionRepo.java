package com.ec.golden.repositorios;


import com.ec.golden.entidades.Informacion;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface informacionRepo extends MongoRepository<Informacion, String> {
    Informacion findByIdInformacion(String id);
}
