package school.sptech;

public class MedicoClinico extends Medico{

    public int qtdConsulta;
    public double valorConsulta;

    public MedicoClinico(String nome, double ganho, String crm, int qtdConsulta, double valorConsulta) {
        super(nome, ganho, crm);
        this.qtdConsulta = qtdConsulta;
        this.valorConsulta = valorConsulta;
    }

    public int getQtdConsulta() {
        return qtdConsulta;
    }

    public void setQtdConsulta(int qtdConsulta) {
        this.qtdConsulta = qtdConsulta;
    }

    public double getValorConsulta() {
        return valorConsulta;
    }

    public void setValorConsulta(double valorConsulta) {
        this.valorConsulta = valorConsulta;
    }

    @Override
    public void setGanho(double ganho) {
        ganho = getQtdConsulta() * getValorConsulta();
    }

    @Override
    public double getValorBonus() {
        return getGanho() * 0.1;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("MedicoClinico{");
        sb.append('}');
        return sb.toString();
    }
}
