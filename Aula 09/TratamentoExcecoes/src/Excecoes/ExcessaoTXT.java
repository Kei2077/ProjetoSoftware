package Excecoes;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcessaoTXT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String Opcao;

        while(true){
            System.out.println("===Sistema Cadastro===");
            System.out.println("1- Cadastrar");
            System.out.println("2- Listar");
            System.out.println("3- Sair");
            Opcao = input.nextLine();

            switch(Opcao){
                case "1":
                    System.out.print("Digite o nome: ");
                    String nome = input.nextLine();

                    System.out.print("Digite a idade: ");
                    int idade = input.nextInt();
                    input.nextLine();

                    try {
                        FileWriter fw = new FileWriter("dados.txt", true);
                        write(nome = "," + idade + "\n");
                        write.close;
                        System.out.println("Cadastro cadastrado com sucesso!");
                    } catch (IOException e) {
                        System.out.println("Erro ao criar o arquivo");
                        System.out.println("detalhe: "  + e.getMessage());
                    } catch (InputMismatchException e) {
                        System.out.println("Informe um valor numerico");
                        System.out.println("detalhe: "  + e.getMessage());
                    }
                    break;
                case "2":
                    try {
                        BufferedReader reader = new BufferedReader(new FileReader("dados.txt"));
                        String linha;

                        System.out.println("===Lista de pessoas===");

                        while((linha = reader.readLine()) != null) {
                            linha = reader.readLine();
                            System.out.println(linha);
                        }
                    } catch (FileNotFoundException e) {
                        System.out.println("Erro ao ler o arquivo");
                        System.out.println("detalhe: "  + e.getMessage());
                    } catch (IOException e) {
                        System.out.println("Erro ao ler o arquivo");
                        System.out.println("detalhe: "  + e.getMessage());
                    }
                    break;
            }
        }
    }
}
