package Aula7;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int n1 = teclado.nextInt();

        System.out.print("Agora outro: ");
        int n2 = teclado.nextInt();

        int r = soma(n1, n2);

        System.out.printf("A soma de %d e %d é igual a %d", n1, n2, r);
        teclado.close();
    }
    static int soma(int n1, int n2){
        return n1 + n2;
    }
}
