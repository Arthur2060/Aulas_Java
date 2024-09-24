package Aula5.Exemplos;

import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {
        String nome = "Arthur", nomeDigitado;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        nomeDigitado = teclado.nextLine();

        while (!nome.equals(nomeDigitado)){
            System.out.print("Nome errado! digite novamente: ");
            nomeDigitado = teclado.nextLine();
        }
        System.out.println("Parabens, esse é seu nome");
        teclado.close();
    }
}
