package school.sptech;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int[] diasDeCadaMes = {31,28,31,30,31,30,31,31,30,31,30,31};
        int totalDiasMeses = 0;
        int totalDiasDoAno = 0;


        System.out.println("Digite um dia");
        int dia = leitor.nextInt();

        System.out.println("Digite um mês");
        int mes = leitor.nextInt();


        for (int i = 0; i < mes - 1; i++){
            totalDiasMeses += diasDeCadaMes[i];
        }
        totalDiasDoAno = totalDiasMeses + dia;

        System.out.println("O dia " + dia + "/" + mes + " corresponde ao " + totalDiasDoAno + " do ano");

    }
}
