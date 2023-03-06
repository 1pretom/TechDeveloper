package TemplateMethidPattern;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FuncionarioTest {
  @Test
  void contratado(){
    Contratado contratado = new Contratado("João", "Das Flores", "8797-78",
            "Conta Corrente", 100, 350);

    contratado.pagamentoDeSalario();

  }

  @Test
  void efetivo(){
    Efetivo efetivo = new Efetivo("Maria", "Cleite", "2133-56",
            "Conta Corrente", 10000, 4000, 3000);

    efetivo.pagamentoDeSalario();

  }
}