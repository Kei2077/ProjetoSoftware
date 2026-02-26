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
        }
    }
}
