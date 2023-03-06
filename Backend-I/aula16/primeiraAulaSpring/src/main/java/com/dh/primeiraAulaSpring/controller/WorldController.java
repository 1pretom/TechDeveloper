package com.dh.primeiraAulaSpring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController //dessa forma aqui, só precisa usar uma anotação para funcionar o Controller
@RequestMapping("/world")
public class WorldController {

    @RequestMapping(method = RequestMethod.GET) //método é chamado quando é feito esse request
    public String imprime(){
        return "World";
    }
}
