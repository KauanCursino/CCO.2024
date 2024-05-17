package school.sptech.projetobidirecionalrested.repository;

import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import school.sptech.projetobidirecionalrested.entity.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Integer> {
}
