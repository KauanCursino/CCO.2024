package school.sptech;

public abstract class Funcionario implements iAtendimento{

    private String nome;
    private String telefone;
    private Double salario;
    private String especialidade;

    public Funcionario(String nome, String telefone, Double salario, String especialidade) {
        this.nome = nome;
        this.telefone = telefone;
        this.salario = salario;
        this.especialidade = especialidade;
    }

    public Funcionario() {}
}
