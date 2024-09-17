package Aula2;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = teclado.nextInt();

        System.out.print("Digite sua altura: ");
        float altura = teclado.nextFloat();

        System.out.print("Digite seu peso: ");
        double peso = teclado.nextDouble();

        System.out.println("idade: " + idade);
        System.out.println("altura: " + altura);
        System.out.println("peso: " + peso);

        teclado.close();
    }
}
