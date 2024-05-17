package school.sptech;

public class Exercicio2 {
    public void exibeMatriz(int matriz[][]){

        for (int linha = 0; linha < matriz.length; linha++){
            for (int coluna = 0; coluna < matriz[0].length; coluna++){
                System.out.print(matriz[linha][coluna] + "\t");
            }
            System.out.println();
        }
    }
}
