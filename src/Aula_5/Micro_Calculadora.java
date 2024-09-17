package Aula_5;

import java.util.Scanner;

public class Micro_Calculadora {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Bem-vindo á sua micro calculadora!");

        System.out.print("Digite um numero: ");
        double n1 = teclado.nextDouble();

        System.out.print("Agora outro: ");
        double n2 = teclado.nextDouble();

        System.out.print("Qual operação devo fazer? [+,-,/,*]: ");
        String op = teclado.nextLine();

        teclado.close();

        switch (op){

            case "+":
                System.out.printf("%.2f %s %.2f = %.2f"
                        , n1, op, n2, n1 + n2);
            break;

            case "-":
                System.out.printf("%.2f %s %.2f = %.2f"
                        , n1, op, n2, n1 - n2);
                break;

            case "/":
                System.out.printf("%.2f %s %.2f = %.2f"
                        , n1, op, n2, n1 / n2);
                break;

            case "*":
                System.out.printf("%.2f %s %.2f = %.2f"
                        , n1, op, n2, n1 * n2);
                break;

            default:
                System.out.println("Operação invalida, tente novamente.");
        }
    }
}
