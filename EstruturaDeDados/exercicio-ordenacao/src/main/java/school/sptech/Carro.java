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
