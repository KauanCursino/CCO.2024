package school.sptech.projetobidirecionalrested.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import school.sptech.projetobidirecionalrested.dto.AlunoCriacaoDto;
import school.sptech.projetobidirecionalrested.dto.AlunoListagemDto;
import school.sptech.projetobidirecionalrested.dto.ProfessorListagemDto;
import school.sptech.projetobidirecionalrested.entity.Aluno;
import school.sptech.projetobidirecionalrested.dto.mapper.AlunoMapper;
import school.sptech.projetobidirecionalrested.service.AlunoService;
import school.sptech.projetobidirecionalrested.service.ProfessorService;

import java.net.URI;

@RestController
@RequestMapping("/alunos")
@RequiredArgsConstructor
public class AlunoController {

    private final AlunoService alunoService;
    private final ProfessorService professorService;

    @GetMapping("/id")
    public ResponseEntity<AlunoListagemDto> porId(@PathVariable int id) {

        Aluno aluno = alunoService.porId(id);
        AlunoListagemDto dto = AlunoMapper.toDto(aluno);
        return ResponseEntity.ok(dto);
    }

    @PostMapping
    public ResponseEntity<AlunoListagemDto> criarAluno(@RequestBody AlunoCriacaoDto dto) {

        Aluno novoAluno = AlunoMapper.toEntity(dto);
        Aluno alunoResposta = alunoService.criar(novoAluno, dto.getProfessorId());
        AlunoListagemDto alunoListagemDto = AlunoMapper.toDto(alunoResposta);

        return ResponseEntity.created(URI.create("/alunos/" + alunoListagemDto.getId())).body(alunoListagemDto);
    }
}
