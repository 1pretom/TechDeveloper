package test.com.dh.medicamento.service;

import com.dh.farmacia.model.Medicamento;
import com.dh.farmacia.service.MedicamentoService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;


class MedicamentoServiceTest {

    MedicamentoService medicamentoService;

    @BeforeEach
    void doBefore (){
        medicamentoService = new MedicamentoService();
    }

    @Test
    public void guargarMedicamento() throws SQLException {
        Medicamento medicamento = new Medicamento();
        medicamento.setPreco(30.50);
        medicamento.setQuantidade(10);
        medicamento.setLaboratorio("ACHE");
        medicamento.setNome("Ibuprofeno");

        medicamentoService.salvar(medicamento);

        Assertions.assertTrue(medicamento.getId() > 0);
        System.out.println(medicamento.getId());
    }

}