package br.com.alura.teste.service;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;
import br.com.alura.tdd.service.ReajusteService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

  /*
        O sistema deve permitir que os funcionários recebam um reajuste salarial anual baseado em seu desempenho,
        obedecendo às seguintes regras:
        Se o desempenho for classificado como "A desejar", o reajuste será de 3% do salário atual.
        Se o desempenho for "Bom,", o reajuste será de 15% do salário.
        Se o desempenho for "Ótimo", o reajuste será de 20% do salário.
        */

public class ReajusteServiceTest {

    private ReajusteService service;
    private Funcionario funcionario;

    @BeforeEach
    public void start() {
        System.out.println("Teste iniciado!");
        this.service = new ReajusteService();
        this.funcionario = new Funcionario("Ana", LocalDate.now(), new BigDecimal("1000.00"));
    }

    @AfterEach
    public void theEnd(){
        System.out.println("Fim de Teste!");
    }

    @Test
    public void ReajusteDeveriaSerTresPorCentoQuandoDesepenhoForADesejar() {

        service.concederReajuste(funcionario, Desempenho.A_DESEJAR);
        Assertions.assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());

    }

    @Test
    public void ReajusteDeveriaSerQuinzePorCentoQuandoDesepenhoForBom() {

        service.concederReajuste(funcionario, Desempenho.BOM);
        Assertions.assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());

    }

    @Test
    public void ReajusteDeveriaSerVintePorCentoQuandoDesepenhoForOtimo() {

        service.concederReajuste(funcionario, Desempenho.OTIMO);
        Assertions.assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());

    }
}
