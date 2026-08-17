package calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    @Test
    public void testaSoma() {
        Calculadora calc = new Calculadora();

        assertEquals(60, calc.soma(37, 23));
    }

    @Test
    public void testaSomaComNumeroNegativo() {
        Calculadora calc = new Calculadora();

        assertEquals(2, calc.soma(5, -3));
    }

    @Test
    public void testaSubtracao() {
        Calculadora calc = new Calculadora();

        assertEquals(43, calc.subtracao(50, 7));
    }

    @Test
    public void testaSubtracaoComNumeroNegativo() {
        Calculadora calc = new Calculadora();

        assertEquals(8, calc.subtracao(5, -3));
    }

    @Test
    public void testaMultiplicacao() {
        Calculadora calc = new Calculadora();

        assertEquals(30, calc.multiplicacao(5, 6));
    }

    @Test
    public void testaMultiplicacaoPorZero() {
        Calculadora calc = new Calculadora();

        assertEquals(0, calc.multiplicacao(10, 0));
    }

    @Test
    public void testaDivisao() {
        Calculadora calc = new Calculadora();

        assertEquals(20, calc.divisao(40, 2));
    }

    @Test
    public void testaDivisaoInteira() {
        Calculadora calc = new Calculadora();

        assertEquals(3, calc.divisao(10, 3));
    }

    @Test
    public void testaDivisaoPorZero() {
        Calculadora calc = new Calculadora();

        assertThrows(
            ArithmeticException.class,
            () -> calc.divisao(10, 0)
        );
    }

    @Test
    public void testaSomatoria() {
        Calculadora calc = new Calculadora();

        assertEquals(21, calc.somatoria(6));
    }

    @Test
    public void testaSomatoriaComZero() {
        Calculadora calc = new Calculadora();

        assertEquals(0, calc.somatoria(0));
    }

    @Test
    public void testaSomatoriaComNumeroNegativo() {
        Calculadora calc = new Calculadora();

        assertEquals(0, calc.somatoria(-5));
    }

    @Test
    public void testaEhPositivo() {
        Calculadora calc = new Calculadora();

        assertTrue(calc.ehPositivo(12));
    }

    @Test
    public void testaEhPositivoComZero() {
        Calculadora calc = new Calculadora();

        assertTrue(calc.ehPositivo(0));
    }

    @Test
    public void testaEhPositivoComNumeroNegativo() {
        Calculadora calc = new Calculadora();

        assertFalse(calc.ehPositivo(-10));
    }

    @Test
    public void testaComparaMenor() {
        Calculadora calc = new Calculadora();

        assertEquals(-1, calc.compara(8, 15));
    }

    @Test
    public void testaComparaMaior() {
        Calculadora calc = new Calculadora();

        assertEquals(1, calc.compara(15, 8));
    }

    @Test
    public void testaComparaIgual() {
        Calculadora calc = new Calculadora();

        assertEquals(0, calc.compara(8, 8));
    }
}