package school.sptech.projetojpadto.dto;

import school.sptech.projetojpadto.entity.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuarioMapper {

    public static UsuarioListagemResponseDto toDto(Usuario entity){
        if (entity == null) return null;

        //Estrutura de mapeamento
        UsuarioListagemResponseDto dto = new UsuarioListagemResponseDto();
        dto.setId(entity.getId());
        dto.setNomeCompleto(entity.getNome());
        dto.setEmail(entity.getEmail());
        dto.setDataCriacao(entity.getDataCriacao());

        return dto;
    }

    public static List<UsuarioListagemResponseDto> toDto(List<Usuario> entities){
        List<UsuarioListagemResponseDto> usersDto = new ArrayList<>();
        for (Usuario user : entities){
            UsuarioListagemResponseDto dto = UsuarioMapper.toDto(user);
            usersDto.add(dto);
        }
        return usersDto;
    }

    public static Usuario toEntity(UsuarioCriacaoRequestDto dto){
        if (dto == null) return null;

        Usuario user = new Usuario();
        user.setEmail(dto.getEmail());
        user.setNome(dto.getNome());
        user.setSenha(dto.getEmail());

        return user;
    }

}
