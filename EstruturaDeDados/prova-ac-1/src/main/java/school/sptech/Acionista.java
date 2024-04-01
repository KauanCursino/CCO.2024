package school.sptech;

public class Acionista implements IBonus{

    private String nome;
    private int qtdAcoes;
    private double precoAcao;

    public Acionista(String nome, int qtdAcoes, double precoAcao) {
        this.nome = nome;
        this.qtdAcoes = qtdAcoes;
        this.precoAcao = precoAcao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdAcoes() {
        return qtdAcoes;
    }

    public void setQtdAcoes(int qtdAcoes) {
        this.qtdAcoes = qtdAcoes;
    }

    public double getPrecoAcao() {
        return precoAcao;
    }

    public void setPrecoAcao(double precoAcao) {
        this.precoAcao = precoAcao;
    }

    public double getValorBonus(){
        return (getQtdAcoes() * getPrecoAcao()) * 0.25;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Acionista{");
        sb.append("nome='").append(nome).append('\'');
        sb.append(", qtdAcoes=").append(qtdAcoes);
        sb.append(", precoAcao=").append(precoAcao);
        sb.append('}');
        return sb.toString();
    }
}
