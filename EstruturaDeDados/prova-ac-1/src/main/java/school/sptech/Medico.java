package school.sptech;

public abstract class Medico extends Funcionario implements IBonus{

    private String crm;

    public Medico(String nome, double ganho, String crm) {
        super(nome, ganho);
        this.crm = crm;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }


}
