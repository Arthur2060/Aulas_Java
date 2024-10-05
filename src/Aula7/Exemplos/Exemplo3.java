package Aula7.Exemplos;

import java.util.Scanner;

public class Exemplo3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a base: ");
        byte base = teclado.nextByte();

        construtordeTriangulo(base);

        teclado.close();
    }

    static void construtordeTriangulo(byte base){
        for (byte i = 0; i <= base; i++) {
            for (byte j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
