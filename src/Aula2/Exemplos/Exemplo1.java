package Aula2.Exemplos;

import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {
        //Criando objeto Scanner
        Scanner teclado = new Scanner(System.in);

        //Solicitando numero inteiro ao usuário
        System.out.print("Digite um numero inteiro:");
        int numeroInteiro = teclado.nextInt();

        //Exibindo numero digitado
        System.out.print("Você digitou " + numeroInteiro);

        //Fechando Scanner
        teclado.close();
    }
}
