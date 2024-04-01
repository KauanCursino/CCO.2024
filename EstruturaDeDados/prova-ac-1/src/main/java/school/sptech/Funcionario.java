package school.sptech;

public class Funcionario {

    private String nome;
    private double ganho;

    public Funcionario(String nome, double ganho) {
        this.nome = nome;
        this.ganho = ganho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getGanho() {
        return ganho;
    }

    public void setGanho(double ganho) {
        this.ganho = ganho;
    }
}
