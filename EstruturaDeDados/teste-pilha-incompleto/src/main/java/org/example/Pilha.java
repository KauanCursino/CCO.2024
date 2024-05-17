package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Pilha {

    // 01) Atributos
    private int[] pilha;
    private int topo;

    // 02) Construtor
    public Pilha( int tam) {
        this.pilha = new int[tam];
        this.topo = -1;
    }


    // 03) MÃ©todo isEmpty
    public Boolean isEmpty() {
        return getTopo() == -1;
    }

    // 04) MÃ©todo isFull
    public Boolean isFull() {
        return topo + 1 == pilha.length;
    }

    // 05) MÃ©todo push
    public void push(int info) {
        if (isFull()){
        throw new IllegalStateException("Pilha vazia");
        }

        pilha[++topo] = info;
    }

    // 06) MÃ©todo pop
    public int pop() {
        if (!isEmpty()){
            return pilha[topo--];
        }
        return -1;
    }

    // 07) MÃ©todo peek
    public int peek() {
        if (!isEmpty()){
            return pilha[topo];
        }
        return -1;
    }

    // 08) MÃ©todo exibe
    public void exibe() {
        if (isEmpty()){
            System.out.println("Pilha vazia");
            return;
        }
        System.out.println(Arrays.toString(pilha));
    }


    //Getters & Setters (manter)
    public int getTopo() {
        return topo;
    }
}