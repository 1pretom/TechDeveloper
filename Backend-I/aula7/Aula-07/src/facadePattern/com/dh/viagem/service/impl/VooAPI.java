package facadePattern.com.dh.viagem.service.impl;

import facadePattern.com.dh.viagem.model.Hotel;
import facadePattern.com.dh.viagem.model.Voo;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class VooAPI {
    //vai servir pra buscar os voos
    public List<Voo> getVoos (LocalDate data, String destino){
        return Arrays.asList(new Voo(LocalDate.of(2022,11,15),"Catar","GOL"),
                new Voo(LocalDate.of(2022,11,14),"Catar","EMIRATES"));
    }
}
