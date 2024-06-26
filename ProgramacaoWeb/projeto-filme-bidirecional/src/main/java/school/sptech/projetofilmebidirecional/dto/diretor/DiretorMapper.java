package school.sptech.projetofilmebidirecional.dto.diretor;

import school.sptech.projetofilmebidirecional.entity.Diretor;

import java.util.List;

public class DiretorMapper {

    public static DiretorListagemDto toListagemDto(Diretor entity) {
        DiretorListagemDto dto = new DiretorListagemDto();
        dto.setId(entity.getId());
        dto.setNome(entity.getNome());
        dto.setNacionalidade(entity.getNacionalidade());
        dto.setDataNascimento(entity.getDataNascimento());
        return dto;
    }

    public static List<DiretorListagemDto> toListagemDto(List<Diretor> entities) {
        return entities.stream().map(DiretorMapper::toListagemDto).toList();
    }

    public static Diretor toEntity(DiretorCriacaoDto dto) {
        Diretor entity = new Diretor();
        entity.setNome(dto.getNome());
        entity.setNacionalidade(dto.getNacionalidade());
        entity.setDataNascimento(dto.getDataNascimento());
        return entity;
    }
}
