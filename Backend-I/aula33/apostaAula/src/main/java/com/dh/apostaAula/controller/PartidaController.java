package com.dh.apostaAula.controller;


import com.dh.apostaAula.entity.Partida;
import com.dh.apostaAula.service.PartidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/partida")
public class PartidaController {
    @Autowired
    private PartidaService service;

    @PostMapping
    public ResponseEntity salvar(@RequestBody Partida partida){
        return service.salvar(partida);
    }
    @GetMapping
    public ResponseEntity buscarTodos(){
        return service.buscarTodos();
    }
}
