package school.sptech.projeto02verboshttp;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/musicas")
public class MusicaController {

    // singleton
    private List<Musica> musicas = new ArrayList<>();

    // http://localhost:8080/musicas
    @GetMapping // GET - Indica busca de algo
    public ResponseEntity<List<Musica>> listar() {
        if (musicas.isEmpty()) {
            return ResponseEntity.status(204).build(); // 204 Not Content - lista vazia (não contém nenhum item na lista)
        }
        return ResponseEntity.status(200).body(musicas); // 200 Ok - possui itens na lista
    }

    @GetMapping("/{indice}") // GET - Indica busca de algo
    public ResponseEntity<Musica> recuperar(@PathVariable int indice) {
        if (existeMusica(indice)) {
            return ResponseEntity.status(200).body(musicas.get(indice)); // 200 Ok - encontrou a música por índice
        }
        return ResponseEntity.status(404).build(); // 404 Not Fount - não encontrou a música especifica com por indice
    }

    @PostMapping // POST - Indica criação de algo
    public ResponseEntity<Musica> cadastrar(@RequestBody Musica musica) {
        musicas.add(musica);
        return ResponseEntity.status(201).body(musica); // 201 Created - Criado com sucesso
    }

    @PutMapping("/{indice}") // PUT - Indica alteração de algo
    public ResponseEntity<Musica> atualizar(
            @PathVariable int indice,
            @RequestBody Musica musicaAtualizada) {

        if (existeMusica(indice)) {
            musicas.set(indice, musicaAtualizada);
//            return musicas.get(indice); // fingir busca no banco
            return ResponseEntity.status(200).body(musicaAtualizada); // 200 Ok - Atualizou a música e retornou atualizado
        }
        return ResponseEntity.status(404).build(); // 404 Not Found - Não encontrou a música informada no índice para atualização
    }

    @DeleteMapping("/{indice}") // DELETE - Indica deleção de algo
    public ResponseEntity<Void> deletar(@PathVariable int indice) {
        if (existeMusica(indice)) {
            musicas.remove(indice);
            // Podemos utilizar 200 em uma deleção, porém o mais correto é 204.
            return ResponseEntity.status(204).build(); // 204 Not Content - Deletou com sucesso, porém não tem corpo de resposta
        }
        return ResponseEntity.status(404).build(); // 404 Not Found - não encontrou a música a ser deletada
    }

    public boolean existeMusica(int indice) {
        return indice >= 0 && indice < musicas.size();
    }
}
