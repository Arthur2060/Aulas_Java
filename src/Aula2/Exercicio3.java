package Aula2;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int inteiro = teclado.nextInt();

        teclado.close();
        double dupla;

        dupla = inteiro;

        System.out.println(dupla);
    }
}
