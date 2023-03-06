package Singleton;

public class FabricaDeCarro {

    protected int totalCarrosFiat;
    protected int totalCarrosFord;
    protected int totalCarrosVolks;

    public String criarCarroVolks() {
        return new String("Carro Volks #" + totalCarrosVolks++ + " criado.");
    }

    public String criarCarroFord() {
        return new String("Carro Ford #" + totalCarrosFord++ + " criado.");
    }

    public String criarCarroFiat() {
        return new String("Carro Fiat #" + totalCarrosFiat++ + " criado.");
    }


    public String gerarRelatorio() {

        return new String("Total de carros Fiat vendidos: " + totalCarrosFiat
                + "\nTotal de carros Ford vendidos: " + totalCarrosFord
                + "\nTotal de carros Volks vendidos: " + totalCarrosVolks);
    }

    public int getTotalCarrosFiat() {
        return totalCarrosFiat;
    }

    public void setTotalCarrosFiat(int totalCarrosFiat) {
        this.totalCarrosFiat = totalCarrosFiat;
    }

    public int getTotalCarrosFord() {
        return totalCarrosFord;
    }

    public void setTotalCarrosFord(int totalCarrosFord) {
        this.totalCarrosFord = totalCarrosFord;
    }

    public int getTotalCarrosVolks() {
        return totalCarrosVolks;
    }

    public void setTotalCarrosVolks(int totalCarrosVolks) {
        this.totalCarrosVolks = totalCarrosVolks;
    }
}


