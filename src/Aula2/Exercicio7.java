package Aula2;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        boolean cond1 = 2 > 1;
        boolean cond2 = 3 != 3;
        boolean cond3 = 5 < 3;

        if(cond1 || cond2){
            System.out.println(cond3);
        }
        if (cond2 && cond3){
            System.out.println(cond1);
        }
    }
}
