package school.sptech.atividaderelacionamento.dto.projeto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import school.sptech.atividaderelacionamento.entity.tarefa.Tarefa;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class ProjetoListagemDto {

    private Integer id;
    private String nome;
    private String descricao;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private List<TarefaDto> tarefas;

    @Data
    public static class TarefaDto{
        private Integer id;
        private String nome;
        private String descricao;
        private boolean concluida;
        private String prioridade;
    }

}
