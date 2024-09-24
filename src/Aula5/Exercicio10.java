package Aula5;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int res = 1;
        int par = 0;
        int impar = 0;

        do{
            res = teclado.nextInt();
            if (res > 100){
                System.out.println("Numero muito grande");
                continue;
            }else if(res % 2 == 0){
                par = res;
            }else{
                impar = res;
            }

        }while(res > 0);

        System.out.println("Pares = ");
        System.out.println("Impares = ");

        teclado.close();
    }
}
