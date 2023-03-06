package FabridaDeRefri;

public class RefrigeranteFactory{

    public Refrigerante fazerRefrigerante(String tipo){

        Refrigerante regri = null;

        if(tipo.equals("K")){
        return new RefriCola();

    }else if(tipo.equals("L")){
        return new RefriLaranja();
    }else return null;
}}

