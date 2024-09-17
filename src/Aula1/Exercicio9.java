package Aula1;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Este programa vai te dizer a quantia de números primos em certo intervalo de números" +
                " definidos pelo usuario.");

        System.out.println("Digite os dois números do intervalo:");

        System.out.print("número inicial: ");
        int n1 = teclado.nextInt();

        System.out.print("número final: ");
        int n2 = teclado.nextInt();

        teclado.close();

        int primos = 0;

        while (n1 <= n2){
            int divisivel = 0;
            int c;
            for (c = 1; c <= 10; c++) {
                if (n1 % c == 0) {
                    divisivel++;
                }
            }
            if (divisivel <= 2){
                primos++;
                System.out.printf("%d, ", n1);
            }
            n1++;
        }
        System.out.printf("%d números primos.", primos);
    }
}
