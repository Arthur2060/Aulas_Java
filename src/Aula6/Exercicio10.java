package Aula6;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[][] numeros = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite um numero: ");
                numeros[i][j] = teclado.nextInt();
            }
        }

        int n = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (numeros[i][j] > n){
                    n = numeros[i][j];
                }
            }
        }

        System.out.println("O maior numero é o " + n);

        teclado.close();
    }
}
