package com.dh.treiner.controller;

import com.dh.treiner.model.Trainer;
import com.dh.treiner.service.impl.TrainerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/trainer")
public class TrainerController {

    @Autowired //com essa anotação, o java consegue dar um new nessa classe, ele instancia a classe pra nós
    private TrainerServiceImpl trainerService;

//    @RequestMapping (value = "/listar", method = RequestMethod.GET) // jeito ultrapassado de fazer
    @GetMapping (value = "/listar") //jeito normal de fazer
    public List<Trainer> getTrainer(){
        return trainerService.listTrainer();
    }
}
