import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import calculadora.Calculadora;
import carrinho.Carrinho;
import produto.Produto;

public class BasicoTest {

    @Test
    public void testaCalculadoraCriada() {
        Calculadora calc = new Calculadora();

        assertTrue(calc != null);
    }

    @Test
    public void testaCarrinhoInicialmenteVazio() {
        Carrinho carrinho = new Carrinho();

        assertEquals(0, carrinho.getQtdeItems());
    }

    @Test
    public void testaProdutoCriado() {
        Produto produto = new Produto("Batom", 27.0);

        assertEquals("Batom", produto.getNome());
        assertEquals(27.0, produto.getPreco());
    }
}