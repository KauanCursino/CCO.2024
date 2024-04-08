package school.sptech;

import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {



        Carro carro1 = new Carro();

        Carro[] carrosInsertion = new Carro[]{
                new Carro(1,20000.0, "ABC", 20, "Toyota", 2000),
                new Carro(2,30000.0, "EFW", 160, "BYD", 2020),
                new Carro(3,40000.0, "ATY", 45, "Honda", 1970),
                new Carro(4,60000.0, "YUJ", 240, "Mitsubishi", 2018),
                new Carro(5,25000.0, "CVB", 13, "Volkswagen", 1060),
                new Carro(6,60000.0, "TJY", 79, "Hyundai", 1980),
                new Carro(7,100000.0, "WUT", 90, "Ford", 2005),
                new Carro(8,2000.0, "JIO", 1, "Volvo", 2001)
        };

        System.out.println("\nINSERTION SORT:\n");
        carro1.insertionSort(carrosInsertion);

        Carro[] carrosBubble = new Carro[]{
                new Carro(1,20000.0, "ABC", 20, "Toyota", 2000),
                new Carro(2,30000.0, "EFW", 160, "BYD", 2020),
                new Carro(3,40000.0, "ATY", 45, "Honda", 1970),
                new Carro(4,60000.0, "YUJ", 240, "Mitsubishi", 2018),
                new Carro(5,25000.0, "CVB", 13, "Volkswagen", 1060),
                new Carro(6,60000.0, "TJY", 79, "Hyundai", 1980),
                new Carro(7,100000.0, "WUT", 90, "Ford", 2005),
                new Carro(8,2000.0, "JIO", 1, "Volvo", 2001)
        };
        System.out.println("\nBUBBLE SORT:\n");
        carro1.bubbleSort(carrosBubble);

        System.out.println("\nCom base no vetor ordenado acima ^\nPESQUISA BINÁRIA");
        carro1.pesquisaBinaria(carrosBubble,240);

        Carro[] carrosMerge = new Carro[]{
                new Carro(1,20000.0, "ABC", 20, "Toyota", 2000),
                new Carro(2,30000.0, "EFW", 160, "BYD", 2020),
                new Carro(3,40000.0, "ATY", 45, "Honda", 1970),
                new Carro(4,60000.0, "YUJ", 240, "Mitsubishi", 2018),
                new Carro(5,25000.0, "CVB", 13, "Volkswagen", 1060),
                new Carro(6,60000.0, "TJY", 79, "Hyundai", 1980),
                new Carro(7,100000.0, "WUT", 90, "Ford", 2005),
                new Carro(8,2000.0, "JIO", 1, "Volvo", 2001)
        };

        System.out.println("\nMERGE SORT:\n");
        carro1.mergeSort(carrosMerge, 0, carrosMerge.length);
        for (Carro carros : carrosMerge){
            System.out.println(carros);
        }

        Carro[] carrosQuick = new Carro[]{
                new Carro(1,20000.0, "ABC", 20, "Toyota", 2000),
                new Carro(2,30000.0, "EFW", 160, "BYD", 2020),
                new Carro(3,40000.0, "ATY", 45, "Honda", 1970),
                new Carro(4,60000.0, "YUJ", 240, "Mitsubishi", 2018),
                new Carro(5,25000.0, "CVB", 13, "Volkswagen", 1060),
                new Carro(6,60000.0, "TJY", 79, "Hyundai", 1980),
                new Carro(7,100000.0, "WUT", 90, "Ford", 2005),
                new Carro(8,2000.0, "JIO", 1, "Volvo", 2001)
        };

        carro1.quickSort(carrosQuick, 0, carrosQuick.length);
        for (Carro carro : carrosQuick){
            System.out.println(carro);
        }
    }
}