package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Repositorio {

    private List<Hospital> lista;
    private PilhaObj<Integer> pilha;


    public Repositorio() {
        this.lista = new ArrayList<>();
        this.pilha = new PilhaObj<>(10);
    }

    public void salvar(Hospital brinquedo) {
        lista.add(brinquedo);
        pilha.push(brinquedo.getId());
    }

    public void salvarFila(Hospital hospital) {}

    public void deletar(int id) {
        boolean encontrado = false;
        for (Hospital brinquedo : lista) {
            if (brinquedo.getId() == id) {
                lista.remove(brinquedo);
                pilha.push(brinquedo.getId());
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("ID inexistente");
        }
    }

    public void exibir() {
        if (lista.isEmpty()) {
            System.out.println("Repositório vazio");
        } else {
            for (Hospital brinquedo : lista) {
                System.out.println(brinquedo);
            }
        }
        pilha.exibe();
    }

    public void desfazer() {
        if (pilha.isEmpty()) {
            System.out.println("Não há nada a desfazer");
        } else {
            int id = pilha.pop();
            deletar(id);
        }
    }
}
