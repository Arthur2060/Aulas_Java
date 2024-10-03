package Aula7;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double celsius;
        double farenheight;

        System.out.print("Digite aqui a temperatura em celsius: ");
        celsius = teclado.nextDouble();

        farenheight = conversor(celsius);

        System.out.println(celsius + "° equivale a " + farenheight + "° em farenheight");

    }
    static double conversor(double c){
        return c * 18 + 32;
    }
}
