package Aula_6;

import java.util.Scanner;

public class Soma_de_Pares {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int c = 0;
        int n = 0;

        while (c <= 100){
            if(c % 2 == 0){
                System.out.println(c);

            }
            c++;
        }
    }
}
