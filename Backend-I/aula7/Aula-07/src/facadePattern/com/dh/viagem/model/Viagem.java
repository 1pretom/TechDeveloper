package facadePattern.com.dh.viagem.model;

import facadePattern.com.dh.viagem.service.impl.HotelAPI;

import java.util.ArrayList;
import java.util.List;

public class Viagem {
    //atributos
    private List<Voo> voos = new ArrayList<>(); //lista de voos
    private List<Hotel> hoteis = new ArrayList<>(); //lista de hoteis

    //construtores

    public Viagem(List<Voo> voos, List<Hotel> hoteis) {
        this.voos = voos;
        this.hoteis = hoteis;
    }

    public Viagem(){

    }

    //getters e setters

    //percorrendo voos
    public void getVoos() {
        for (Voo voo : voos){
            System.out.println("-----------------");
            System.out.println(voo.getDestino());
            System.out.println(voo.getDataVoo());
            System.out.println(voo.getCompanhia());

        }
    }

    public void setVoos(List<Voo> voos) {
        this.voos = voos;
    }

    //percorrendo hoteis
    public void getHoteis() {
        for (Hotel hotel : this.hoteis){
            System.out.println("-----------------");
            System.out.println(hotel.getNomeHotel());
            System.out.println(hotel.getData());
            System.out.println(hotel.getDestino());
        }


    }

    public void setHoteis(List<Hotel> hoteis) {
        this.hoteis = hoteis;
    }
}

