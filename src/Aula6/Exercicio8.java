package Aula6;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double[][] matriz = new double[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Digite um numero: ");
                matriz[i][j] = teclado.nextDouble();
            }
        }

        double n = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                n += matriz[i][j];
            }
            System.out.printf("A soma da linha %d é %.1f \n", i, n);
            n = 0;
        }

        teclado.close();
    }
}
