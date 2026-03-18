import java.util.Scanner;
import Entidades.GerenciarProdutos;
import Entidades.Produto;

public class Main {
    public static void main(String[] args) {
        GerenciarProdutos gerenciar = new GerenciarProdutos();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== MENU DE OPÇÕES =====");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Atualizar produto");
            System.out.println("4 - Remover produto");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    System.out.print("Digite o nome do produto: ");
                    String nome = scanner.nextLine();

                    System.out.print("Digite o preço do produto: ");
                    double preco = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("Digite a quantidade em estoque: ");
                    int quantidade = scanner.nextInt();
                    scanner.nextLine();

                    Produto produto = new Produto(nome, preco, quantidade);
                    gerenciar.cadastrarProduto(produto);
                    break;

                case "2":
                    gerenciar.listarProdutos();
                    break;

                case "3":
                    gerenciar.listarProdutos();
                    System.out.print("Digite o ID do produto a ser atualizado: ");
                    int idAtualizar = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Digite o novo nome: ");
                    String novoNome = scanner.nextLine();

                    System.out.print("Digite o novo preço: ");
                    double novoPreco = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("Digite a nova quantidade: ");
                    int novaQuantidade = scanner.nextInt();
                    scanner.nextLine();

                    gerenciar.atualizarProduto(idAtualizar, novoNome, novoPreco, novaQuantidade);
                    break;

                case "4":
                    gerenciar.listarProdutos();
                    System.out.print("Digite o ID do produto a ser removido: ");
                    int idRemover = scanner.nextInt();
                    scanner.nextLine();

                    gerenciar.removerProduto(idRemover);
                    break;

                case "5":
                    System.out.println("Encerrando o sistema...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}
