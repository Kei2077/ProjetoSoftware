import java.util.Scanner;

public class MainCarro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Carro carro = new Carro();
        System.out.println("Digite o cor do seu carro: ");
        carro.marca = sc.nextLine();
        System.out.println("Digite o ano do seu carro: ");
        carro.ano = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite o marca do seu carro: ");
        carro.cor = sc.nextLine();
        System.out.println("Digite o modelo do seu carro: ");
        carro.modelo = sc.nextLine();

        carro.exibirInformacoes();

    }
}
