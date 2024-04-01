package org.example;

import java.util.Arrays;

public class Aluno {

    private String nome;
    private String turma;

    public Aluno(String nome, String turma) {
        this.nome = nome;
        this.turma = turma;
    }

    public Aluno() {
    }

    public Aluno[] separarTurmas(Aluno[] t){
        Aluno[] turma1 = new Aluno[10];
        Aluno[] turma2 = new Aluno[10];
        Aluno[] turma1Tratada = new Aluno[5];
        Aluno[] turma2Tratada = new Aluno[5];

        for (int i = 0; i <= t.length -1; i++){
            if (t[i].turma.equalsIgnoreCase("T1")){
                turma1[i] = t[i];
            } else {
                turma2[i] = t[i];
            }
        }


        int contadorTurma1 = 0;
        for (Aluno aluno : turma1){
            if (aluno != null){
                turma1Tratada[contadorTurma1] = aluno;
                contadorTurma1++;
            }
        }

        int contadorTurma2 = 0;
        for (Aluno aluno : turma2){
            if (aluno != null){
                turma2Tratada[contadorTurma2] = aluno;
                contadorTurma2++;
            }
        }

        System.out.println(Arrays.toString(turma1Tratada));
        System.out.println(Arrays.toString(turma2Tratada));
        return t;
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Aluno{");
        sb.append("nome='").append(nome).append('\'');
        sb.append(", turma='").append(turma).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
