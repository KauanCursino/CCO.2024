package school.sptech.atividaderelacionamento.dto.projeto;

import school.sptech.atividaderelacionamento.entity.projeto.Projeto;

import java.util.ArrayList;
import java.util.List;

public class ProjetoMapper {

    public static ProjetoListagemDto toDto(Projeto entity) {
        ProjetoListagemDto projetoListagemDto = new ProjetoListagemDto();

        projetoListagemDto.setId(entity.getId());
        projetoListagemDto.setNome(entity.getNome());
        projetoListagemDto.setDescricao(entity.getDescricao());
        projetoListagemDto.setDataInicio(entity.getDataInicio());
        projetoListagemDto.setDataFim(entity.getDataFim());

        List<ProjetoListagemDto.TarefaDto> tarefaDtos = new ArrayList<>();
        for (int i = 0; i < entity.getTarefas().size(); i++) {
            ProjetoListagemDto.TarefaDto tarefaDto = new ProjetoListagemDto.TarefaDto();
            tarefaDto.setId(entity.getTarefas().get(i).getId());
            tarefaDto.setDescricao(entity.getTarefas().get(i).getDescricao());
            tarefaDto.setNome(entity.getTarefas().get(i).getNome());
            tarefaDto.setPrioridade(entity.getTarefas().get(i).getPrioridade());
            tarefaDtos.add(tarefaDto);
        }

        projetoListagemDto.setTarefas(tarefaDtos);

        return projetoListagemDto;

    }

    public static List<ProjetoListagemDto> toDto(List<Projeto> entityList) {

        List<ProjetoListagemDto> projetoListagemDtos = new ArrayList<>();
        for (Projeto projeto : entityList) {
            projetoListagemDtos.add(toDto(projeto));
        }
        return projetoListagemDtos;
    }

    public static Projeto toEntity(ProjetoCriacaoDto dto) {
        Projeto projeto = new Projeto();

        projeto.setNome(dto.getNome());
        projeto.setDescricao(dto.getDescricao());
        projeto.setDataInicio(dto.getDataInicio());
        projeto.setDataFim(dto.getDataFim());

        return projeto;
    }
}
