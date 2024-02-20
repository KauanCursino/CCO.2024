package org.example;


import java.util.Scanner;

public class Main {

    public static  void exibeVetor(int[] v){
        for (int i = 0; i < v.length; i++){
            System.out.println("vetor["+ i + "] = "  + v[i]);
        }
    }

    public static void leVetor(int[] v){
        Scanner leitor = new Scanner(System.in);
        for (int i =0; i < v.length; i++){

            System.out.println("Digite o valor de v[" +i+ "]");
            v[i] = leitor.nextInt();
        }
    }

    public static void main(String[] args) {

        Scanner leitor2 = new Scanner(System.in);
        Scanner leitor3 = new Scanner(System.in);

        int[] vetor = new int[5];

        int[] vetor2 = {100,200,300,400,500};
        System.out.println("Vetor2:");
        exibeVetor(vetor2);

        String[] vetor3 = new String[4];

        // Declaração de vetor
        int[] vetor4;


        //Desafio 1
        int soma = 0;
        int pares = 0;
        leVetor(vetor);
        exibeVetor(vetor);
        for( int i = 0; i < vetor.length; i++){
            soma += vetor[i];
        }
        System.out.println("Soma do primeiro vetor: " + soma);

        //Desafio 2
        for (int numeros : vetor){
            if (numeros % 2 == 0){
                pares++;
            }
        }
        System.out.println("Esse vetor possui :" + pares + " valores pares");

//        for (int i = 0; i < vetor.length; i++){
//            System.out.println("Digite o valor de vetor[" + i+ "]");
//            vetor[i] = leitor.nextInt();
//        }

        //Desafio 3
        String[] semana = {"Domingo","Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado"};

        int tamanho = 0;
        do{
        System.out.println("Digite um valor inteiro entre 1 e 7");
        tamanho = leitor3.nextInt();
        }while (tamanho < 1 && tamanho > 7);
        System.out.println(semana[(tamanho - 1)]);



        for (int i = 0; i < vetor3.length; i++){
            System.out.println("Digite o valor de vetor3[" + i+ "]");
            vetor3[i] = leitor2.next();
        }


        System.out.println("\nVetor 3:");
        for (String s : vetor3){
            System.out.println(s);
        }
    }
}