package school.sptech.projetobidirecionalrested.dto.mapper;

import school.sptech.projetobidirecionalrested.dto.AlunoCriacaoDto;
import school.sptech.projetobidirecionalrested.dto.AlunoListagemDto;
import school.sptech.projetobidirecionalrested.entity.Aluno;

public class AlunoMapper {

    public static AlunoListagemDto toDto(Aluno entity) {
        if (entity == null) return null;

        AlunoListagemDto dto = new AlunoListagemDto();
        dto.setId(entity.getId());
        dto.setNome(entity.getNome());
        dto.setRa(entity.getRa());
        dto.setNome(entity.getNome());

        AlunoListagemDto.ProfessorDto professorDto = new AlunoListagemDto.ProfessorDto();
        professorDto.setId(entity.getProfessor().getId());
        professorDto.setNome(entity.getProfessor().getNome());

        dto.setProfessor(professorDto);
        return dto;

    }

    public static Aluno toEntity(AlunoCriacaoDto dto) {
        if (dto == null) return null;
        Aluno entity = new Aluno();

        entity.setNome(dto.getNome());
        entity.setRa(dto.getRa());
        return entity;
    }
}
