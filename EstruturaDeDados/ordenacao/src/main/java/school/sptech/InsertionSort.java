package school.sptech;

import java.util.Arrays;

public class InsertionSort {

    public void InsertionSort(int[] v){
        int j, x;
        for (int i = 1; i < v.length; i++){
            x = v[i];
            j = i -1;

            while (j >= 0 && v[j] > x){
                v[j+1] = v[j];
                j = j-1;
            }
            v[j+1] = x;
        }
        System.out.println(Arrays.toString(v));
    }
}
