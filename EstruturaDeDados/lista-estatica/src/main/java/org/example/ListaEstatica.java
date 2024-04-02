package org.example;

import java.util.Arrays;

public class ListaEstatica {

    int[] vetor;
    int nroElem;

    public ListaEstatica(int tam) {
        this.vetor = new int[tam];
        this.nroElem = 0;
    }

    public void adiciona(int elemento){
        vetor[nroElem] = elemento;
        nroElem++;
    }

    public void exibe(){
        System.out.println(Arrays.toString(vetor));
    }

    public int busca(int e){
        for (int i = 0; i <= vetor.length; i++){
            if (vetor[i] == e){
                System.out.println(i);
                return i;
            }
        }
        return -1;
    }

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

    public boolean removeElemento(int e) {
        int index = busca(e);
        if (index != -1) {
            return removePeloIndice(index);
        }
        return false;
    }
}
