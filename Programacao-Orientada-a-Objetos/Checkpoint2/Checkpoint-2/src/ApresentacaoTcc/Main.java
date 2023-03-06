package ApresentacaoTcc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Exception para verificar as datas disponíveis
        try {
            DataDisponivelParaApresentacao dataDisponivelParaApresentacao = new DataDisponivelParaApresentacao(30, 4, 2023);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        //Instanciando classe aluno para criar convidado para essa classe
        Aluno aluno1 = new Aluno("Roberto", "Firmino", "Titulo um", true);


        //Scanner e Collection para inserir convidados
        Scanner scanner = new Scanner(System.in);
        Convidado convidado;
        List<Convidado> listaConvidados = new ArrayList<Convidado>();
        int opcao;

        do {
            System.out.println("##Lista de convidados de " + aluno1.getNome() + " " + aluno1.getSobrenome() + " Escolha uma opção abaixo:");
            System.out.println("Opção 1 - Cadastrar convidados");
            System.out.println("Opção 2 - Imprime código de cadastro de convidados");
            System.out.println("Opção 0 - Sair do programa");
            System.out.println("----------------------------");

            System.out.println("Digite aqui sua opção");
            opcao = Integer.parseInt(scanner.nextLine());

            if (opcao == 1) {
                //criando objeto convidado
                convidado = new Convidado();
                System.out.println("Digite o nome:");
                convidado.setNome(scanner.nextLine());

                System.out.println("Digite o sobrenome:");
                convidado.setSobrenome(scanner.nextLine());

                System.out.println("Digite a idade");
                convidado.setIdade(String.valueOf(Integer.parseInt(scanner.nextLine())));

                System.out.println("Digite o CPF");
                convidado.setCpf(String.valueOf(Integer.parseInt(scanner.nextLine())));

                System.out.println();

                //Guardando o objeto convidado em uma lista

                listaConvidados.add(convidado);
                System.out.println(aluno1.getNome() + ", seu/sua convidado(a) foi adicionado(a)");

            } else if (opcao == 2) {
                if (listaConvidados.isEmpty()) {
                    System.out.println("Não tem convidados cadastrados, inicie novamente e pressione 1 para adicionar");
                    scanner.nextLine();
                } else {
                    System.out.println("O código de registro do(a) convidado(a) do(a) aluno(a) " + aluno1.getNome() + " é " + listaConvidados);

                    System.out.println("Pressione uma tecla para continuar");
                    scanner.nextLine();

                }

            }


        } while (opcao != 0);
        scanner.close();

    }}


//        Scanner scanner = new Scanner(System.in);
//    String nomeSobrenome;
//    String tituloDoTcc;
//    boolean arquivoEnviado;
//        System.out.println("Insira seu nome e sobrenome");
//        nomeSobrenome = scanner.nextLine();
//        System.out.println("Insira o título do seu TCC");
//        tituloDoTcc = scanner.nextLine();
//        System.out.println("Informe se o TCC foi entregue digitando true ou false");
//        arquivoEnviado = scanner.nextBoolean();
//        if (arquivoEnviado){
//            System.out.println(nomeSobrenome + " O seu arquivo do TCC " + tituloDoTcc + " foi enviado com sucesso");
//        }else{
//            System.err.println(nomeSobrenome + " Seu arquivo precisa ser enviado");
//        }






