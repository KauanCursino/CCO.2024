package school.sptech.atividaderelacionamento.dto.tarefa;

import jakarta.validation.constraints.NotNull;
import lombok.RequiredArgsConstructor;
import school.sptech.atividaderelacionamento.entity.projeto.Projeto;
import school.sptech.atividaderelacionamento.entity.tarefa.Tarefa;
import school.sptech.atividaderelacionamento.service.projeto.ProjetoService;

import java.util.ArrayList;
import java.util.List;


public class TarefaMapper {

    public static TarefaListagemDto toDto(Tarefa entity) {
        TarefaListagemDto dto = new TarefaListagemDto();
        dto.setId(entity.getId());
        dto.setDescricao(entity.getDescricao());
        dto.setNome(entity.getNome());
        dto.setPrioridade(entity.getPrioridade());

        TarefaListagemDto.ProjetoDto projetoDto = new TarefaListagemDto.ProjetoDto();
        projetoDto.setId(entity.getProjeto().getId());
        projetoDto.setNome(entity.getProjeto().getNome());
        projetoDto.setDescricao(entity.getProjeto().getDescricao());
        projetoDto.setDataFim(entity.getProjeto().getDataFim());
        projetoDto.setDataInicio(entity.getProjeto().getDataInicio());

        dto.setProjeto(projetoDto);

        return dto;
    }

    public static List<TarefaListagemDto> toDto(List<Tarefa> entities) {
        List<TarefaListagemDto> dtos = new ArrayList<>();
        for (Tarefa entity : entities) {
            dtos.add(toDto(entity));
        }

        return null;
    }

    public static Tarefa toEntity(TarefaCriacaoDto dto) {
        Tarefa tarefa = new Tarefa();

        tarefa.setNome(dto.getNome());
        tarefa.setDescricao(dto.getDescricao());
        tarefa.setPrioridade(dto.getPrioridade());


        return tarefa;
    }
}
