package MesaGuiada;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excecao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, divisao;

        try { //Experimente
            /* No bloco try estão as instruções que podem gerar um problema.
            Os blocos try / catch nos permitem usar mais de uma captura. Dessa forma, podemos
            lidar com exceções específicas primeiro e em seguida, as mais gerais.*/
            System.out.println("Primeiro numero");
            num1 = scanner.nextInt();
            System.out.println("Segundo numero");
            num2 = scanner.nextInt();
            divisao = num1/num2;
            System.out.println("Resultado é " + divisao);

            /*O bloco catch "captura" a exceção e exibe ela de uma maneira mais amigável*/
        }catch (InputMismatchException e){ //dentro do parâmetro indica qual tipo de exception quero utilizar
        //Essa exceção acontece devido a uma entrada incorreta de valor no Scanner.
            System.err.println("Erro na entrada de dados, digite um valor inteiro." + e); //Se coloca o e no final, ele mostra o que tá dando no java
        }catch (ArithmeticException e){
            //Essa exceção acontece ao tentar dividir por 0
            System.err.println("Erro - impossível divisão por zero");
        }catch (Exception e){
            //Essa exceção é genérica e é lançada caso ocorram quaisquer outros erros pois todos herdam de Exception
            System.err.println("Erro"); //obrigatoriamente você tem que lançar o Exception
        }
    }
}
