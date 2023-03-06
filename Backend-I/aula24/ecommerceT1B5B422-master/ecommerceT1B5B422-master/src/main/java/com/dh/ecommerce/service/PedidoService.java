package com.dh.ecommerce.service;

import com.dh.ecommerce.entity.Pedido;
import com.dh.ecommerce.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {
    @Autowired
    PedidoRepository repository;
    public ResponseEntity salvar(Pedido pedido) {
        try{
            Pedido pedidoSalvo = repository.save(pedido);
            return new ResponseEntity(pedidoSalvo, HttpStatus.CREATED);

        }catch (Exception e){
            return new ResponseEntity("Não foi possível saolar pedido",HttpStatus.BAD_REQUEST);
        }
    }

    public ResponseEntity buscarTodos() {
        List<Pedido> listPedidos = repository.findAll();
        if (listPedidos.isEmpty()){
            return new ResponseEntity("nenhum pedido cadastrado",HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity(listPedidos,HttpStatus.OK);
    }
}
