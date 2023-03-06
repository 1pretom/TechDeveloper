package com.dh.treiner.service.impl;

import com.dh.treiner.model.Trainer;
import com.dh.treiner.service.ITrainerService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service //devemos explicar pro spring boot que essa classe é um service pois estamos usando MVC
// e quando formos pro controller, tem a injeção de dependencia, que o java só consegue fazer de classes bins
//classes bins são classes gerenciadas pelo spring boot, que são as classes com anotações
//e então não precisa ser feita a instanciação da classe, é feita a injeção de dependencia
public class TrainerServiceImpl implements ITrainerService {

    @Override
    public List<Trainer> listTrainer() {
        return Arrays.asList(new Trainer("Marcos"), new Trainer("Ana"));
    }
}
