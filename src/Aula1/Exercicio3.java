package Java.Exercises;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Adicionando numero alvo
        System.out.println("Este programa ira receber um numero (n) e depois mostrar a soma de todos os numeros de 1 a n");
        System.out.print("Devo contar até qual numero? ");
        int n = teclado.nextInt();

        teclado.close();

        //Variaveis necessárias
        int c;
        int n1 = 0;
        int n2 = 1;

        //Loop de contagem
        for (c = 1 ; c <= n ; c++){
            n1 = n1 + n2;
            n2 ++;
        }
        System.out.println(n1);
    }
}
