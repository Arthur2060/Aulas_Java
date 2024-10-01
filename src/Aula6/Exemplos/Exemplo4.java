package Aula6.Exemplos;

import java.util.Scanner;

public class Exemplo4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String mostravalor = "matriz{\n";

        int[][] matriz = new int[2][2];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Digite o numero da posição " + i + " " + j);
                matriz[i][j] = teclado.nextInt();
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            mostravalor += "\t{";
            for (int j = 0; j < matriz[i].length; j++) {
                mostravalor += matriz[i][j];
                mostravalor += j < (matriz[i].length - 1) ? ", " : "}";
            }
            mostravalor += i < matriz.length ? ",\n" : "\n}";
        }
        System.out.println(mostravalor);
        teclado.close();
    }
}
