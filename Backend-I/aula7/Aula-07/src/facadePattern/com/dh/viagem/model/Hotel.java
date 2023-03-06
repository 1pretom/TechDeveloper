package facadePattern.com.dh.viagem.model;

import java.time.LocalDate;

public class Hotel {
    //atributos
    private LocalDate data;
    private String destino;
    private String nomeHotel;


    //construtores

    public Hotel(LocalDate data, String destino, String nomeHotel) {
        this.data = data;
        this.destino = destino;
        this.nomeHotel = nomeHotel;
    }


    //getters e setters

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getNomeHotel() {
        return nomeHotel;
    }

    public void setNomeHotel(String nomeHotel) {
        this.nomeHotel = nomeHotel;
    }
}
