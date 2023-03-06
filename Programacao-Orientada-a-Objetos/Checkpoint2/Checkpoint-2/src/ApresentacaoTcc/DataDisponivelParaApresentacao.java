package ApresentacaoTcc;

public class DataDisponivelParaApresentacao {
    private Integer dia, mes, ano ;


    //Criando construtores
    public DataDisponivelParaApresentacao(Integer dia, Integer mes, Integer ano) throws Exception{
       //Fazendo exceções
        if (dia < 1 || dia > 31 || mes < 1 || mes > 12 ){
            throw new Exception("Os valores de data são inválidos.");
        }else if (mes == 4 && dia > 30 || mes == 6 && dia > 30 || mes == 9 && dia > 30 || mes == 11 && dia > 30 ){
            throw new Exception("Esse mês tem 30 dias, não 31");
        }else if (ano < 2022){
            throw new Exception("Insira um ano maior que " + ano);
        } else if (mes == 2 && dia > 28) {
            throw new Exception("Fevereiro tem 28 dias");
        }

        this.dia = dia;
        this.mes = mes;
        this.ano = ano;


    }




    //Getters e Setters
    public Integer getDia() {
        return dia;
    }

    public void setDia(Integer dia) {
        this.dia = dia;
    }

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }


}
