package school.sptech;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int[] numeros = new int[10];
        int total = 0;
        double media = 0;

        System.out.println("Digite 10 números:");
        for (int i = 0; i < 10; i++){
            numeros[i] = leitor.nextInt();
            total += numeros[i];
        }
        media = total / numeros.length;
        System.out.println("media = " + media);

        for (int n : numeros){
            if (n > media){
                System.out.println("Acima da média:" + n);
            }
        }


    }

}
