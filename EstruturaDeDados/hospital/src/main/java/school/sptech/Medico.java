package school.sptech;

public class Medico extends Funcionario{

    private int crm;

    public Medico() {
    }

    public Medico(String nome, String telefone, Double salario, String especialidade, int crm) {
        super(nome, telefone, salario, especialidade);
        this.crm = crm;
    }

    public Medico(int crm) {
        this.crm = crm;
    }

    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }

    @Override
    public void realizarAtendimento() {
        Diagnostico diagnostico = new Diagnostico();

        diagnostico.setGravidade("");
        diagnostico.setMedicacao("");
    }

}
