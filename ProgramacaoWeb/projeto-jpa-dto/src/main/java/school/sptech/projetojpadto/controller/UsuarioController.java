package school.sptech.projetojpadto.controller;


import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import school.sptech.projetojpadto.dto.UsuarioCriacaoRequestDto;
import school.sptech.projetojpadto.dto.UsuarioListagemResponseDto;
import school.sptech.projetojpadto.dto.UsuarioMapper;
import school.sptech.projetojpadto.entity.Usuario;
import school.sptech.projetojpadto.repository.UsuarioRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping
    public ResponseEntity<UsuarioListagemResponseDto> criar(
            @RequestBody @Valid UsuarioCriacaoRequestDto novoUsuario){

        Usuario entity = UsuarioMapper.toEntity(novoUsuario);
        Usuario usuarioSalvo = usuarioRepository.save(entity);
        UsuarioListagemResponseDto dto = UsuarioMapper.toDto(usuarioSalvo);
        return ResponseEntity.status(201).body(dto);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UsuarioListagemResponseDto> porId(@PathVariable int id){
        Optional<Usuario> usuarioOpt = usuarioRepository.findById(id);

        if (usuarioOpt.isEmpty()){
            return ResponseEntity.status(404).build();
        }

        UsuarioListagemResponseDto dto = UsuarioMapper.toDto(usuarioOpt.get());

        return ResponseEntity.status(200).body(dto);

    }

    @GetMapping
    public ResponseEntity<List<UsuarioListagemResponseDto>> listar(){
        List<Usuario> usuarios = usuarioRepository.findAll();

        if (usuarios.isEmpty()) {
            return ResponseEntity.status(204).build();
        }

        List<UsuarioListagemResponseDto> dto = UsuarioMapper.toDto(usuarios);
        return ResponseEntity.status(200).body(dto);
    }
}
