package school.sptech;

public class Main {

    public static void  separaPositivoNegativoEmOrdem(int[] vetorInteiros){
        System.out.print("ex1:");

        FilaObj<Integer> filaObjPositivos = new FilaObj<>(vetorInteiros.length);
        FilaObj<Integer> filaObjNegativos = new FilaObj<>(vetorInteiros.length);

        for (int valor : vetorInteiros) {
            if (valor >= 0) {
                filaObjPositivos.insert(valor);
            }else {
                filaObjNegativos.insert(valor);
            }
        }
        while (!filaObjPositivos.isEmpty()) {
            System.out.print(filaObjPositivos.poll() + ",");

        }
        while (!filaObjNegativos.isEmpty()) {
            System.out.print(filaObjNegativos.poll() + ",");
        }

    }

    public static void separaPositivoNegativoOrdemDiferente(int[] vetorInteiros){
        System.out.print("ex2:");

        FilaObj<Integer> filaObjPositivos = new FilaObj<>(vetorInteiros.length);
        PilhaObj<Integer> pilhaObjNegativos = new PilhaObj<>(vetorInteiros.length);

        for (int valor : vetorInteiros) {
            if (valor >= 0) {
                filaObjPositivos.insert(valor);
            }else {
                pilhaObjNegativos.push(valor);
            }
        }
        while (!filaObjPositivos.isEmpty()) {
            System.out.print(filaObjPositivos.poll() + ",");

        }
        while (!pilhaObjNegativos.isEmpty()) {
            System.out.print(pilhaObjNegativos.pop() + ",");
        }
    }

    public static void main(String[] args) {
       int[]  v = {2,7,-3,-50,45,-4,30,-21,38};

       separaPositivoNegativoEmOrdem(v);
        System.out.println("");
       separaPositivoNegativoOrdemDiferente(v);
    }
}