package Aula6;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] vetor = new int[5];
        int resp = 0;

        for (int i = 0; i < 5; i++) {
            vetor[i] = teclado.nextInt();
        }
        for(int numeros : vetor){
            resp += numeros;
        }

        System.out.print("O vetor tem esses valores: ");
        for(int numeros : vetor){
            System.out.print(numeros + ", ");
        }
        System.out.println();
        System.out.printf("A soma dá = %d", resp);
        teclado.close();
    }
}
