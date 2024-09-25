package Aula5;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int res = 1;
        String par = "Pares: ";
        String impar = "Impares: ";

        System.out.println("Escreva os numeros");
        do{
            res = teclado.nextInt();
            if (res < 0){
                break;
            }
            if (res > 100){
                System.out.println("Numero muito grande");
                continue;
            }else if(res % 2 == 0){
                par += res + ", ";
            }else{
                impar += res + ", ";
            }

        }while(res > 0);

        System.out.println(par);
        System.out.println(impar);

        teclado.close();
    }
}
