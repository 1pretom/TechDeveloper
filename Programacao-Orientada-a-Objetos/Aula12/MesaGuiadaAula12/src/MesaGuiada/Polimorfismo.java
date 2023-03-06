package MesaGuiada;

public class Polimorfismo {
    public static void main(String[] args) {
        //Relacionamento do tipo É UM. Doberman(Objeto) é um Doberman (Referência).
        //Um Doberman É DO TIPO Doberman?
        //Nesse caso não precisa de casting
        Doberman cachorro = new Doberman("Lulu", "Preto", 2);
        cachorro.latir();

        //Um Doberman (Objeto) É UM Cachorro (Referência).
        //Um Doberman É DO TIPO Cachorro?
        //Pode precisar de casting
        Cachorro cachorro1 = new Doberman("Lala", "Preto", 4);

        //Em Java todas as classes herdam de Object, portando um Doberman é um Object.
        //Um Doberman É DO TIPO Object?
        //Nesse caso precisa de casting
        Object cachorro2 = new Doberman("Scooby", "Marrom", 5);
        ((Doberman) cachorro2).latir();

        //Seria possível usar a forma abaixo? Não porque um cachorro (objeto) não
        // é um necessariamente um Doberman, além do fato de ser abstrato
        //Um cachorro É DO TIPO Doberman?
        //Doberman cachorro3 = new Cachorro();
    }
}
