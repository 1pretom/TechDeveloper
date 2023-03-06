package com.dh.primeiraAulaSpring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller //faz uma anotação para funcionar o Controller
@ResponseBody // para informar que a resposta vem do body
@RequestMapping("/hello") //mostrando que ela faz um request mapping para definir a rota
public class HelloController {

    //quando muda pra utilizar dessa forma, ele cosegue diferenciar os métodos
    @RequestMapping(value = "/primeiro", method = RequestMethod.GET)
    public String imprime(){
        return "Hello Primeiro";
    }

    @RequestMapping(value = "/segundo", method = RequestMethod.GET)
    public String imprime2(){
        return "Hello Segundo";
    }
}
