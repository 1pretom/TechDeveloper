package model;

import interf.IFelino;
import org.apache.log4j.Logger;

public class Tigre implements IFelino {
    //atributos
    private String nome;
    private int idade;
    //atributo para o log4j
    private static final Logger logger = Logger.getLogger(Tigre.class); //sempre que o atributo é final (invés de const, é final.),
    // tem que ser final o logger é o do apache

    //construtores

    public Tigre(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
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

    @Override
    public void correr() {
        logger.info("O tigre está correndo");
    }

    @Override
    public void eMaiorQue10() throws Exception {
        if (idade > 10){
            logger.info("O tigre é maior que 10 anos");
        }
        if (idade <0){
            logger.error("A idade não pode ser negativa");
            throw new Exception();
        }
    }
}
