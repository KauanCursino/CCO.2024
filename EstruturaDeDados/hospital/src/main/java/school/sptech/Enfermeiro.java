package school.sptech;

public class Enfermeiro extends Funcionario{

    private String tecnico;

    public Enfermeiro() {
    }

    public Enfermeiro(String nome, String telefone, Double salario, String especialidade, String tecnico) {
        super(nome, telefone, salario, especialidade);
        this.tecnico = tecnico;
    }

    public String getTecnico() {
        return tecnico;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    @Override
    public void realizarAtendimento() {
        Diagnostico diagnostico = new Diagnostico();

        diagnostico.getGravidade();
        diagnostico.getMedicacao();
    }
}
