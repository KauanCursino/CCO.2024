package school.sptech.atividaderelacionamento.controller.projeto;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import school.sptech.atividaderelacionamento.dto.projeto.ProjetoCriacaoDto;
import school.sptech.atividaderelacionamento.dto.projeto.ProjetoListagemDto;
import school.sptech.atividaderelacionamento.dto.projeto.ProjetoMapper;
import school.sptech.atividaderelacionamento.entity.projeto.Projeto;
import school.sptech.atividaderelacionamento.service.projeto.ProjetoService;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/projetos")
public class ProjetoController {

    private final ProjetoService projetoService;

    @GetMapping
    public ResponseEntity<List<ProjetoListagemDto>> listarProjetos() {
        List <Projeto> projetos =  projetoService.listarProjetos();
        if (projetos.isEmpty()){
            return ResponseEntity.noContent().build();
        }

        List<ProjetoListagemDto> dtos = ProjetoMapper.toDto(projetos);
        return ResponseEntity.ok(dtos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProjetoListagemDto> buscarProjeto(@PathVariable Integer id) {
        Projeto projeto = projetoService.buscarProjetoPorId(id);
        ProjetoListagemDto dto = ProjetoMapper.toDto(projeto);

        return ResponseEntity.ok(dto);
    }

    @PostMapping
    public ResponseEntity<ProjetoListagemDto> criarProjeto(@RequestBody @Valid ProjetoCriacaoDto projetoCriacaoDto) {
        Projeto projeto = ProjetoMapper.toEntity(projetoCriacaoDto);
        ProjetoListagemDto projetoListagemDto = ProjetoMapper.toDto(projetoService.salvarProjeto(projeto));
        return ResponseEntity.status(201).body(projetoListagemDto);
    }
}
