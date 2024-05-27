package org.example;

public class FilaCircular {
    int tamanho, inicio, fim;
    String[] fila;

    // Construtor - Recebe a capacidade da fila (tamanho total do vetor)
    public FilaCircular(int capacidade) {
        // Cria o vetor para armazenar a fila e inicializa o tamanho
        this.fila = new String[capacidade];
        this.inicio = 0;
        this.fim = 0;
        this.tamanho = 0;

    }

    // Método isEmpty() - Retorna true se a fila está vazia e false caso contrário
    public boolean isEmpty() {
        return tamanho == 0;
    }

    // Método isFull() - Retorna true se a fila está cheia e false caso contrário
    public boolean isFull() {
        return tamanho == fila.length;
    }

    // Método insert - Recebe informação a ser inserida na fila
    public void insert(String info) {
        if (isFull()){
            throw new IllegalStateException();
        }
        fila[fim] = info;
        fim = (fim+1) % fila.length;
        tamanho++;
    }

    // Método peek() - Retorna o primeiro da fila, sem remover
    public String peek() {
        return fila[inicio];
    }

    // Método poll() - Retorna o primeiro da fila, removendo-o
    public String poll() {

        String aux = fila[inicio];
        inicio = (inicio+1) % fila.length;
        tamanho--;
        return aux;
    }

    // Método exibe() - exibe os elementos da fila
    public void exibe() {
        System.out.println(fila);
    }

    public int getTamanho() {
        return tamanho;
    }

    public int getInicio() {
        return inicio;
    }

    public int getFim() {
        return fim;
    }

    // Cria um vetor e percorre a fila adicionando os elementos no vetor (
    // Retorna o vetor criado e não a fila
    // Esse método é equivalente ao exibe, mas em vez de exibir os elementos da fila na console,
    // copia os elementos da fila para um vetor, na ordem em que seriam exibidos
    public String[] getFila(){
        String[] v = new String[tamanho];
        int aux = 0;
        for (int i = tamanho; i > 0; i--) {
            v[aux] = fila[inicio];
            inicio = (inicio + 1) % fila.length;
            aux++;
        }

        return v;
    }
}

