package Excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisaoZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {


            System.out.print("Digite um numero: ");
            double n1 = input.nextInt();

            System.out.print("Digite outro numero: ");
            double n2 = input.nextInt();
            input.nextLine();

            double divisao = n1 / n2;
            System.out.println("Resultado: " + divisao);
            input.close();
        } catch (InputMismatchException e) {
            System.out.println("Informe um valor numerico");
        }
        input.close();
    }
}
