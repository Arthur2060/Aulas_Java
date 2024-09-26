package Aula5;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n1 = 0;
        int n2 = 1;
        int c = 10;


        while (c > 0){
            System.out.println(n1);
            System.out.println(n2);
            n1 = n1 + n2;
            n2 = n1 + n2;
            c--;
        }

        teclado.close();
    }
}
