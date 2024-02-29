package school.sptech.projeto03statushttp;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/produtos")

public class ProdutoController {

    private List<Produto> produtos = new ArrayList<>();

    @PostMapping
    public ResponseEntity cadastrar(@RequestBody Produto produto){
        produtos.add(produto);
        return ResponseEntity.status(201).body(produto);
    }

    @GetMapping
    public ResponseEntity<List<Produto>> listar(){
        if (produtos.isEmpty()){
            return ResponseEntity.status(204).build();
        }
        return ResponseEntity.status(200).body(produtos);

    }

    @PutMapping("/{indice}")
    public ResponseEntity<Produto> alterar(@PathVariable int indice, @RequestBody Produto produtoAtualizado){
        if (indice >= 0 && indice <= produtos.size()){
            produtos.set(indice, produtoAtualizado);
            return ResponseEntity.status(200).body(produtoAtualizado);

        }
        return ResponseEntity.status(404).build();
    }
    @GetMapping("/estoque/{qtdEstoque}")
    public ResponseEntity<List<Produto>> estoque(@PathVariable int qtdEstoque){
        List<Produto> produtosFiltrados = produtos
                .stream()
                .filter(produtoDaVez -> produtoDaVez.getQtdEstoque() >= qtdEstoque)
                .toList();
        if (produtosFiltrados.isEmpty()){
            return ResponseEntity.status(204).build();
        }
        return ResponseEntity.status(200).body(produtosFiltrados);
    }

}
