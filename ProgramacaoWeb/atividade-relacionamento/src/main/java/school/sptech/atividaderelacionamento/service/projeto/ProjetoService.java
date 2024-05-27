package school.sptech.atividaderelacionamento.service.projeto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import school.sptech.atividaderelacionamento.entity.projeto.Projeto;
import school.sptech.atividaderelacionamento.exception.CampoInvalidoException;
import school.sptech.atividaderelacionamento.exception.EntidadeNaoEncontradaException;
import school.sptech.atividaderelacionamento.repository.projeto.ProjetoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProjetoService {
    @Autowired
    private ProjetoRepository projetoRepository;

    public List<Projeto> listarProjetos() {
        return projetoRepository.findAll();
    }

    public Projeto buscarProjetoPorId(Integer id) {
        Optional<Projeto> projeto = projetoRepository.findById(id);
        if (projeto.isEmpty()) {
            throw new EntidadeNaoEncontradaException("Projetos");
        }
        return projetoRepository.findById(id).get();
    }

    public Projeto salvarProjeto(Projeto projeto) {
        if(projeto.getDataInicio().isAfter(projeto.getDataFim())) {
            throw new CampoInvalidoException("Data inicio");
        }

        return projetoRepository.save(projeto);
    }
}
