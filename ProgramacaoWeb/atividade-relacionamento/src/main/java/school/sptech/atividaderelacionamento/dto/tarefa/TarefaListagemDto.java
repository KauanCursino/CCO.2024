package school.sptech.atividaderelacionamento.dto.tarefa;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class TarefaListagemDto {

    private Integer id;
    private String nome;
    private String descricao;
    private boolean concluida;
    private String prioridade;
    private ProjetoDto projeto;

    @Data
    public static class ProjetoDto{

        private Integer id;
        private String nome;
        private String descricao;
        private LocalDate dataInicio;
        private LocalDate dataFim;
    }
}
