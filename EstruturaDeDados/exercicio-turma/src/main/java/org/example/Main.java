package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Aluno[] alunos = {new Aluno ("Thiago", "T1"),
                          new Aluno ("Miguel", "T2"),
                          new Aluno ("Bruna", "T1"),
                          new Aluno ("Mirela", "T2"),
                          new Aluno ("Bigode", "T1"),
                          new Aluno ("Mave", "T2"),
                          new Aluno ("Kauan", "T1"),
                          new Aluno ("Diego", "T2"),
                          new Aluno ("Emily", "T1"),
                          new Aluno ("Sávio", "T2")
        };

        Aluno aluno = new Aluno();
        aluno.separarTurmas(alunos);
    }
}