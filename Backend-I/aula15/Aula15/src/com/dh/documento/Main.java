package com.dh.documento;

import com.dh.documento.model.Cachorro;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Cachorro> listCaoSave = new ArrayList<>();
        Cachorro pluto = new Cachorro(10, "Pluto");
        Cachorro muttley = new Cachorro(12,"Muttley");
        Cachorro coragem = new Cachorro(13,"Coragem");

        listCaoSave.add(pluto);
        listCaoSave.add(muttley);
        listCaoSave.add(coragem);

        //começando a salvar a lista no arquivo, saindo do programa e entrando no arquivo
        FileOutputStream arquivo1 = null;

        //precisa colocar um try catch pro caso de dar algum erro na aplicação
        try{
            arquivo1 = new FileOutputStream("Cachorro.txt"); //passando qual o arquivo (como se fosse o caderno)
            ObjectOutputStream caneta1 = new ObjectOutputStream(arquivo1);//passando o que vai ter no arquivo (como se fosse a caneta)

            caneta1.writeObject(listCaoSave);//passando o que vai escrever(como se fossem as palavras)

        }catch(Exception e){
            e.printStackTrace();
        }


        //Começando a recuperar os animais
        List<Cachorro> listaCaoFind = new ArrayList<>();
        FileInputStream arquivo2;

        try{
            arquivo2 = new FileInputStream("Cachorro.txt");
            ObjectInputStream leitor = new ObjectInputStream(arquivo2);//leitor do objeto

            listaCaoFind = (ArrayList) leitor.readObject(); //convertendo o objeto em lista, fazendo um casting


        }catch(Exception e){
            e.printStackTrace();
        }

        for (Cachorro cachorro : listaCaoFind) //percorrendo para buscar o cachorro na lista já convertida
            System.out.println("O nome do cachorro é: " + cachorro.getNome()+ " e idade é " + cachorro.getIdade());
    }


}