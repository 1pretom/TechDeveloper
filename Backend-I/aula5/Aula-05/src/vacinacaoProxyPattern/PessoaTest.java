package vacinacaoProxyPattern;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;


//Classe para teste
class PessoaTest {

    @Test
    void vacinar1(){
        Date data = new Date(2022,10,19);
        Pessoa pessoa = new Pessoa("João", "Carlos", "5456474760", "pfizer", data);
        new ServicoVacinarProxy().vacinarPessoa(pessoa);
    }
    @Test
    void vacinar2(){
        Date data = new Date(2022,11,04);
        Pessoa pessoa = new Pessoa("Maria", "Souza", "1254791069", "coronavac", data);
        new ServicoVacinarProxy().vacinarPessoa(pessoa);
    }



}