//service é onde guarda a regra de negócios
package facadePattern.com.dh.viagem.service.impl;

import facadePattern.com.dh.viagem.model.Hotel;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

//implementação é onde cuida da api e do facade
public class HotelAPI {
    //vai servir pra buscar os hoteis
    public List<Hotel> getHoteis (String destino, LocalDate data){
        return Arrays.asList(new Hotel(LocalDate.of(2022,11,15),"Catar","Burj Khalifa "),
                new Hotel(LocalDate.of(2022,11,14),"Catar","HalConfort"));

    }
}
