package vacinacaoProxyPattern;
//classes abstratas herdamos, interfaces implementamos

import java.util.Date;

//classe
public class ServicoVacinar implements Vacinar{

    //método obrigatório para informar a data
    @Override
    public void vacinarPessoa(Pessoa pessoa){
        System.out.println("Usuário(a) " +pessoa.getNome()+ " " +pessoa.getRg()+ " vacinado(a) em " +new Date()+ " com sucesso");
    }


}
