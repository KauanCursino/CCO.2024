package school.sptech.projetobidirecionalrested.dto;

import lombok.Data;
import school.sptech.projetobidirecionalrested.entity.Professor;

@Data
public class AlunoListagemDto {

    private Integer id;
    private String nome;
    private String ra;
    private ProfessorDto professor;

    @Data
    public static class ProfessorDto{
        private Integer id;
        private String nome;
    }
}
