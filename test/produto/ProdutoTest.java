package produto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ProdutoTest {

    @Test
    public void testaCriacaoProduto() {
        Produto produto = new Produto("Batom", 27.0);

        assertEquals("Batom", produto.getNome());
        assertEquals(27.0, produto.getPreco());
    }

    @Test
    public void testaGetNome() {
        Produto produto = new Produto("Base", 43.0);

        assertEquals("Base", produto.getNome());
    }

    @Test
    public void testaSetNome() {
        Produto produto = new Produto("Batom", 27.0);

        produto.setNome("Gloss");

        assertEquals("Gloss", produto.getNome());
    }

    @Test
    public void testaGetPreco() {
        Produto produto = new Produto("Rimel", 31.0);

        assertEquals(31.0, produto.getPreco());
    }

    @Test
    public void testaSetPreco() {
        Produto produto = new Produto("Rimel", 31.0);

        produto.setPreco(35.0);

        assertEquals(35.0, produto.getPreco());
    }

    @Test
    public void testaProdutosComMesmoNome() {
        Produto produto1 = new Produto("Batom", 27.0);
        Produto produto2 = new Produto("Batom", 35.0);

        assertEquals(produto1, produto2);
    }
}