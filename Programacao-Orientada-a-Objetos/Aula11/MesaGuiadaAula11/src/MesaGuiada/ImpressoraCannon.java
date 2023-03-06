package MesaGuiada;

import java.time.LocalDate;

public class ImpressoraCannon extends Impressora{

    public ImpressoraCannon(String modelo, String tipoConexao, LocalDate dataFabricacao, int folhasDisponiveis, Double porcentagemTinta) {
        super(modelo, tipoConexao, dataFabricacao, folhasDisponiveis, porcentagemTinta);
    }

    @Override
    public String imprimir() {

        if (temPapel() && !precisaTinta()) {
            setFolhasDisponiveis(getFolhasDisponiveis() -1);
            setPorcentagemTinta(getPorcentagemTinta() -0.07);
            return "Imprimindo";
        }else if(temPapel() && precisaTinta()){
            return "Precisa de tinta";
        }else if (!temPapel() && precisaTinta()){
            return "Precisa de tinta e papel";
        }else{
            return "Precisa de papel";
        }
    }
    //Essa situação é hipotética e poucas vezes vai acontecer
    //Nesse cenário abaixo eu não quero modificar o método então ao usar super. estou
    //dizendo que ele permanece como o da classe pai
    //quando o JAVA pega "super.algumaCoisa" ele replica o funcionamento do pai
    @Override
    public boolean precisaTinta() {
        return super.precisaTinta();
    }
}
