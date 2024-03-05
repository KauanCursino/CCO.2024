package school.sptech;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectionSort {
    int trocas;
    int comparacoes;

    public int[] selectionSort(int[] v) {
        for (int i=0; i<v.length-1; i++){
            for (int j=i + 1; j < v.length; j++){
                comparacoes++;
                if (v[j] < v[i]){
                    int aux = v[j];
                    v[j] = v[i];
                    v[i] = aux;
                    trocas++;
                }
            }
        }
        System.out.println(Arrays.toString(v) + "\n Comparações feitas: " + comparacoes + "\n Trocas feitas: " + trocas);
        return v;
    }

    public int[] selectionSortOtimizado(int [] v){
        for (int i=0; i < v.length - 1; i++){
            int indMenor = i;
            for (int j = i+1; j<v.length; j++){
                comparacoes++;
                if (v[j] < v[indMenor]){
                    indMenor = j;
                }
            }
            int aux = v[i];
            v[i] = v[indMenor];
            v[indMenor] = aux;
                    trocas++;
        }
        System.out.println(Arrays.toString(v) + "\n Comparações feitas: " + comparacoes + "\n Trocas feitas: " + trocas);
        return v;
    }

}
