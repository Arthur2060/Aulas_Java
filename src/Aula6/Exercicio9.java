package Aula6;

import java.util.Scanner;

public class Exercicio9{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[][] numeros = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite um numero: ");
                numeros[i][j] = teclado.nextInt();
            }
        }

        int pares = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (numeros[i][j] % 2 == 0){
                    pares++;
                }
            }
        }
        System.out.printf("Existem %d numeros pares nesta matriz.", pares);

        teclado.close();
    }
}
