package Aula6;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean[] vetor = new boolean[8];
        int resp;

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Verdadeiro ou falso? [1 ou 2]:");
            resp = teclado.nextInt();
            if (resp == 1){
                vetor[i] = true;
            }else if (resp == 2){
                vetor[i] = false;
            }else{
                System.out.println("Numero invalido!");
                continue;
            }
        }

        int falsos = 0;
        int verdadeiros = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == true){
                verdadeiros++;
            }else{
                falsos++;
            }
        }
        System.out.printf("Verdadeiros: %d \n", verdadeiros);
        System.out.printf("Falsos: %d", falsos);
        teclado.close();
    }
}
