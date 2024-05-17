package school.sptech.projetobidirecionalrested.service;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import school.sptech.projetobidirecionalrested.dto.AlunoCriacaoDto;
import school.sptech.projetobidirecionalrested.entity.Aluno;
import school.sptech.projetobidirecionalrested.entity.Professor;
import school.sptech.projetobidirecionalrested.exception.NaoEncontradoException;
import school.sptech.projetobidirecionalrested.repository.AlunoRepository;

@Service
@RequiredArgsConstructor
public class AlunoService {

    private final AlunoRepository alunoRepository;
    private final ProfessorService professorService;

    public Aluno porId(Integer id) {
        return alunoRepository.findById(id).orElseThrow(
                () -> new NaoEncontradoException("Aluno")
        );
    }

    public Aluno criar(Aluno aluno, Integer professorId) {

        aluno.setProfessor(professorService.porId(professorId));
        return alunoRepository.save(aluno);
    }

}
