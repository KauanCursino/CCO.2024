package school.sptech;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        MergeSort organizador = new MergeSort();

        int[] v = {10,4,6,1,23};

        organizador.mergeSort(0, v.length, v);
        //organizador.quickSort( v, 0, v.length-1);
    }
}