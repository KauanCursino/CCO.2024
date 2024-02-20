package school.sptech;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        String[] nomes = new String[10];
        String nomeQualquer;


        System.out.println("Digite 10 nomes:");
        for (int i = 0; i < 10; i++){
            nomes[i] = leitor.next();
        }
        System.out.println("Digite um nome");
        nomeQualquer = leitor.next();

        for (int i = 0; i < nomes.length; i++){
            if (nomeQualquer.equals(nomes[i])){
                System.out.println("nome encontrado no indicie: " + i);
                return;
            } else {
                System.out.println("nome não encontrado");
                return;
            }
        }
    }
}
