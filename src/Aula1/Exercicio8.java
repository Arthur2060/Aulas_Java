package Aula1;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("este programa ira ler um numero e contar sua quantidade de digitos.");
        System.out.print("Digite um numero: ");

        int n = teclado.nextInt();

        teclado.close();

        if (n > 10 && n < 100){
            System.out.println("Este numero tem 2 digitos");

        } else if (n > 100 && n < 1000){
            System.out.println("Este numero tem 3 digitos");

        } else if (n > 1000 && n < 10000){
            System.out.println("Este numero tem 4 digitos");

        } else if (n > 10000 && n < 100000){
            System.out.println("Este numero tem 5 digitos");

        } else if (n > 100000 && n < 1000000){
            System.out.println("Este numero tem 6 digitos");

        }else{
            System.out.println("Este numero possui um unico digito.");
        }
    }
}
