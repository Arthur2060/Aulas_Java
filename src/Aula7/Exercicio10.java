package Aula7;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double peso;
        double altura;

        System.out.print("Digite seu peso em Kg: ");
        peso = teclado.nextDouble();

        System.out.print("Digite sua altura em metros: ");
        altura = teclado.nextDouble();

        double Imc = imc(peso, altura);

        System.out.println("Seu IMC é de " + Imc);

        teclado.close();
    }

    static double imc(double p, double a){
        return p / (a * a);
    }
}
