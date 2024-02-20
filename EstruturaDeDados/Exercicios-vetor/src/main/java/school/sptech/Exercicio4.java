package school.sptech;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int[] numeros = new int[10];
        int numeroQualquer;
        int contador = 0;

        System.out.println("Digite 10 números");
        for (int i = 0; i < 10; i++){
            numeros[i] = leitor.nextInt();
        }

        System.out.println("Digite um núemero qualquer");
        numeroQualquer = leitor.nextInt();
        for (int i = 0; i < 10; i++){
            if (numeroQualquer == numeros[i]){
                contador++;
            }
        }
        if (contador != 0){
        System.out.println("O número " + numeroQualquer + " aparece " + contador + " vezes");
        } else {
            System.out.println("O número " + numeroQualquer + " não aparece nenhuma vez");
        }
    }
}
