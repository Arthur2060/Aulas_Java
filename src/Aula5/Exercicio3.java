package Aula5;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o numero a ser calculado: ");

        int n = teclado.nextInt();

        teclado.close();

        int c = n - 1;

        do{
            n = n * c;
            c--;

        }while(c >= 2);

        System.out.println(n);
    }
}