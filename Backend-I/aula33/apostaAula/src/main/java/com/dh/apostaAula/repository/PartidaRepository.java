package com.dh.apostaAula.repository;

import com.dh.apostaAula.entity.Partida;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartidaRepository extends MongoRepository<Partida, Integer> {

}
