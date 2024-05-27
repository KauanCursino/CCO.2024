package school.sptech.atividaderelacionamento.service.tarefa;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import school.sptech.atividaderelacionamento.entity.projeto.Projeto;
import school.sptech.atividaderelacionamento.entity.tarefa.Tarefa;
import school.sptech.atividaderelacionamento.exception.EntidadeNaoEncontradaException;
import school.sptech.atividaderelacionamento.repository.tarefa.TarefaRepository;
import school.sptech.atividaderelacionamento.service.projeto.ProjetoService;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TarefaService {
    @Autowired
    private TarefaRepository tarefaRepository;

    private final ProjetoService projetoService;
    
    public List<Tarefa> listarTarefas() {
        return tarefaRepository.findAll();
    }

    public Tarefa buscarTarefaPorId(Integer id) {
        Optional<Tarefa> tarefa = tarefaRepository.findById(id);
        if(tarefa.isEmpty()){
            throw new EntidadeNaoEncontradaException("tarefa");
        }
        return tarefa.get();
    }

    public Tarefa salvarTarefa(Tarefa tarefa, Integer idProjeto) {
        Projeto projeto = projetoService.buscarProjetoPorId(idProjeto);
        tarefa.setProjeto(projeto);

        return tarefaRepository.save(tarefa);
    }
}
