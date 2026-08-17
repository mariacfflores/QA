package calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    // =========================
    // SOMA
    // =========================

    @Test
    public void testaSoma() {
        Calculadora calc = new Calculadora();

        int resultado = calc.soma(37, 23);

        assertEquals(60, resultado);
    }

    @Test
    public void testaSomaComNumeroNegativo() {
        Calculadora calc = new Calculadora();

        int resultado = calc.soma(5, -3);

        assertEquals(2, resultado);
    }

    // =========================
    // SUBTRAÇÃO
    // =========================

    @Test
    public void testaSubtracao() {
        Calculadora calc = new Calculadora();

        int resultado = calc.subtracao(50, 7);

        assertEquals(43, resultado);
    }

    @Test
    public void testaSubtracaoComNumeroNegativo() {
        Calculadora calc = new Calculadora();

        int resultado = calc.subtracao(5, -3);

        assertEquals(8, resultado);
    }

    // =========================
    // MULTIPLICAÇÃO
    // =========================

    @Test
    public void testaMultiplicacao() {
        Calculadora calc = new Calculadora();

        int resultado = calc.multiplicacao(5, 6);

        assertEquals(30, resultado);
    }

    @Test
    public void testaMultiplicacaoPorZero() {
        Calculadora calc = new Calculadora();

        int resultado = calc.multiplicacao(10, 0);

        assertEquals(0, resultado);
    }

    // =========================
    // DIVISÃO
    // =========================

    @Test
    public void testaDivisao() {
        Calculadora calc = new Calculadora();

        int resultado = calc.divisao(40, 2);

        assertEquals(20, resultado);
    }

    @Test
    public void testaDivisaoInteira() {
        Calculadora calc = new Calculadora();

        int resultado = calc.divisao(10, 3);

        assertEquals(3, resultado);
    }

    @Test
    public void testaDivisaoPorZero() {
        Calculadora calc = new Calculadora();

        assertThrows(
            ArithmeticException.class,
            () -> calc.divisao(10, 0)
        );
    }

    // =========================
    // SOMATORIA
    // =========================

    @Test
    public void testaSomatoria() {
        Calculadora calc = new Calculadora();

        int resultado = calc.somatoria(6);

        assertEquals(21, resultado);
    }

    @Test
    public void testaSomatoriaComZero() {
        Calculadora calc = new Calculadora();

        int resultado = calc.somatoria(0);

        assertEquals(0, resultado);
    }

    @Test
    public void testaSomatoriaComNumeroNegativo() {
        Calculadora calc = new Calculadora();

        int resultado = calc.somatoria(-5);

        assertEquals(0, resultado);
    }

    // =========================
    // EH POSITIVO
    // =========================

    @Test
    public void testaEhPositivo() {
        Calculadora calc = new Calculadora();

        boolean resultado = calc.ehPositivo(12);

        assertTrue(resultado);
    }

    @Test
    public void testaEhPositivoComZero() {
        Calculadora calc = new Calculadora();

        boolean resultado = calc.ehPositivo(0);

        assertTrue(resultado);
    }

    @Test
    public void testaEhPositivoComNumeroNegativo() {
        Calculadora calc = new Calculadora();

        boolean resultado = calc.ehPositivo(-10);

        assertFalse(resultado);
    }

    // =========================
    // COMPARA
    // =========================

    @Test
    public void testaComparaMenor() {
        Calculadora calc = new Calculadora();

        int resultado = calc.compara(8, 15);

        assertEquals(-1, resultado);
    }

    @Test
    public void testaComparaMaior() {
        Calculadora calc = new Calculadora();

        int resultado = calc.compara(15, 8);

        assertEquals(1, resultado);
    }

    @Test
    public void testaComparaIgual() {
        Calculadora calc = new Calculadora();

        int resultado = calc.compara(8, 8);

        assertEquals(0, resultado);
    }
}