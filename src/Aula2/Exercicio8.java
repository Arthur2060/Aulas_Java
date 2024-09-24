package Aula2;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a largura: ");
        float largura = teclado.nextFloat();

        System.out.print("Digite a altura: ");
        float altura = teclado.nextFloat();

        float area = largura * altura;

        System.out.printf("Este é um retangulo de área = %.2f, largura = %.2f e " +
                "altura = %.2f", area, largura, altura);

        teclado.close();
    }
}
