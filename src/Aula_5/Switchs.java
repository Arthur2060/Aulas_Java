package Aula_5;

import java.util.Scanner;

public class Switchs {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String cor_sem = teclado.nextLine();

        switch (cor_sem){
            case "Vermelho":
                System.out.println("Pare");
                break;

            case "Amarelo":
                System.out.println("Desacelere");
                break;

            case "Verde":
                System.out.println("Continue");
                break;

        }
    }
}
