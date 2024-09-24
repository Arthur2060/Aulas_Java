package Aula5.Exemplos;

import java.util.Scanner;

public class Exemplo4 {
    public static void main(String[] args) {
        String nome = "Arthur", nomeDigitado;
        Scanner teclado = new Scanner(System.in);

        do{
        System.out.print("Digite seu nome: ");
        nomeDigitado = teclado.nextLine();
        }while (!nomeDigitado.equals(nome));

        System.out.println("Parabens, esse é seu nome.");
        teclado.close();
    }
}
