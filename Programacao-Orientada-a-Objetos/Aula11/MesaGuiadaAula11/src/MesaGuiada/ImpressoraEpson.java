package MesaGuiada;

import java.time.LocalDate;

public class ImpressoraEpson extends Impressora{

    public ImpressoraEpson(String modelo, String tipoConexao, LocalDate dataFabricacao, int folhasDisponiveis, Double porcentagemTinta) {
        super(modelo, tipoConexao, dataFabricacao, folhasDisponiveis, porcentagemTinta);
    }

    @Override
    public String imprimir() {
        String textoImprimir = "teste";
        if (temPapel() && !precisaTinta()) {
            setFolhasDisponiveis(getFolhasDisponiveis() -1);
            setPorcentagemTinta(getPorcentagemTinta() -0.02);
            return "Imprimindo o segunte texto: " + textoImprimir;
        }else if(temPapel() && precisaTinta()){
            return "Precisa de tinta";
        }else if (!temPapel() && precisaTinta()){
            return "Precisa de tinta e papel";
        }else{
            return "Precisa de papel";
        }
    }}


