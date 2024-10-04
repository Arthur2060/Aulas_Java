package Aula7;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int b;
        int e;

        System.out.print("Digite um numero: ");
        b = teclado.nextInt();

        System.out.print("Ele será elevado a quanto?: ");
        e = teclado.nextInt();

        b = potencia(b, e);

        System.out.println("O resultado é " + b);

        teclado.close();
    }

    static int potencia(int b, int e){
        int n = b;

        while (e > 1){
            b = b * n;
            e--;
        }

        return b;
    }
}
