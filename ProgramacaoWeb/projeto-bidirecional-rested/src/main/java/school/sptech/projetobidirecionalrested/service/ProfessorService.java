package school.sptech.projetobidirecionalrested.service;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import school.sptech.projetobidirecionalrested.entity.Professor;
import school.sptech.projetobidirecionalrested.exception.NaoEncontradoException;
import school.sptech.projetobidirecionalrested.repository.ProfessorRepository;

@Service
@RequiredArgsConstructor
public class ProfessorService {

    private final ProfessorRepository professorRepository;

    public Professor porId(Integer id){
        return professorRepository.findById(id).orElseThrow(
                () -> new NaoEncontradoException("Professor")
        );
    }
}
