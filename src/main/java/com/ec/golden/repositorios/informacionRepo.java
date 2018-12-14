package com.ec.golden.repositorios;


import com.ec.golden.entidades.informacion.Informacion;
import com.ec.golden.entidades.informacion.Pais;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface informacionRepo extends MongoRepository<Informacion, String> {
    Informacion findByIdInformacion(String id);
    Informacion findByNumTelefono(String numTelefono);

    @Query(value = "{'pais.nombrePais':?0}" )
    List<Informacion> findByPais(String pais);

    @Query(value = "{'grupo.nombreGrupo':?0}" )
    List<Informacion> findByGrupo(String grupo);


    @Query(value = "{'redes.nombreRedSocial':?0}" )
    List<Informacion> findByRedes(String red);

    @Query(value = "{'preferencias.nombrePref':?0}" )
    List<Informacion> findByPreferencia(String pref);
}
