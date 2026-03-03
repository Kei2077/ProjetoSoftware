import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        lanche x_burguer = new lanche("x-burguer", "pao", 200, 77);
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("-----lista de opcoes-----");
            System.out.println("1. fazer pedido");
            System.out.println("2. adicionar no estoque");
            System.out.println("3. informacao do lanche");
            System.out.println("4. alterar valor");
            System.out.println("5. alterar descricao");
            System.out.println("6. sair");

            System.out.println("digite a opcao desejada");
            String opcao = sc.nextLine();

            switch  (opcao) {
                case "1":
                    System.out.println("Quantos lanches voce deseja: ");
                    int quantidade = sc.nextInt();
                    sc.nextLine();

                    if (x_burguer.decrementarEstoque(quantidade)) {
                        System.out.println(" voce pediu " + quantidade + " " + x_burguer.getNome() +
                                " e o valor final, foi de R$ " + x_burguer.ValorTotal(quantidade));
                    } else {
                        System.out.println("pedido nao realizado");
                        System.out.println("quantidade invalida");
                    }
                    break;
                case "2":
                    System.out.println("Quantos lanches voce deseja adicionar: ");
                    int quantidadeEstoque = sc.nextInt();
                    sc.nextLine();
                    x_burguer.aumentarEstoque(quantidadeEstoque);
                    break;
                case "3":
                    System.out.println(x_burguer.toString());
                    break;
                case "4":
                    System.out.println("O lanche" + x_burguer.getNome() + " custa R$ " + x_burguer.getValor());
                    System.out.println("Informe o novo valor do lanche: ");
                    double valor = sc.nextDouble();
                    sc.nextLine();
                    x_burguer.setValor(valor);
                    break;
                case "5":
                    System.out.println("O lanche" + x_burguer.getNome() + " tem a seguinte descricao " + x_burguer.getDescricao());
                    System.out.println("Informe o nova descricao do lanche: ");
                    String descricao = sc.nextLine();
                    x_burguer.setDescricao(descricao);
                default:
                    System.out.println("Informe uma opcao valida");
                    break;
            }
        }
    }
}
