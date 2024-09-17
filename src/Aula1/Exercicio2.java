package Aula1;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um numero: "); //Adiciona os numeros a serem comparados
        float n1 = teclado.nextFloat();

        System.out.print("Agora outro: "); //Adiciona os numeros a serem comparados
        float n2 = teclado.nextFloat();

        teclado.close();

        if (n1 > n2){ //Comparador
            System.out.printf("%.2f é maior do que %.2f", n1, n2);
        } else if (n2 > n1) {
            System.out.printf("%.2f é maior do que %.2f", n2, n1);
        }else{
            System.out.print("Ambos são iguais");
        }
    }
}
