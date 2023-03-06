package facadePattern.com.dh.viagem.service;

import facadePattern.com.dh.viagem.model.Viagem;

import java.time.LocalDate;

//Interface para implementar o método Facade com as buscas
public interface IFacadeViagem {


    //solicitando que pesquise a viagem
    Viagem buscar(String destino, LocalDate data);
}
