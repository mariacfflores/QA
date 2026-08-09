package calculadora;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class exercicio1_carrinho {

    @Test
    public void testaAddItem() {

        Carrinho carrinho = new Carrinho();
        Produto produto = new Produto("Batom", 27.0);
        carrinho.addItem(produto);
        assertEquals(1, carrinho.getQtdeItems());
    }

    @Test
    public void testaGetQtdeItems() {

        Carrinho carrinho = new Carrinho();
        carrinho.addItem(new Produto("Base", 43.0));
        carrinho.addItem(new Produto("Rimel", 31.0));
        assertEquals(2, carrinho.getQtdeItems());
    }

    @Test
    public void testaGetValorTotal() {

        Carrinho carrinho = new Carrinho();
        carrinho.addItem(new Produto("Corretivo", 36.0));
        carrinho.addItem(new Produto("Blush", 25.0));
        double resultado = carrinho.getValorTotal();
        assertEquals(61.0, resultado);
    }

    @Test
    public void testaRemoveItem() throws ProdutoNaoEncontradoException {

        Carrinho carrinho = new Carrinho();
        Produto produto = new Produto("Iluminador", 39.0);
        carrinho.addItem(produto);
        carrinho.removeItem(produto);
        assertEquals(0, carrinho.getQtdeItems());
    }

    @Test
    public void testaEsvazia() {

        Carrinho carrinho = new Carrinho();
        carrinho.addItem(new Produto("Delineador", 22.0));
        carrinho.addItem(new Produto("Po", 47.0));
        carrinho.esvazia();
        assertEquals(0, carrinho.getQtdeItems());
    }
}