package org.example;

public class Main {

    public static boolean ehPalindromo(int[] v){
        Pilha pilha = new Pilha(v.length);
        if (v.length == 0){
            return false;
        }

        for(int i=0; i<v.length; i++){
            pilha.push(v[i]);
        }
        for(int i=0; i<v.length; i++){
            if(pilha.peek() == v[i]){
                System.out.println(pilha.pop());
            }
        }
        if(pilha.isEmpty()){
            System.out.println("é um palindromo");
            return true;
        }
        System.out.println("Não é um palindromo");
        return false;
    }

    public static void binario(int num){
        int tamanho = (int)(Math.log(num) / Math.log(2)) + 1;
        int resto;
        Pilha pilha = new Pilha(tamanho);
        System.out.println( "Número " + num + " em Binário:");

        for (int i=0; i<tamanho; i++){
            resto = num % 2;
            num = num / 2;
            pilha.push(resto);
        }
        for (int i=0; i<tamanho; i++){
            System.out.print(pilha.pop());
        }
    }

    public static boolean ehPalindromoObj(PilhaObj pilhaObjPalindroma, String frasePalindroma){
        for (int i = 0; i < frasePalindroma.length(); i++) {
            pilhaObjPalindroma.push(frasePalindroma.charAt(i));
        }

        for(int i=0; i<frasePalindroma.length(); i++){
            if(pilhaObjPalindroma.peek().equals(frasePalindroma.charAt(i))){
                System.out.println(pilhaObjPalindroma.pop());
            }
        }
        if(pilhaObjPalindroma.isEmpty()){
            System.out.println("É um palindromo");
            return true;
        }
        System.out.println("Não é um palindromo");
        return false;
    }

    public static void main(String[] args) {


        int[] v = {1,2,3,3,2,1};

        ehPalindromo(v);

        binario(12);

        PilhaObj pilhaObj = new PilhaObj(2);
        System.out.println("\n");
        pilhaObj.push("Abc");
        pilhaObj.push("Ghi");
        pilhaObj.exibe();
        for(int i=0; i< 2; i++){
            System.out.println(pilhaObj.pop());
        }

        String frase = "Frase invertida";
        PilhaObj pilhaObj2 = new PilhaObj(frase.length());
        for (int i=frase.length() - 1; i >= 0; i--) {
            pilhaObj2.push(frase.charAt(i));
        }
        pilhaObj2.exibe();

        String frasePalindroma = "atorredaderrota";
        PilhaObj pilhaObjPalidroma = new PilhaObj(frasePalindroma.length());
        ehPalindromoObj(pilhaObjPalidroma, frasePalindroma);

    }
}