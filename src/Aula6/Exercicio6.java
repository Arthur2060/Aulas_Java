package Aula6;

import java.util.Scanner;

public class Exercicio6{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[][] matriz = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("Digite um numero: ");
                matriz[i][j] = teclado.nextInt();
            }
        }
        for (int i = 0; i < 2; i++) {
            System.out.print("(");
            for (int j = 0; j < 2; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println(")");
        }
    }
}
