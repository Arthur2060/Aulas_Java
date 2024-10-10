package Aula2.Exemplos;

import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {
        //Criando objeto Scanner
        Scanner teclado = new Scanner(System.in);

        //Solicitando nome do usuário
        System.out.println("Qual é seu nome?");
        String nome = teclado.nextLine();

        //Exibindo nome digitado
        System.out.print("Olá, " + nome);

        //Fechando Scanner
        teclado.close();
    }
}
