package Aula7;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double[] numeros = new double[3];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = teclado.nextDouble();
        }

        double n = qualOMaior(numeros);

        System.out.println("O maior numero é o " + n);

        teclado.close();
    }
    static double qualOMaior(double[] lista){
        double n = 0;

        for (double item : lista){
            if (n < item){
                n = item;
            }
        }

        return n;
    }
}
