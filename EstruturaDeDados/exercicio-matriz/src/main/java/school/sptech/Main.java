package school.sptech;

import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Exercicio2 leitorMatriz = new Exercicio2();

        Scanner leitorInt = new Scanner(System.in);

        //Exercício 1
        int matriz1[][] = new int[2][3];
        for(int linha = 0; linha < matriz1.length; linha++){
            for (int coluna = 0; coluna < matriz1[0].length; coluna++){
                System.out.println("Digite os valores de uma matriz 2x3:");
                matriz1[linha][coluna] = leitorInt.nextInt();
            }
        }
//        Exercicio 2
        leitorMatriz.exibeMatriz(matriz1);

        //Exercicio 3
        int somaDeColunas[] = new int[3];
        int matriz3[][] = new int[3][3];
        for(int linha = 0; linha < matriz3.length; linha++){
            for (int coluna = 0; coluna < matriz3[0].length; coluna++){
                System.out.println("Digite os valores de uma matriz 3x3:");
                matriz3[linha][coluna] = leitorInt.nextInt();
                somaDeColunas[coluna] += matriz3[linha][coluna];
            }
        }
        System.out.println("Soma das colunas" + Arrays.toString(somaDeColunas));
        leitorMatriz.exibeMatriz(matriz3);

        // Exercicio 4
        Scanner leitorTamanho = new Scanner(System.in);
        int tamanho;

        do {
            System.out.print("Digite o tamanho da matriz (n > 1 e n < 6): ");
            tamanho = leitorTamanho.nextInt();
        } while (tamanho <= 1 || tamanho >= 6);

        int[][] matriz4 = new int[tamanho][tamanho];

        preencherMatriz(matriz4);

        int somaDiagonal1 = 0;
        for (int i = 0; i < tamanho; i++) {
            somaDiagonal1 += matriz4[i][i];
        }

        int somaDiagonal2 = 0;
        for (int i = 0; i < tamanho; i++) {
            somaDiagonal2 += matriz4[i][tamanho - i - 1];
        }

        System.out.println("\nSoma da Diagonal 1: " + somaDiagonal1);
        System.out.println("Soma da Diagonal 2: " + somaDiagonal2);
    }

    public static void preencherMatriz(int[][] matriz) {
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("Digite o valor para linha %d, coluna %d: ", i + 1, j + 1);
                matriz[i][j] = entrada.nextInt();
            }
        }
    }
}