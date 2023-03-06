package model;

import interf.IFelino;
import org.apache.log4j.Logger;

public class Leao implements IFelino {
    //atributos
    private String nome;
    private int idade;
    private boolean eAlfa;

    //atributo para o log4j
    private static final Logger logger = Logger.getLogger(Leao.class); //sempre que o atributo é final (invés de const, é final.),
                                                                 // tem que ser final o logger é o do apache

    //construtores

    public Leao(String nome, int idade, boolean eAlfa) {
        this.nome = nome;
        this.idade = idade;
        this.eAlfa = eAlfa;
    }

    //getters e setters


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean iseAlfa() {
        return eAlfa;
    }

    public void seteAlfa(boolean eAlfa) {
        this.eAlfa = eAlfa;
    }

    //Método puxado da implementação
    @Override
    public void correr() {
        logger.info("O leão " + nome+ " está correndo");//para chamar o logger
    }
    @Override
    public void eMaiorQue10() throws Exception {
        if (idade > 10 && iseAlfa()){
            logger.info("O leão " +nome+ " é maior que 10 anos");
        }
        if (idade <0){
            logger.error("A idade não pode ser negativa");
            throw new Exception();
        }
    }
}
