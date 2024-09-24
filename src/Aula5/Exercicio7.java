package Aula5;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int res = 0;
        do {
            System.out.print("Digite uma nota: ");
            res = teclado.nextInt();
        }while (res > 10 || res < 0);

        teclado.close();
    }
}
