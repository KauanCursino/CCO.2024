package school.sptech;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args){
        Scanner leitorString = new Scanner(System.in);
        Scanner leitorInt = new Scanner(System.in);
        String[] carros = new String[5];
        int[] rendimento = new int[5];
        int maiorRendimento = 0;
        String carroMaisRentável = "";

        System.out.println("Digite o nome de cinco modelos de carros e seus rendimentos");
        for (int i = 0; i < 5; i++){
            carros[i] = leitorString.next();
            rendimento[i] = leitorInt.nextInt();
        }

        for (int i = 0; i < 5; i++){
            if (rendimento[i] > maiorRendimento){
                maiorRendimento = rendimento[i];
                carroMaisRentável = carros[i];
            }
        }
        System.out.println("O carro de maior rendimento é o " + carroMaisRentável);

    }
}
