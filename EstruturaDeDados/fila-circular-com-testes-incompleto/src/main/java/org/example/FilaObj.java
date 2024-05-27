package org.example;

public class FilaObj<T> {
    // Atributos
    private int tamanho;
    private T[] fila;

    // Construtor
    public FilaObj(int capacidade) {
        this.tamanho = 0;
        this.fila = (T[]) new Object[capacidade];
    }

    // Métodos

    /* Método isEmpty() - retorna true se a fila está vazia e false caso contrário */
    public boolean isEmpty() {
        return tamanho == 0;
    }

    /* Método isFull() - retorna true se a fila está cheia e false caso contrário */
    public boolean isFull() {
        return tamanho == fila.length;
    }

    /* Método insert - recebe um elemento e insere esse elemento na fila
                       no índice tamanho, e incrementa tamanho
                       Lançar IllegalStateException caso a fila esteja cheia
     */
    public void insert(T info) {
        if (isFull()){
            throw new IllegalStateException();
        }
        fila[tamanho++] = info;
    }

    /* Método peek - retorna o primeiro elemento da fila, sem removê-lo */
    public T peek() {
        return fila[0];
    }

    /* Método poll - remove e retorna o primeiro elemento da fila, se a fila não estiver
       vazia. Quando um elemento é removido, a fila "anda", e tamanho é decrementado
       Depois que a fila andar, "limpar" o ex-último elemento da fila, atribuindo null
     */
    public T poll() {
        if (isEmpty()){
            return null;
        }
        T info = fila[0];
        for (int i = 0; i < tamanho - 1; i++) {
            fila[i] = fila[i + 1];
        }
        fila[tamanho - 1] = null;
        tamanho--;
        return info;
    }

    /* Método exibe() - exibe o conteúdo da fila */
    public void exibe() {
        if (isEmpty()) {
            System.out.println("Lista vazia");
            return;
        }
        System.out.println("fila");
        for (int i = 0; i < tamanho; i++) {
            System.out.println(fila[i]);
        }
        System.out.println();
    }

    /* Usado nos testes  - complete para que fique certo */
    public int getTamanho(){
        return tamanho;
    }
}

