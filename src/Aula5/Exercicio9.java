package Aula5;

import java.util.Random;
import java.util.Scanner;
import java.util.random.*;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        int n = random.nextInt(100);
        int p;

        System.out.println("Estou pensando em um numero, tente adivinhar.");
        do {
            p = teclado.nextInt();
            if(p > n){
                System.out.println("Um pouco menos...");
            }else{
                System.out.println("Um pouco mais...");
            }
        }while(p != n);
        System.out.println("Acertou!");
    }
}
