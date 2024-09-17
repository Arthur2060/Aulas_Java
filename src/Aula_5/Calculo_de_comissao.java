package Aula_5;

import java.util.Scanner;

public class Calculo_de_comissao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Bem-vindo ao sistema de calculo de comissões, digite suas vendas: ");
        float vendas = teclado.nextFloat();
        System.out.println("R$");

        teclado.close();

        float comissao = 0;
        if (vendas <= 1000){
            comissao = 5 * (vendas / 100);
            System.out.printf("Ok, sua comissão será de %.2fR$", comissao);
        }
        else if (vendas > 1000 || vendas <= 5000){
            comissao = 10 * (vendas / 100);
            System.out.printf("Muito bem, sua comissão será de %.2fR$", comissao);
        }
        else if (vendas > 5000){
            comissao = 15 * (vendas / 100);
            System.out.printf("Perfeito, sua comissão será de %.2fR$", comissao);
        }
    }
}
