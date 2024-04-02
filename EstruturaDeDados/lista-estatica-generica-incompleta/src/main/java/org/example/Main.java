package org.example;

public class Main {
    public static void main(String[] args) {
        ListaObj<String> lista = new ListaObj(5);

        lista.adiciona("a");
        lista.adiciona("b");
        lista.adiciona("c");
        lista.adiciona("d");

        lista.busca("b");

        lista.adiciona("e");
        lista.exibe();

        lista.removeElemento("a");
        lista.exibe();

        lista.removePeloIndice(1);
        lista.exibe();

        lista.getTamanho();

        lista.getElemento(0);

        lista.limpa();
        lista.exibe();
    }
}