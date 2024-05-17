package school.sptech.projetobidirecionalrested.dto.mapper;

import school.sptech.projetobidirecionalrested.dto.ProfessorListagemDto;
import school.sptech.projetobidirecionalrested.entity.Aluno;
import school.sptech.projetobidirecionalrested.entity.Professor;

import java.util.ArrayList;
import java.util.List;

public class ProfessorMapper {

    public static ProfessorListagemDto toDto(Professor entity) {
        if (entity == null) return null;

        ProfessorListagemDto dto = new ProfessorListagemDto();
        dto.setId(entity.getId());
        dto.setNome(entity.getNome());

        dto.setAlunos(toAlunosDto(entity.getAlunos()));
        return dto;
    }

    public static List<ProfessorListagemDto.AlunoDto> toAlunosDto(List<Aluno> entities) {
        List<ProfessorListagemDto.AlunoDto> alunosDto = new ArrayList<>();
        for (Aluno aluno : entities) {
            ProfessorListagemDto.AlunoDto alunoDto = new ProfessorListagemDto.AlunoDto();
            alunoDto.setId(aluno.getId());
            alunoDto.setNome(aluno.getNome());
            alunoDto.setRa(aluno.getRa());

            alunosDto.add(alunoDto);
        }
        return alunosDto;
    }
}
