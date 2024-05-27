package school.sptech;

import java.util.Arrays;

public class DuasPilhas {

    // 01) Atributos
    private int[] pilha;
    private int topo1;
    private int topo2;

    // 02) Construtor
    public DuasPilhas(int tam) {
        this.pilha = new int[tam];
        this.topo1 = -1;
        this.topo2 = pilha.length;
    }


    // 03) MÃ©todo isEmpty
    public Boolean isEmpty(int numPilha) {
        if (numPilha == 1) {
            return getTopo1() == -1;
        }else {
            return getTopo2() == pilha.length;
        }
    }

    // 04) MÃ©todo isFull
    public Boolean isFull() {
        return topo1 + 1 == pilha.length || topo2 - 1 == topo1;
    }

    // 05) MÃ©todo push
    public void push(int info, int numPilha) {
        if (isFull()){
            throw new IllegalStateException("Pilha vazia");
        }
        switch (numPilha){
            case 1:
                pilha[++topo1] = info;
                break;
            case 2:
                pilha[--topo2] = info;

        }
    }

    // 06) MÃ©todo pop
    public int pop(int numPilha) {
        if (!isEmpty(numPilha)){
            switch (numPilha){
                case 1:
                    return pilha[topo1--];
                case 2:
                    return pilha[topo2++];
            }
        }
        return 0;
    }

    // 07) MÃ©todo peek
    public int peek(int numPilha) {
        if (!isEmpty(numPilha)){
            return pilha[numPilha];
        }
        return 0;
    }

    // 08) MÃ©todo exibe
    public void exibe(int numPilha) {
        if (isEmpty(numPilha)){
            System.out.println("Pilha vazia");
            return;
        }
        System.out.println(Arrays.toString(pilha));
    }


    //Getters & Setters (manter)
    public int getTopo1() {
        return topo1;
    }
    public int getTopo2() {
        return topo2;
    }
}
