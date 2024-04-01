package school.sptech;

public class MedicoCirurgiao extends Medico{

    private double valorAplicacaoAnestesia;
    private int qtdCirurgia;
    private double valorCirurgia;

    public MedicoCirurgiao(String nome, double ganho, String crm, double valorAplicacaoAnestesia, int qtdCirurgia, double valorCirurgia) {
        super(nome, ganho, crm);
        this.valorAplicacaoAnestesia = valorAplicacaoAnestesia;
        this.qtdCirurgia = qtdCirurgia;
        this.valorCirurgia = valorCirurgia;
    }

    public int getQtdCirurgia() {
        return qtdCirurgia;
    }

    public void setQtdCirurgia(int qtdCirurgia) {
        this.qtdCirurgia = qtdCirurgia;
    }

    public double getValorCirurgia() {
        return valorCirurgia;
    }

    public void setValorCirurgia(double valorCirurgia) {
        this.valorCirurgia = valorCirurgia;
    }

    public double getValorAplicacaoAnestesia() {
        return valorAplicacaoAnestesia;
    }

    public void setValorAplicacaoAnestesia(double valorAplicacaoAnestesia) {
        this.valorAplicacaoAnestesia = valorAplicacaoAnestesia;
    }

    @Override
    public void setGanho(double ganho) {
        ganho = getQtdCirurgia() * (getValorCirurgia() + getValorAplicacaoAnestesia());
    }

    public double getValorBonus() {
        return getGanho() * 0.15;
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("MedicoCirurgiao{");
        sb.append("valorAplicacaoAnestesia=").append(valorAplicacaoAnestesia);
        sb.append(", qtdCirurgia=").append(qtdCirurgia);
        sb.append(", valorCirurgia=").append(valorCirurgia);
        sb.append('}');
        return sb.toString();
    }
}
