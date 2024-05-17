package school.sptech.projetofilmebidirecional.dto.filme;

import school.sptech.projetofilmebidirecional.entity.Diretor;
import school.sptech.projetofilmebidirecional.entity.Filme;

import java.util.ArrayList;
import java.util.List;

public class FilmeMapper {

    public static Filme toEntity(FilmeCriacaoDto dto, Diretor diretor) {
        Filme entity = new Filme();
        entity.setTitulo(dto.getTitulo());
        entity.setGenero(dto.getGenero());
        entity.setAnoLancamento(dto.getAnoLancamento());
        entity.setSinopse(dto.getSinopse());
        entity.setDiretor(diretor);
        return entity;
    }

    public static FilmeListagemDto toListagemDto(Filme entity) {
        if (entity == null) return null;

        FilmeListagemDto dto = new FilmeListagemDto();

        dto.setId(entity.getId());
        dto.setTitulo(entity.getTitulo());
        dto.setGenero(entity.getGenero());
        dto.setAnolancamento(entity.getAnoLancamento());
        dto.setSinopse(entity.getSinopse());

        FilmeDiretorListagemDto filmeDiretorListagemDto = new FilmeDiretorListagemDto();
        filmeDiretorListagemDto.setId(entity.getId());
        filmeDiretorListagemDto.setNome(entity.getTitulo());
        filmeDiretorListagemDto.setNome(filmeDiretorListagemDto.getNome());
        filmeDiretorListagemDto.setNacionalidade(filmeDiretorListagemDto.getNacionalidade());
        dto.setDiretor(filmeDiretorListagemDto);

        return dto;
    }

    public static List<FilmeListagemDto> toListagemDto(List<Filme> entity) {
        return entity.stream().map(FilmeMapper::toListagemDto).toList();
    }

}
