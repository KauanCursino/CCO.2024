package school.sptech.projetovalidations;

import jakarta.validation.constraints.*;
import org.hibernate.validator.constraints.br.CPF;
import org.hibernate.validator.constraints.br.TituloEleitoral;

import java.time.LocalDate;

public class Usuario {

    @Size(min = 3, max = 255)
    @NotNull
    @NotBlank
    private String nome;

    @NotNull
    @NotBlank
    @Email
    private String email;

    @NotBlank
    @CPF
    private String cpf;

    @Max(5)
    @PositiveOrZero
    private int qtdFilhos;

    @AssertTrue
    private boolean ativo;

    @DecimalMin("0.0")
    @DecimalMax("20.0")
    @PositiveOrZero
    @NotNull
    private Double dinheiro;

    @PastOrPresent
    private LocalDate dataNascimento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getQtdFilhos() {
        return qtdFilhos;
    }

    public void setQtdFilhos(int qtdFilhos) {
        this.qtdFilhos = qtdFilhos;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public Double getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(Double dinheiro) {
        this.dinheiro = dinheiro;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
