package school.sptech;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] vetor = {1, -5, 3, 32, -60, 12};
        DuasPilhas duasPilhas = new DuasPilhas(vetor.length);

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > 0) {
                duasPilhas.push(vetor[i], 1);
            }else {
                duasPilhas.push(vetor[i], 2);
            }
        }



        for (int i = vetor.length-1; i >= 0; i--) {
            if (vetor[i] > 0) {
                while (!duasPilhas.isEmpty(1)){
                    System.out.print(duasPilhas.pop(1) + ",");

                }
            }else {
                System.out.println();
                while (!duasPilhas.isEmpty(2)){
                    System.out.print(duasPilhas.pop(2) + ",");

                }
            }
        }
    }
}