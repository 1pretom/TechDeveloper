package facadePattern.com.dh.viagem.model;

import java.time.LocalDate;

public class Voo {
    //atributos
    private LocalDate dataVoo;
    private String destino;

    private String companhia;

    //construtores

    public Voo(LocalDate dataVoo, String destino, String companhia) {
        this.dataVoo = dataVoo;
        this.destino = destino;
        this.companhia = companhia;
    }


    //getters e setters

    public LocalDate getDataVoo() {
        return dataVoo;
    }

    public void setDataVoo(LocalDate dataVoo) {
        this.dataVoo = dataVoo;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getCompanhia() {
        return companhia;
    }

    public void setCompanhia(String companhia) {
        this.companhia = companhia;
    }
}
