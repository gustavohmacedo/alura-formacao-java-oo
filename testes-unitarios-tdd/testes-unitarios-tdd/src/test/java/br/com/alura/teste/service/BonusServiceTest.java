package br.com.alura.teste.service;

import br.com.alura.tdd.modelo.Funcionario;
import br.com.alura.tdd.service.BonusService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class BonusServiceTest {

    private BonusService service;

    @BeforeEach
    public void start() {
        this.service = new BonusService();
    }

    @Test
    public void bonusDeveriaLancarExceptionParaFuncionarioComSalarioMaiorQue10000() {
        assertThrows(IllegalArgumentException.class, () ->
                service.calcularBonus(new Funcionario("Gustavo", LocalDate.now(),
                        new BigDecimal("25000"))));

    }

    @Test
    public void bonusDeveriaSerDezPorCentoDoSalario() {
        BigDecimal bonus = service.calcularBonus(new Funcionario("Gustavo", LocalDate.now(),
                new BigDecimal("2500")));

        Assertions.assertEquals(new BigDecimal("250.00"), bonus);

    }

    @Test
    public void bonusDeveriaSerDezPorCentoParaSalarioDe10000() {
        BigDecimal bonus = service.calcularBonus(new Funcionario("Gustavo", LocalDate.now(),
                new BigDecimal("10000")));

        Assertions.assertEquals(new BigDecimal("1000.00"), bonus);

    }
}
