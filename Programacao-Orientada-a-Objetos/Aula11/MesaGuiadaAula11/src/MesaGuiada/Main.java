package MesaGuiada;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        ImpressoraCannon impressoraCannon = new ImpressoraCannon("Cannon","USB", LocalDate.now(), 10, 100.00 );
        System.out.println("Impressora " + impressoraCannon.imprimir());
        ImpressoraEpson impressoraEpson = new ImpressoraEpson("Epson", "USB", LocalDate.now(), 10, 100.00);
        System.out.println("Impressora " + impressoraEpson.imprimir());

    }
}
