package calculadora;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class exercicio1_calculadora {

    @Test
    public void testaSoma() {
        
        Calculadora calc = new Calculadora();
        int resultado = calc.soma(37, 23);
        assertEquals(60, resultado);
    }

    @Test
    public void testaSubtracao() {

        Calculadora calc = new Calculadora();
        int resultado = calc.subtracao(50, 7);
        assertEquals(43, resultado);
    }

    @Test
    public void testaMultiplicacao() {

        Calculadora calc = new Calculadora();
        int resultado = calc.multiplicacao(5, 6);
        assertEquals(30, resultado);
    }

    @Test
    public void testaDivisao() {

        Calculadora calc = new Calculadora();
        int resultado = calc.divisao(40, 2);
        assertEquals(20, resultado);
    }

    @Test
    public void testaSomatoria() {

        Calculadora calc = new Calculadora();
        int resultado = calc.somatoria(6);
        assertEquals(21, resultado);
    }

    @Test
    public void testaEhPositivo() {

        Calculadora calc = new Calculadora();
        boolean resultado = calc.ehPositivo(12);
        assertTrue(resultado);
    }

    @Test
    public void testaCompara() {

        Calculadora calc = new Calculadora();
        int resultado = calc.compara(8, 15);
        assertEquals(-1, resultado);
    }
}