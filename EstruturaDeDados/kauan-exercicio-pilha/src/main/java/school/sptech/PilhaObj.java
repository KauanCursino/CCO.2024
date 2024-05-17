package school.sptech;

public class PilhaObj<T> {

    // 01) Atributos
    private T[] pilha;
    private int topo;

    // 02) Construtor


    public PilhaObj(int tam) {
        this.pilha = (T[]) new Object[tam];
        this.topo = -1;
    }

    // 03) MÃ©todo isEmpty
    public Boolean isEmpty() {
        return topo == -1;

    }

    // 04) MÃ©todo isFull
    public Boolean isFull() {
        return topo + 1 == pilha.length;
    }

    // 05) MÃ©todo push
    public void push(T info) {
        if (isFull()){
            throw new IllegalStateException("Pilha cheia!");
        }
        pilha[++topo] = info;
    }

    // 06) MÃ©todo pop
    public T pop() {
        if (!isEmpty()){
            return pilha[topo--];
        }
        return null;
    }

    // 07) MÃ©todo peek
    public T peek() {
        if (!isEmpty()){
            return pilha[topo];
        }
        return null;
    }

    // 08) MÃ©todo exibe
    public void exibe() {
        if (isEmpty()){
            System.out.println("Pilha vazia!");
        } else {
            for (int i = 0; i <= topo; i++) {
                System.out.print(pilha[i] + " ");
            }
        }
    }


    //Getters & Setters (manter)
    public int getTopo() {
        return topo;
    }
}