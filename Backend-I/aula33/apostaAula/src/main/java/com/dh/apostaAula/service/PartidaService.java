package com.dh.apostaAula.service;

import com.dh.apostaAula.entity.Partida;
import com.dh.apostaAula.repository.PartidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class PartidaService {
    @Autowired
    private PartidaRepository repository;
    public ResponseEntity salvar(Partida partida){
        try{
            repository.save(partida);
            return new ResponseEntity("Partida salva com sucesso", HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity("Erro ao salvar partida", HttpStatus.BAD_REQUEST);
        }
    }
    public ResponseEntity buscarTodos(){
        return new ResponseEntity(repository.findAll(),HttpStatus.OK);
    }
}
