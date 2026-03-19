import entidades.GerenciarListaProdutos;
import entidades.Produto;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        GerenciarListaProdutos lista = new GerenciarListaProdutos();

        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("Sistema CRUD de Produtos");
            System.out.println("1 - cadastrar Produto");
            System.out.println("2 - listar produtos");
            System.out.println("3 - atualizar Produto");
            System.out.println("4 - remover Produto");
            System.out.println("5 - sair");
            String opcao = input.nextLine();

            switch(opcao){
                case "1":
                    System.out.println("Digite o nome do Produto: ");
                    String nome = input.nextLine();

                    System.out.println("Digite o valor do Produto: ");
                    double preco = input.nextDouble();

                    System.out.println("Digite a quantidade do Produto: ");
                    int quantidade = input.nextInt();
                    Produto produto = new Produto(quantidade, preco, nome);
                    lista.adicionarProduto(produto);
                case "2":
                    lista.listarProdutos();
                case "3":
                    lista.listarProdutos();
                    System.out.println("Digite o id do Produto: ");
                    int idproduto = input.nextInt();
                    input.nextLine();

                    System.out.println("digite o nome do Produto: ");
                    nome = input.nextLine();

                    System.out.println("digite o valor do Produto: ");
                    preco = input.nextInt();

                    System.out.println("Digite a quantidade do Produto: ");
                    quantidade = input.nextInt();

                    lista.atualizarProduto(idproduto, nome, preco, quantidade);
            }
        }
    }

}
