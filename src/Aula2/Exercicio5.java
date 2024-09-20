package Aula2;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int nota1 = teclado.nextInt();
        int nota2 = teclado.nextInt();
        int nota3 = teclado.nextInt();

        int soma = nota1 + nota2 + nota3;

        System.out.println(soma);
    }



}
