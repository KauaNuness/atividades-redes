package sptech.school.atividaderedes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import sptech.school.atividaderedes.controller.CalculadoraController;

class CalculadoraControllerTests {

    private final CalculadoraController calculadora = new CalculadoraController();

    @Test
    void testSoma() {
        assertEquals(20, calculadora.soma(15, 5));
    }

    @Test
    void testSubtracao() {
        assertEquals(8, calculadora.subtracao(12, 4));
    }

    @Test
    void testMultiplicacao() {
        assertEquals(30, calculadora.multiplicacao(6, 5));
    }

    @Test
    void testDivisao() {
        assertEquals(4, calculadora.divisao(20, 5));
    }

    @Test
    void testDivisaoPorZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> calculadora.divisao(10, 0));
        assertEquals("Não é possível dividir por zero.", exception.getMessage());
    }
}