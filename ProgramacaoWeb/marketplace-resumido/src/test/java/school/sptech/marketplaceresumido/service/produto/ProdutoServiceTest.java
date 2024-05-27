package school.sptech.marketplaceresumido.service.produto;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.web.server.ResponseStatusException;
import school.sptech.marketplaceresumido.entity.Produto;
import school.sptech.marketplaceresumido.data.ProdutoRepository;
import school.sptech.marketplaceresumido.exception.EntidadeNaoEncontradaException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ProdutoServiceTest {

    @InjectMocks
    private ProdutoService service;

    @Mock
    private ProdutoRepository repository;


    @Test
    @DisplayName("Deve retornar lista com 3 produtos")
    void deveRetornarListaProduto() {
        // GIVEN
        List<Produto> produtos = List.of(
                new Produto(1, "p1", "legal", "124124", 11.0),
                new Produto(2, "p2", "legal", "124124", 11.0),
                new Produto(3, "p3", "legal", "124124", 11.0)
        );

        // WHEN
        Mockito.when(service.listar()).thenReturn(produtos);

        // THEN
        List<Produto> produtosRetorno = service.listar();

        // ASSERT
        assertEquals(produtos.size(), produtosRetorno.size());
        assertEquals(3, produtosRetorno.size());
        assertFalse(produtosRetorno.isEmpty());
        assertEquals(produtos.get(0).getNome(), produtosRetorno.get(0).getNome());

        Mockito.verify(repository, Mockito.times(1)).findAll();
    }

    @Test
    @DisplayName("Retorna lista vazia")
    void retornaListaVazia() {
        // GIVEN
        List<Produto> produtos = new ArrayList<>();

        // WHEN
        Mockito.when(service.listar()).thenReturn(produtos);

        // THEN
        List<Produto> produtosListados = service.listar();

        // ASSERT
        assertTrue(produtosListados.isEmpty());
        Mockito.verify(repository, Mockito.times(1)).findAll();

    }

    @Test
    @DisplayName("Deve retornar o objeto salvo")
    void testSalvaProduto() {

        // GIVEN
        Produto produto = new Produto(1, "p1", "legal", "2345", 15.0);
        Produto novoProduto = new Produto(null, "p1", "legal", "2345", 15.0);

        // WHEN
        Mockito.when(service.salvar(novoProduto)).thenReturn(produto);

        // THEN
        Produto produtoSalvo = service.salvar(novoProduto);

        // ASSERT
        assertEquals(produto.getId(), produtoSalvo.getId());
        Mockito.verify(repository, Mockito.times(1)).save(novoProduto);

    }

    @Test
    @DisplayName("Deve retornar o objeto pelo id")
    void retonaObjetoPeloId() {
        // GIVEN
        Produto produto = new Produto(1, "p1", "legal", "2345", 15.0);
        Integer idBusca = 1;

        // WHEN
        Mockito.when(repository.findById(idBusca)).thenReturn(Optional.of(produto));

        // THEN
        Produto produtoEncontrado = service.buscaPorId(idBusca);

        // ASSERT
        assertEquals(produtoEncontrado.getId(), idBusca);

        Mockito.verify(repository, Mockito.times(1)).findById(idBusca);

    }

    @Test
    @DisplayName("Deve retornar ResponseStatusException caso não exista o id")
    void retornaExceptionCasoNaoExiste() {

        // GIVEN
        Integer idBusca = 100;

        // WHEN
        Mockito.when(repository.findById(idBusca)).thenReturn(Optional.empty());

        // THEN
        // ASSERT
        EntidadeNaoEncontradaException exception =
                assertThrows(EntidadeNaoEncontradaException.class,
                () -> service.buscaPorId(idBusca));

        assertEquals("Produto não encontrado!", exception.getLocalizedMessage());

        Mockito.verify(repository, Mockito.times(1)).findById(idBusca);
    }

    @Test
    @DisplayName("Dado que tenho 3 produtos no banco, me retorne somente os casos com a letra A")
    void deveRetornar(){

        //GIVEN
        List<Produto> produtosLetraA = List.of(
                new Produto(1, "caguei", "legal", "124124", 11.0),
                new Produto(2, "bolacha", "da boa", "124124", 11.0)
        );

        //WHEN
        Mockito.when(repository.findAllByNomeContaisIgnoreCase("a")).thenReturn(produtosLetraA);

        //THEN
        List<Produto> resposta = service.buscaPorParteDoNome("a");
        //ASSERT
        assertFalse(resposta.isEmpty());

        for (int i= 0; i < produtosLetraA.size(); i++){
            assertEquals(produtosLetraA.get(i).getNome(), resposta.get(i).getNome());
            assertEquals(produtosLetraA.get(i).getId(), resposta.get(i).getId());
            assertEquals(produtosLetraA.get(i).getCodigoBarra(), resposta.get(i).getCodigoBarra());
            assertEquals(produtosLetraA.get(i).getDescricao(), resposta.get(i).getDescricao());
            assertEquals(produtosLetraA.get(i).getPreco(), resposta.get(i).getPreco());

        }

        Mockito.verify(repository, Mockito.times(1)).findAllByNomeContaisIgnoreCase("a");

    }

    @Test
    @DisplayName("Dadps que não tenho registros com a letra w, deve me retornar lista vazia")
    void deveRetornarListaVazia() {
        Mockito.when(repository.findAllByNomeContaisIgnoreCase("w")).thenReturn(Collections.emptyList());
        List<Produto> resposta = service.buscaPorParteDoNome("w");
        assertTrue(resposta.isEmpty());

        Mockito.verify(repository, Mockito.times(1)).findAllByNomeContaisIgnoreCase("w");
        Mockito.verify(repository, Mockito.times(0)).findAll();

    }

    @Test
    @DisplayName("Dado que tenho um id no banco e passei um objeto, atualiza com sucesso")
    void atualizacaCorreta(){
        //GIVEN
        Produto produtoAtualizacao = new Produto(null, "p1", "legal", "124124", 11.0);
        Integer idInformado = 1;
        Produto produtoRetoronno = new Produto(idInformado, "p1", "legal", "124124", 11.0);

        //WHEN
        Mockito.when(repository.save(produtoAtualizacao)).thenReturn(produtoRetoronno);
        Mockito.when(repository.existsById(idInformado)).thenReturn(Boolean.TRUE);

        //THEN
        Produto produtoReposta = service.atualizar(idInformado, produtoAtualizacao);
        assertEquals(idInformado, produtoReposta.getId());
        assertEquals(produtoAtualizacao.getNome(), produtoReposta.getNome());

        Mockito.verify(repository, Mockito.times(1)).save(produtoAtualizacao);
        Mockito.verify(repository, Mockito.times(1)).existsById(idInformado);
    }

    @Test
    @DisplayName("Dado que tenho um id que não existe no banco")
    void dadoQueIdInexistenteNoAtualiza(){
        Mockito.when(repository.existsById(Mockito.any())).thenReturn(Boolean.FALSE);

        assertThrows(EntidadeNaoEncontradaException.class,
                () -> service.atualizar(1, Mockito.any()));
    }

}