package Aula5.Exemplos;

import java.util.Scanner;

public class Exemplo7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int n = teclado.nextInt();
        int fatorial = 1;
        int c = n - 1;

        teclado.close();

        while (c > 0){
            n = n * fatorial;
            fatorial ++;
            c--;
        }

        System.out.println("A resposta é: " + n);
    }
}
