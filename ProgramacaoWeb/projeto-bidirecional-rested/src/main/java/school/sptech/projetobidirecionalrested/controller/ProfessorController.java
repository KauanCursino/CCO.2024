package school.sptech.projetobidirecionalrested.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import school.sptech.projetobidirecionalrested.entity.Professor;
import school.sptech.projetobidirecionalrested.service.ProfessorService;

@RestController
@RequestMapping("/professores")
@RequiredArgsConstructor
public class ProfessorController {

    private final ProfessorService professorService;
    @GetMapping("/{id}")
    public ResponseEntity<Professor> porId(@PathVariable Integer id) {
        Professor professor = professorService.porId(id);
        return ResponseEntity.ok(professor);
    }
}
