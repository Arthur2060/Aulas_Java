package Aula_5;

import java.util.Scanner;

public class Conversor_de_Moeda {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("O objetivo deste programa é fazer a conversão para diferente valores de moedas. (valores do" +
                "dia 17/09/24");

        System.out.print("Digite o valor em reais: ");
        float valorR = teclado.nextFloat();

        System.out.print("Devo converter para qual moeda? [Dolar, Euro, Libra Egipcia]: ");
        String conv = teclado.next();

        teclado.close();

        float valorD;

        switch (conv){
            case"Dolar":
                valorD = (float) 0.18 * valorR;
                System.out.printf("%.2fBRL$ equivale á %.2fUSD$", valorR, valorD);
                break;

            case"Euro":
                valorD = (float) 0.16 * valorR;
                System.out.printf("%.2fBRL$ equivale á %.2fEUR$", valorR, valorD);
                break;

            case"Libra Egipcia":
                valorD = (float) 0.11 * valorR;
                System.out.printf("%.2fBRL$ equivale á %.2fEGP$", valorR, valorD);
                break;
        }
    }
}
