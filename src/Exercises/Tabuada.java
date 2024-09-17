package Exercises;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Este programa criará uma tabuda de 10 baseada em QUALQUER numero que você escreva");
        System.out.print("Primeiro digite um numero: ");
        float n = teclado.nextFloat();

        teclado.close();

        int c;
        for (c = 0; c <= 10; c++){
            System.out.printf("%.2f X %d = %.2f \n", n, c, n*c);//
        }
    }
}
