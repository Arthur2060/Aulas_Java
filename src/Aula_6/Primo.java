package Aula_6;

import java.util.Scanner;

public class Primo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um numero: ");

        int n = teclado.nextInt();

        teclado.close();

        int c;
        int divisivel = 0;

        for (c = n; c > 1; c--){
            if (n % c == 0){
                divisivel++;
            }
        }
        if (divisivel > 1){
            System.out.println("Este numero não é primo.");
        }else{
            System.out.println("Este numero é primo.");
        }
    }
}
