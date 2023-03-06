package facadePattern.com.dh.viagem.service.impl;

import facadePattern.com.dh.viagem.model.Viagem;
import facadePattern.com.dh.viagem.service.IFacadeViagem;

import java.time.LocalDate;


public class FacadeViagem implements IFacadeViagem {
    private VooAPI vooAPI;
    private HotelAPI hotelAPI;

    //o construtor é criado como incluindo o new para saber o destino de onde ir buscar
    public FacadeViagem() {
        this.vooAPI = new VooAPI();
        this.hotelAPI = new HotelAPI();
    }

    //solicitando que pesquise a viagem
    @Override
    public Viagem buscar(String destino, LocalDate data) {
        Viagem viagem = new Viagem();
        viagem.setHoteis(hotelAPI.getHoteis(destino, data));
        viagem.setVoos(vooAPI.getVoos(data, destino));

        return viagem;
    }
}
