package school.sptech;

import java.util.Arrays;

public class BubbleSort {
    int trocas;
    int comparacoes;

    public int[] bubbleSort(int[] desordenados){
        for (int i=0; i < desordenados.length - 1; i++){
            for (int j = 1; j < desordenados.length - i; j++){
                if (desordenados[j-1] > desordenados[j]){
                    int aux = desordenados[j];
                    desordenados[j] = desordenados[j-1];
                    desordenados[j-1] = aux;
                }
            }
        }
        System.out.println(Arrays.toString(desordenados));
        return desordenados;
    }
}
