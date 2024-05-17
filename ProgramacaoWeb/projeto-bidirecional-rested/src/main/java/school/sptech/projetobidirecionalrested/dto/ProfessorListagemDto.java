package school.sptech.projetobidirecionalrested.dto;


import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ProfessorListagemDto {

    private Integer id;
    private String nome;
    private List<AlunoDto> alunos;

    @Data
    public static class AlunoDto {
        private Integer id;
        private String nome;
        /*ra = matricula*/
        private String ra;

    }
}
