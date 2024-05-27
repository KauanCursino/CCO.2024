package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        PilhaObj<Operacao> pilha = new PilhaObj<>(10);
        FilaObj<Operacao> fila = new FilaObj<>(10);

        int operacoesRelaizadas = 0;

        Banco banco = new Banco();

        ContaBancaria conta1 = new ContaBancaria(10, 110.0);
        ContaBancaria conta2 = new ContaBancaria(5, 80.0);

        int escolha = 0;

        while (escolha != 6){

            System.out.println("""
                    1. Debitar valor
                    2. Depositar valor
                    3. Desfazer operação
                    4. Digite a operação desejada (Débito ou crédito)
                    5. Esvaziar fila de operações
                    """);
            switch (leitor.nextInt()){
                case 1:
                    System.out.println("Digite o número da conta que irá debitar: ");
                    int numeroConta = leitor.nextInt();

                    System.out.println("Qual o valor a ser debitado?");
                    double valor = leitor.nextDouble();

                    if (numeroConta == conta1.getNumero()){
                        banco.debitar(valor, conta1);
                    }else {
                        banco.debitar(valor, conta2);
                    }
                    break;
                case 2:
                    System.out.println("Digite o número da conta que irá debitar: ");
                    numeroConta = leitor.nextInt();

                    System.out.println("Digite o valor a ser depositado: ");
                    double valorDepositado = leitor.nextDouble();

                    if (numeroConta == conta1.getNumero()){
                        banco.creditar(valorDepositado, conta1);
                    }else {
                        banco.creditar(valorDepositado, conta2);
                    }
                    break;
                case 3:
                    System.out.println("Quantas operações deseja fazer?");
                    int qtdOperacoes = leitor.nextInt();

                    banco.desfazerOperacao(qtdOperacoes);
                    break;
                case 4:
                    System.out.println("Digite o número da conta que irá fazer a operação: ");
                    numeroConta = leitor.nextInt();

                    System.out.println("Débito ou crédito? ");
                    String tipoOperacao = leitor.next();

                    System.out.println("Qual o valor?");
                    double valorOperacao = leitor.nextDouble();
                    if (numeroConta == conta1.getNumero()){
                        banco.agendarOperacao(tipoOperacao, valorOperacao, conta1);
                    }else {
                        banco.agendarOperacao(tipoOperacao, valorOperacao, conta2);
                    }
                    break;
                case 5:
                    banco.executarOperacoesAgendadas();
                    break;
                case 6:
                    return;
            }

        }
    }
}