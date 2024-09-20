package Aula2;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n1 = teclado.nextInt();
        int n2 = teclado.nextInt();

        if (n1 == n2) {
            System.out.println("Iguais");
        }else if (n1 > n2) {
            System.out.printf("%d é maior", n1);
        } else if (n2 > n1) {
            System.out.printf("%d é maior", n2);
        }
    }
}
