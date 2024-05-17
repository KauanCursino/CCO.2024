package school.sptech;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitorString = new Scanner(System.in);
        Scanner leitorInt = new Scanner(System.in);
        Repositorio repositorio = new Repositorio();

        int escolha;
        int idAtual = 100;
        do {
            System.out.print("O que deseja fazer? ");
            System.out.println("""
                    \n
                    1 - Salvar objeto (Em chamelCase ou apenas primeiro nome)
                    2 - Deletar Objeto
                    3 - Exibir
                    4 - Desfazer objeto
                    5 - Sair
                    """);
            escolha = leitorInt.nextInt();
            switch (escolha) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = leitorString.next();
                    System.out.print("Valor de Mercado: ");
                    double valorDeMercado = leitorInt.nextDouble();
                    System.out.print("Número de funcionários: ");
                    int qtdFunc = leitorInt.nextInt();
                    System.out.print("Descrição: ");
                    String descricao = leitorString.next();

                    Hospital hospital = new Hospital(idAtual++, nome, valorDeMercado, qtdFunc, descricao);
                    repositorio.salvar(hospital);

                    break;
                case 2:
                    System.out.print("Digite o ID do objeto a ser deletado: ");
                    int idDeletado = leitorInt.nextInt();
                    repositorio.deletar(idDeletado);
                    break;
                case 3:
                    repositorio.exibir();
                    break;
                case 4:
                    repositorio.desfazer();
                    break;
                case 5:
                    System.out.println("Até breve...");
                    break;
                default:
                    System.out.println("Digite uma opção válida");

            }
        } while (escolha != 5);

        leitorInt.close();
    }
}