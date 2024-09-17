package Aula_6;

import java.util.Scanner;

public class Contagem_Regressiva {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int c;
        for(c = 10; c >= 1; c--){
            System.out.println(c);
        }
        System.out.println("Fim");
    }
}
