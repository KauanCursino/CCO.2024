package school.sptech.marketplaceresumido.service.produto;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.w3c.dom.stylesheets.LinkStyle;
import school.sptech.marketplaceresumido.data.ProdutoRepository;
import school.sptech.marketplaceresumido.entity.Produto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(MockitoExtension.class)
class ProdutoServiceTest {

    @InjectMocks
    private ProdutoService produtoService;

    @Mock
    private ProdutoRepository produtoRepository;

    @Test
    @DisplayName("Caso não houver nada no banco, retorne uma lista vazia")
    void cenarioListaVazia(){
        //var lista = new ArrayList<Produto>();

        Mockito.when(produtoRepository.findAll()).thenReturn(Collections.emptyList());

        List<Produto> produtos = produtoService.listar();

        assertTrue(produtos.isEmpty());

    }

    @Test
    @DisplayName("Caso houver uma lsta com 3 prdutos, retorne os 3 produtos")
    void cenarioListaCom3Produtos(){
        Produto produt1 = new Produto();
        Produto produt2 = new Produto();
        Produto produt3 = new Produto();
        List<Produto> lista = new ArrayList<>();
        lista.add(produt1);
        lista.add(produt2);
        lista.add(produt3);

        Mockito.when(produtoRepository.findAll()).thenReturn(lista);

        List<Produto> produtos = produtoService.listar();

        assertFalse(produtos.isEmpty());
        assertEquals(3, produtos.size());

        assertEquals(produtos.get(0), lista.get(0).getNome());
        assertEquals(produtos.get(0), lista.get(0).getId());
        assertEquals(produtos.get(0), lista.get(0).getPreco());

    }

}