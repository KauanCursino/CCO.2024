package org.example;


public class Main {

    public static void contagemRegressiva(int n){
        for(int i = n; i>=0;i--){
            System.out.println(i);
        }
    }

    public static void contagemRegressivaRecursiva(int n){
        if (n == 0){
            System.out.println(n);
        } else {
            System.out.println(n);
            contagemRegressivaRecursiva(n - 1);
        }
    }
    public static void main(String[] args) {
        System.out.println("Contagem regressiva do 5: ");
        contagemRegressiva(5);

        System.out.println("Contagem regressiva recursiva do 5: ");
        contagemRegressiva(5);
    }
}