package school.sptech.projetofilmebidirecional.dto.diretor;

import lombok.Data;

@Data
public class DiretorFilmeListagemDto {
    private int id;
    private String titulo;
    private String sinopse;
    private String genero;
    private Integer anoLancamento;

}
