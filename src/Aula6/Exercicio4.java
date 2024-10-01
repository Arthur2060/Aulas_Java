package Aula6;

import java.util.Scanner;

public class Exercicio4{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double[] notas = new double[4];

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite uma nota: ");
            notas[i] = teclado.nextDouble();
        }

        double n = 0;

        for(int i = 0; i < notas.length; i++){
            n += notas[i];
        }
        n = n / notas.length;

        System.out.println("A média das notas é " + n);
    }
}
