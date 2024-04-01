package projetodynamicfinders.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import projetodynamicfinders.demo.entity.Filme;
import projetodynamicfinders.demo.repository.FilmeRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/filmes")
public class FilmeController {

    @Autowired
    private FilmeRepository filmeRepository;

    @GetMapping
    public ResponseEntity<List<Filme>> listar(){
        List<Filme> filmes = filmeRepository.findAll();
        if (filmes.isEmpty()){
            return ResponseEntity.status(204).build();
        }
        return ResponseEntity.status(200).body(filmes);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Filme> buscaPorId(@PathVariable int id){
        Optional<Filme> filmeOpt = filmeRepository.findById(id);

        if (filmeOpt.isPresent()){
            return ResponseEntity.status(200).body(filmeOpt.get());
        }
        return ResponseEntity.status(404).build();
    }

    @PostMapping
    public ResponseEntity<Filme> criar(@RequestBody Filme novoFilme){
        novoFilme.setId(null);
        Filme filmeSalvo = filmeRepository.save(novoFilme);
        return ResponseEntity.status(201).body(filmeSalvo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Filme> atualizar(@PathVariable int id, @RequestBody Filme filmeAtualizado){
        if (!filmeRepository.existsById(id)){
            return ResponseEntity.status(404).build();
        }
        filmeAtualizado.setId(id);
        Filme filmeSalvo = filmeRepository.save(filmeAtualizado);
        return ResponseEntity.status(200).body(filmeSalvo);
    }

    @GetMapping("/filtro-nome")
    public ResponseEntity<List<Filme>> filtroNome(@RequestParam String nome){
        List<Filme> filmes = filmeRepository.findByNomeContainsIgnoreCase(nome);
        if (filmes.isEmpty()){
            return ResponseEntity.status(204).build();
        }
        return ResponseEntity.status(200).body(filmes);
    }

    /*@GetMapping("/filtro-nota-maior")
    public ResponseEntity<Optional<Filme>> filtroNotaMaior(@RequestParam Double nota){
        Optional<Filme> filmes = filmeRepository.findTop1ByOrderByNotaDesc(nota);
        if (filmes.isEmpty()){
            return ResponseEntity.status(204).build();
        }
        return ResponseEntity.status(200).body(filmes);
    }*/

    @GetMapping("/filtro-top-3-notas")
    public ResponseEntity<List<Filme>> filtroTop3(@RequestParam Double nota){
        List<Filme> filmes = filmeRepository.findTop3ByOrderByNota(nota);
        if (filmes.isEmpty()){
            return ResponseEntity.status(204).build();
        }
        return ResponseEntity.status(200).body(filmes);
    }

    @GetMapping("/filtro-favorito")
    public ResponseEntity<Optional<Filme>> filtroFavorito(){
        Optional<Filme> filme = filmeRepository.findTop1ByOrderByNotaDesc();

        if (filme.isEmpty()){
            return ResponseEntity.status(204).build();
        }
        return ResponseEntity.status(200).body(filme);
    }

    @GetMapping("/contagem-diretor")
    public ResponseEntity<Integer> filtroMelhores(@RequestParam String diretor){
        int qtdFilmesPorDiretor = filmeRepository.countByDiretor(diretor);

        return ResponseEntity.status(200).body(qtdFilmesPorDiretor);

    }

    @GetMapping("/filtro-data")
    public ResponseEntity<List<Filme>> filtroData(@RequestParam LocalDate data){
        List<Filme> filmes = filmeRepository.findByDataGreaterThanEquals(data);

        if (filmes.isEmpty()){
            return ResponseEntity.status(404).build();
        }
        return ResponseEntity.status(200).body(filmes);
    }
}
