package vacinacaoProxyPattern;

import java.util.Date;

//classe
public class ServicoVacinarProxy implements Vacinar{

    //Método obrigatório
    @Override
    public void vacinarPessoa(Pessoa pessoa) {
        if (pessoa.getDataLiberacaoVacina().after(new Date(2022,10,20))){
            new ServicoVacinar().vacinarPessoa(pessoa);
        }else {
            System.out.println("Usuário " + pessoa.getNome() + " " + pessoa.getSobrenome()+ " ainda não pode ser vacinado");
        }
    }
}
