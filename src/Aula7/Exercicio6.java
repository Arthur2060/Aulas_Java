package Aula7;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int n = teclado.nextInt();

        if (ePar(n)){
            System.out.println("Este numero é par!");
        }else{
            System.out.println("Este numero é impar!");
        }

        teclado.close();
    }
    static boolean ePar(int n){
        return n % 2 == 0;
    }
}
