package Aula7;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n;

        System.out.print("Digite um numero: ");
        n = teclado.nextInt();

        n = fatorial(n);

        System.out.print("O fatorial é " + n);
        teclado.close();
    }

    static int fatorial(int n){
        int r = n - 1;

        while (r != 1){
            n = r * n;
            r--;
        }

        return n;
    }
}
