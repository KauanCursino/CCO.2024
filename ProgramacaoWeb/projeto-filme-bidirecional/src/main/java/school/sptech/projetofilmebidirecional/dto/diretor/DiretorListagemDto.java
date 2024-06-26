package school.sptech.projetofilmebidirecional.dto.diretor;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class DiretorListagemDto {
    private Integer id;
    private String nome;
    private String nacionalidade;
    private LocalDate dataNascimento;

    private List<DiretorFilmeListagemDto> filmes;
}
