package Aula4;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Quanto deu sua compra?");

        float compra = teclado.nextFloat();

        teclado.close();

        if (compra > 100){
            compra = compra * 10;
            compra = compra / 100;
            System.out.printf("Ok, o total com desconto deu %.2f R$", compra);
        }else{
            System.out.println("Ótimo, tenha um bom dia!");
        }
    }
}
