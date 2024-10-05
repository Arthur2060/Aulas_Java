package Aula7.Exemplos;

import java.util.Scanner;

public class Exemplo4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Deve ter um jeito mais facil de fazer isso, mas eu descubro depois...
        char[] alfabeto = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
                            'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        System.out.print("Digite um numero de 1 a 26:");
        byte n = teclado.nextByte();

        vasculharAlfabeto(alfabeto, n);
    }

    static void vasculharAlfabeto(char[] alfabeto, int alvo){
        for (int i = 0; i < alvo; i++) {
            System.out.print(alfabeto[i] + " ");
        }
    }
}
