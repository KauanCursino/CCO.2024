package school.sptech;

import java.util.Arrays;

public class Carro {

    private int id;
    private double preco;
    private String placa;
    private int cavalosPotencia;
    private String marca;
    private int anoFabricacao;

    public Carro() {
    }

    public Carro(int id, double preco, String placa, int cavalosPotencia, String marca, int anoFabricacao) {
        this.id = id;
        this.preco = preco;
        this.placa = placa;
        this.cavalosPotencia = cavalosPotencia;
        this.marca = marca;
        this.anoFabricacao = anoFabricacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getCavalosPotencia() {
        return cavalosPotencia;
    }

    public void setCavalosPotencia(int cavalosPotencia) {
        this.cavalosPotencia = cavalosPotencia;
    }

    public void insertionSort(Carro[] v){
        Carro x;
        int j;
        for (int i = 0; i < v.length; i++){
            x = v[i];
            j = i -1;

            while (j >= 0 && v[j].getCavalosPotencia() > x.getCavalosPotencia()){
                v[j+1] = v[j];
                j = j-1;
            }
            v[j+1] = x;
        }
        for (Carro carros : v){
            System.out.println(carros);
        }
    }

    public void bubbleSort(Carro[] desordenados){
        for (int i=0; i < desordenados.length - 1; i++){
            for (int j = 1; j < desordenados.length - i; j++){
                if (desordenados[j-1].getCavalosPotencia() > desordenados[j].getCavalosPotencia()){
                    Carro aux = desordenados[j];
                    desordenados[j] = desordenados[j-1];
                    desordenados[j-1] = aux;
                }
            }
        }
        for (Carro carros : desordenados){
            System.out.println(carros);
        }
    }

    public int pesquisaBinaria(Carro[] v, int x){
        int indInicio = 0;
        int indFim = v.length -1;

        do {
            int indMeio = (indInicio + indFim)/2;
            if (x == v[indMeio].getCavalosPotencia()){
                System.out.println("Carro encontrado no indice: " + indMeio);
                return indMeio;
            }else if (x > v[indMeio].getCavalosPotencia()){
                indInicio = indMeio + 1;
            } else if (x < v[indMeio].getCavalosPotencia()){
                indFim = indMeio - 1;
            }
        } while (indInicio <= indFim);
        return -1;
    }

    public static void mergeSort(Carro[] v, int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            mergeSort(v, inicio, meio);
            mergeSort(v, meio + 1, fim);
            merge(v, inicio, meio, fim);
        }
    }

    private static void merge(Carro[] v, int inicio, int meio, int fim) {
        int n1 = meio - inicio + 1;
        int n2 = fim - meio;

        Carro[] L = new Carro[n1];
        Carro[] R = new Carro[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = v[inicio + i];
        for (int j = 0; j < n2; ++j)
            R[j] = v[meio + 1 + j];

        int i = 0, j = 0;
        int k = inicio;
        while (i < n1 && j < n2) {
            if (L[i].getPreco() <= R[j].getPreco()) {
                v[k] = L[i];
                i++;
            } else {
                v[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            v[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            v[k] = R[j];
            j++;
            k++;
        }
    }

    public static void quickSort(Carro[] v, int inicio, int fim) {
        if (inicio < fim) {
            int pi = particiona(v, inicio, fim);
            quickSort(v, inicio, pi - 1);
            quickSort(v, pi + 1, fim);
        }
    }

    private static int particiona(Carro[] v, int inicio, int fim) {
        Double pivot = v[fim].getPreco();
        int i = inicio - 1;
        for (int j = inicio; j < fim; j++) {
            if (v[j].getPreco() < pivot) {
                i++;
                Carro temp = v[i];
                v[i] = v[j];
                v[j] = temp;
            }
        }
        Carro temp = v[i + 1];
        v[i + 1] = v[fim];
        v[fim] = temp;

        return i + 1;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "id=" + id +
                ", preco=" + preco +
                ", placa='" + placa + '\'' +
                ", cavalosPotencia=" + cavalosPotencia +
                '}';
    }
}
