package Aula5;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = 17;
        int p;

        System.out.println("Estou pensando em um numero, tente adivinhar.");
        do {
            p = teclado.nextInt();
        }while(p != n);
        System.out.println("Acertou!");
    }
}
