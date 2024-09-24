package Aula5;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n = 0;
        int c;

        for (c = 1; c <= 5; c++){
            System.out.print("Digite uma nota: ");
            n = n + teclado.nextInt();
        }

        n = n / 5;

        System.out.printf("A média do aluno é: %d", n);

        teclado.close();
    }
}
