package Exercises;

import java.util.Scanner;

public class Fibonacci_do_1_a_N {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("O objetivo deste código é criar uma sequencia de fibonacci " +
                "até certo ponto delimitado pelo usuário.");

        System.out.print("Primeiro digite o limite: ");
        int l = teclado.nextInt();

        int n1 = 0;
        int n2 = 1;
        int c;

        System.out.println(n1);
        System.out.println(n2);

        for (c = 2; c < l; c++){
            if (n1 > n2){
                n2 = n2 + n1;
                System.out.println(n2);
            }else{
                n1 = n1 + n2;
                System.out.println(n1);
            }
        }

    }
}
