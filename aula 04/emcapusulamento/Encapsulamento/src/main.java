import entidades.conta;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        conta conta = new conta("joao", 5000);

        conta.titular = "joao";
        conta.saldo = 5000;
        System.out.println(conta.titular);
        System.out.println(conta.getSaldo());

    }
}
