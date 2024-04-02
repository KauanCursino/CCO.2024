package org.example;

import java.util.Arrays;

public class ListaEstatica {

    // 01) Declarar vetor de int:
    // É inicializado no construtor
    private int[] vetor;

    // 02) Criar atributo nroElem:
    // Tem dupla função: representa quantos elementos foram adicionado no vetor
    // Também o índice de onde será adicionado o próximo elemento
    private int nroElem;

    // 03) Criar Construtor:
    // Recebe como argumento o tamanho máximo do vetor
    // Cria vetor com tamanho máximo informado
    // Inicializa nroElem

    public ListaEstatica(int tam) {
        this.vetor = new int[tam];
        this.nroElem = 0;
    }


    // 04) Método adiciona:
    // Recebe o elemento a ser adicionado na lista
    // Se a lista estiver cheia usar IllegalStateException();
    public void adiciona(int elemento){
        if (vetor[vetor.length - 1] != 0){
            throw new IllegalStateException("Lista cheia");
        }else {
            vetor[nroElem] = elemento;
            nroElem++;

        }
    }

    // 05) Método busca:
    // Recebe o elemento a ser procurado na lista
    // Retorna o índice do elemento, se for encontrado
    // Retorna -1 se não encontrou
    public int busca(int elemento){
        for (int i = 0; i < nroElem; i++){
            if (vetor[i] == elemento){
                return i;
            }
        }
        return -1;
    }

    // 06) Método removePeloIndice:
    // Recebe o índice do elemento a ser removido
    // Se o índice for inválido, retorna false
    // Se removeu, retorna true
    public boolean removePeloIndice(int e) {
        if (e >= 0 && e < nroElem) {
            for (int i = e; i < nroElem - 1; i++) {
                vetor[i] = vetor[i + 1];
                vetor[i + 1] = 0;
            }
            nroElem--;
            return true;
        }
        return false;
    }

    // 07) Método removeElemento
    // Recebe um elemento a ser removido
    // Utiliza os métodos busca e removePeloIndice
    // Retorna false, se não encontrou o elemento
    // Retorna true, se encontrou e removeu o elemento
    public boolean removeElemento(int e) {
        int index = busca(e);
        if (index != -1) {
            return removePeloIndice(index);
        }
        return false;
    }

    // 08 Método exibe:
    // Exibe os elementos da lista
    public void exibe(){
        System.out.println(Arrays.toString(vetor));
    }

    public boolean substitui(int numAntigo, int numNovo){
        for (int i = 0; i < nroElem; i++){
            if (vetor[i] == numAntigo){
                vetor[i] = numNovo;
                return true;
            }else {
            }
        }
                System.out.println("Numéro não encontrado");
        return false;
    }

    public int contaOcorrencias(int e){
        int qtdOcorrencias = 0;
        for (int i = 0; i< nroElem; i++){
            if (vetor[i] == e){
                qtdOcorrencias++;
            }
        }
        System.out.println(qtdOcorrencias);
        return qtdOcorrencias;
    }

    public boolean adicionaNoInicio(int e){
        if (vetor.length == nroElem){
            throw new IllegalStateException("Lista cheia");
        }
        for (int i = nroElem; i >=0; i--){
            if (i == 0){
                vetor[i] = e;
                nroElem++;
                return true;
            }
            vetor[i] = vetor[i-1];
        }
        return false;
    }

    //Métodos getVetor e getNroElem
    //São usados nos testes
    public int getNroElem() {
        return nroElem;
    }

    public int[] getVetor() {
        return vetor;
    }
}
