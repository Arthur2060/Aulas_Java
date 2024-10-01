package Aula6.Exemplos;

import java.util.Scanner;

public class Exemplo3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] vetor = new int[4];
        String mostravalor = "vetor{";

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o"+ i +" numero");
        }
    }
}
