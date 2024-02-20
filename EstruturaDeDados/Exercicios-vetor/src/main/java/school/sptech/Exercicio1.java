package school.sptech;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args){
        int[] numeros = new int[7];
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um valor para cada indice do vetor: ");
        for (int i = 0; i < 7; i++){
            System.out.println("vetor[" + i + "]");
            numeros[i] = leitor.nextInt();
        }
        System.out.println(Arrays.toString(numeros));
        for(int i = numeros.length-1;i>=0;i--){
            System.out.println(numeros[i]);
        }
    }

}
