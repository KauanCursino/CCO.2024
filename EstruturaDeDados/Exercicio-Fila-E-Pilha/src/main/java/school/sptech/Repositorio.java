package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Repositorio {

    private List<Hospital> lista;
    private PilhaObj<Integer> pilha;
    private FilaObj<Hospital> fila;


    public Repositorio() {
        this.lista = new ArrayList<>();
        this.pilha = new PilhaObj<>(10);
    }

    public void salvar(Hospital hospital) {
        lista.add(hospital);
        pilha.push(hospital.getId());
        fila.insert(hospital);
    }


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
        fila.exibe();
    }

    public void desfazer() {
        if (pilha.isEmpty()) {
            System.out.println("Não há nada a desfazer");
        } else {
            int id = pilha.pop();
            deletar(id);
        }
    }

    public FilaObj<Hospital> executarAgendado(int qtdOperacoes){
        if (fila.isEmpty()){
            System.out.println("Não há operações agendadas");
        }
        if (qtdOperacoes < 0){
            System.out.println("Valor inválido");
        }

        for (int i = qtdOperacoes; i > 0; i--) {
            fila.poll();
        }

        return fila;
    }
}
