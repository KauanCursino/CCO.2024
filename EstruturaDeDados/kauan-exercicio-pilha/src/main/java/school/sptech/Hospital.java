package school.sptech;

public class Hospital {

    private int Id;
    private String nome;
    private double valorDeMercado;
    private int qtdFuncionarios;
    private String descricao;

    public Hospital(int id, String nome, double valorDeMercado, int qtdFuncionarios, String descricao) {
        Id = id;
        this.nome = nome;
        this.valorDeMercado = valorDeMercado;
        this.qtdFuncionarios = qtdFuncionarios;
        this.descricao = descricao;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorDeMercado() {
        return valorDeMercado;
    }

    public void setValorDeMercado(double valorDeMercado) {
        this.valorDeMercado = valorDeMercado;
    }

    public int getQtdFuncionarios() {
        return qtdFuncionarios;
    }

    public void setQtdFuncionarios(int qtdFuncionarios) {
        this.qtdFuncionarios = qtdFuncionarios;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Brinquedos{");
        sb.append("Id=").append(Id);
        sb.append(", nome='").append(nome).append('\'');
        sb.append(", preco=").append(valorDeMercado);
        sb.append(", qtdFunc=").append(qtdFuncionarios);
        sb.append(", descricao='").append(descricao).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
