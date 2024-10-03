package Aula7;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o numero: ");
        int n = teclado.nextInt();

        System.out.printf("O dobro de %d é %d", n, dobrar(n));

        teclado.close();
    }
    static int dobrar(int n){
        return n*2;
    }
}
