package Aula5.Exemplos;

import java.util.Scanner;

public class Exemplo6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int par = 0;
        int impar = 0;
        int n;

        for (int i = 0; i < 10; i++) {

            System.out.print("Digite um numero: ");

            n = teclado.nextInt();

            if (n % 2 == 0) {
                par++;

            } else {
                impar++;

            }
        }
        System.out.printf("Existem %d pares e %d impares", par, impar);
        teclado.close();
    }
}
