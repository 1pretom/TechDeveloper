package ApresentacaoTcc;

import static java.lang.System.out;

public class Convidado extends Pessoa{
    private String convite;
    private boolean documentoEntregue;

    public Convidado(String nome, String sobrenome, String convite, boolean documentoEntregue) {
        super(nome, sobrenome);
        this.convite = convite;
        this.documentoEntregue = documentoEntregue;
    }

    @Override
    public void estarPresente(String presente) {
        if (presente.equals("Sim")) {
            out.println("está presente");
        }else {
            out.println("Ausente");
        }
    }

    public String getConvite() {
        return convite;
    }

    public void setConvite(String convite) {
        this.convite = convite;
    }

    public boolean isDocumentoEntregue() {
        return documentoEntregue;
    }

    public void setDocumentoEntregue(boolean documentoEntregue) {
        this.documentoEntregue = documentoEntregue;
    }
}
