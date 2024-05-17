package school.sptech.projetobidirecionalrested.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import school.sptech.projetobidirecionalrested.entity.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Integer> {
}
