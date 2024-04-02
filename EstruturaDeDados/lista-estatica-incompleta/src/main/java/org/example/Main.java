package org.example;

public class Main {
    public static void main(String[] args) {
        ListaEstatica lista = new ListaEstatica(5);

        lista.adiciona(20);
        lista.adiciona(30);
        lista.adiciona(40);
        lista.adiciona(50);

        lista.substitui(20,50);
        lista.exibe();

        lista.contaOcorrencias(50);

        lista.adicionaNoInicio(10);
        lista.exibe();
    }
}