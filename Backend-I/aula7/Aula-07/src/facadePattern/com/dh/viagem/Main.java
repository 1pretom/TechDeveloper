package facadePattern.com.dh.viagem;

import facadePattern.com.dh.viagem.model.Viagem;
import facadePattern.com.dh.viagem.service.impl.FacadeViagem;

import java.time.LocalDate;

//o método main só vai no facade pra fazer a busca
public class Main {
    public static void main(String[] args) {
        FacadeViagem facade = new FacadeViagem();

        Viagem viagem = new Viagem();

        //pesquisando pela data
        viagem = facade.buscar("Catar", LocalDate.of(2022,11,15));
        //mostrando hotel e voos
        viagem.getHoteis();
        viagem.getVoos();
    }
}
