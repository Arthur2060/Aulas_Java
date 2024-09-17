package Aula1;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Este programa vai te dizer se um numero é ou não primo.");
        System.out.print("Digite um numero: ");
        int n = teclado.nextInt();

        teclado.close();

        int divisivel = 0;

        int c;
        for (c = 1; c < 10; c++){
            if (n % c == 0){
                divisivel ++;
            }
        }
        if (divisivel == 2){
            System.out.printf("%d é primo", n);
        }else{
            System.out.printf("%d não é primo", n);
        }
    }
}
