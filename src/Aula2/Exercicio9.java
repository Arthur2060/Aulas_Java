package Aula2;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um numero fracionado: ");
        float pri = teclado.nextFloat();

        long seg = (long) pri;

        double ter = seg;

        System.out.println(pri);
        System.out.println(seg);
        System.out.println(ter);
    }
}
