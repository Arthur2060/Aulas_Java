package Aula2.Exemplos;

import java.util.Scanner;

public class Exemplo3 {
    public static void main(String[] args) {
        //Criando objeto Scanner
        Scanner teclado = new Scanner(System.in);

        //Solicitando nome do usuário
        System.out.println("Qual é seu nome?");
        String nome = teclado.nextLine();

        //Solicitando idade do usuário
        System.out.println("Quantos anos você tem?");
        byte idade = teclado.nextByte();

        //Solicitando peso do usuário
        System.out.println("Quantos kilos você tem?");
        double peso = teclado.nextDouble();

        //Exibindo os dados recebidos
        System.out.print("Nome: " + nome);
        System.out.print("Idade: " + idade);
        System.out.print("Peso: " + peso + "kg");

        //Fechando Scanner
        teclado.close();
    }
}
