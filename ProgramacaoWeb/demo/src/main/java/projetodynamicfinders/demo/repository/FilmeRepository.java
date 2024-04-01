package projetodynamicfinders.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import projetodynamicfinders.demo.entity.Filme;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface FilmeRepository extends JpaRepository<Filme,Integer> {

    List<Filme> findByNomeContainsIgnoreCase(String nome);
    List<Filme> findByNotaGreaterThan(Double nota);

    Optional<Filme> findTop1ByOrderByNotaDesc();
    List<Filme> findTop3ByOrderByNota(Double nota);

    int countByDiretor(String direto);
    boolean existsByDiretor(String diretor);

    List<Filme> findByDataLancamentoGraterThanEqual(LocalDate data);

    @Query("SELECT f FROM Filme f WHERE f.nome ILIKE %:nome%")
    List<Filme> buscarPorNomeComLikeIgnorando(String nome);
 }
