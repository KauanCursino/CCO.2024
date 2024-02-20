package school.sptech;

public class Convenio implements iAtendimento{

    private String nome;
    private String plano;
    private String telefone;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPlano() {
        return plano;
    }

    public void setPlano(String plano) {
        this.plano = plano;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public void realizarAtendimento() {
        Paciente paciente = new Paciente();

        paciente.getNome();
        paciente.getTelefone();
    }

    public Double calcularReembolso(){
        return 0.0;
    }
}
