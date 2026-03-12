import entidades.Aluno;
import entidades.GerenciarListaAlunos;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        GerenciarListaAlunos lista = new GerenciarListaAlunos();

        Scanner ler = new Scanner(System.in);
        while (true){
            System.out.println("Sistema CRUD de Alunos");
            System.out.println("1 - cadastrar aluno");
            System.out.println("2 - listar aulos");
            System.out.println("3 - alterar aluno");
            System.out.println("4 - excluir aluno");
            System.out.println("5 - sair");
            String op = ler.nextLine();

            switch (op){
                case "1" -> {
                    System.out.println("Digite o nome do aluno: ");
                    String nome = ler.nextLine();

                    System.out.println("Digite a nota do aluno: ");
                    double nota1 = ler.nextDouble();

                    System.out.println("Digite a nota do aluno: ");
                    double nota2 = ler.nextDouble();
                    Aluno aluno = new Aluno(nota1, nota2, nome);
                    lista.adicionarAluno(aluno);
                }
                case "2" -> {
                    lista.listarAlunos();
                }
                case "3" -> {
                    lista.listarAlunos();
                    System.out.print("digite o id do aluno: ");
                    int idAluno = ler.nextInt();
                    ler.nextLine();

                    System.out.println("digite o nome o aluno: ");
                    String nome = ler.nextLine();

                    System.out.println("digite a nota do aluno: ");
                    double nota1 = ler.nextDouble();
                    ler.nextLine();

                    System.out.println("digite a nota do aluno: ");
                    double nota2 = ler.nextDouble();
                    ler.nextLine();

                    lista.alterarInformacoesAluno(idAluno, nome, nota1, nota2);

                }
                case "4" -> {
                    lista.listarAlunos();
                    System.out.println("digite o id do aluno: ");
                    int idAluno = ler.nextInt();
                    ler.nextLine();

                    lista.removerAluno(idAluno);
                }
                case "5" -> {
                    System.out.println("saindo...");
                    return;
                }
            }

        }

    }
}
