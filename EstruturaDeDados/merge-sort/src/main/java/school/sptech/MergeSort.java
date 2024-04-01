package school.sptech;

import java.util.Arrays;

public class MergeSort {

    public void mergeSort(int p, int r, int[] v){
         p = v[0];
         r = v.length + 1;

        if (p < r-1){
            int q = (p + r) / 2;
            mergeSort(p, q, v);
            mergeSort(q, r, v);
        }
        System.out.println(Arrays.toString(v));
    }
    public void intercala(int p, int q, int r, int[] v){
        int i, j, k;
        int[] w = new int[r - p];

        i = p;
        j = q;
        k = 0;
        while (i < q && j < r){
            if (v[i] <= v[j]){
                w[k++] = v[i++];
            }else {
                w[k++] = v[j++];
            }
        }
        while (i < q){
            w[k++] = v[i++];
        }
        while (j < r){
            w[k++] = v[j++];
        }
        for (i = p; i < r; i++){
            v[i] = w[i - p];
        }
    }
    public void quickSort(int[] v, int indInicio, int indFim){
        int i, j, pivo;
        i = indInicio;
        j = indFim;
        pivo = v[(indFim + indInicio) / 2];
        while (i <= j){
            while (i < indFim && v[i] < pivo){
                i = i+1;
            }
            while (j > indInicio && v[j] > pivo){
                j = j - 1;
            }
            if (i <= j){
                int aux = v[i];
                v[i] = v[j];
                v[j] = aux;
                i = i + 1;
                j = j - 1;
            }
        }
        if (indInicio < j ){
            quickSort(v, indInicio, j);
        }
        if (i < indFim){
            quickSort(v, i, indFim);
        }
        System.out.println(Arrays.toString(v));
    }
}
