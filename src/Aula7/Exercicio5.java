package Aula7;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double[] notas = new double[3];

        for(int i = 0; i < notas.length; i++){
            System.out.print("Digite uma nota: ");
            notas[i] = teclado.nextDouble();
        }

        double media = media(notas);

        System.out.println("A media do aluno é " + media);

        teclado.close();
    }
    static double media(double[] notas){
        double n = 0;

        for (int i = 0; i < notas.length; i++) {
            n += notas[i];
        }
        n = n / notas.length;

        return n;
    }
}
