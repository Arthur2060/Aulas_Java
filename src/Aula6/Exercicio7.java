package Aula6;

import java.util.Scanner;

public class Exercicio7{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o numero: ");
                matriz[i][j] = teclado.nextInt();
            }
        }

        int n = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                n += matriz[i][j];
            }
        }

        System.out.println("O total deu " + n);

        teclado.close();
    }
}
