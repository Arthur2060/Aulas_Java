package Aula_5;

import java.util.Scanner;

public class ClassificacaoDeProdutos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Bem-vindo, digite o código a ser verificado. [Pressione 4 para terminar]");

        byte cod = 5;

        while (cod != 4){
            cod = teclado.nextByte();

            switch (cod) {
                case 1:
                    System.out.println("Eletrônicos");
                    break;
                case 2:
                    System.out.println("Alimentos");
                    break;
                case 3:
                    System.out.println("Vestuário");
                    break;
                default:
                    System.out.println("Apenas numeros de 1 a 3 ou 4 para terminar o processo");
            }
        teclado.close();
        }
    }
}
