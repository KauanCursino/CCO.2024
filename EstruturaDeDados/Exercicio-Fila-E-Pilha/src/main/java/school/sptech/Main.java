package school.sptech;

import java.util.Scanner;

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


        //EXERCICIO FILA E PILHA ABAIXO:
        Scanner leitor = new Scanner(System.in);
        Hospital hospital = new Hospital();

        System.out.println("\n1. insira dados do seu objeto:");
        System.out.println("id:");
        hospital.setId(leitor.nextInt());

        System.out.println("Nome:");
        hospital.setNome(leitor.next());

        System.out.println("Valor de mercado:");
        hospital.setValorDeMercado(leitor.nextDouble());

        System.out.println("Quantidade de fncionários");
        hospital.setQtdFuncionarios(leitor.nextInt());

        System.out.println("Descrição");
        hospital.setDescricao(leitor.next());

        Repositorio repositorio = new Repositorio();

        repositorio.salvar(hospital);

        System.out.println("Qual a quantidade de operações vão ser realizadas?");
        System.out.println(repositorio.executarAgendado(leitor.nextInt()));

    }


}