package school.sptech;

import java.util.Arrays;

public class Ordencao {
    public void ordenaDecrescente(int[] v
    ) {
        int x, y, k;
        for (x = 1; x < v.length; x++) {
            k = v[x];
            for (y = x - 1;y >= 0 && v[y] < k;y--) {
                v[y+1] = v[y];
            }
            v[y+1] = k;
        }
        System.out.println(Arrays.toString(v));
    }
}
