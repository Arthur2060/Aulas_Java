package Aula_5;

import java.util.Scanner;

public class VerificacaoDeIdade {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Bem-vindo, para entrar, diga-me sua idade atual:");

        byte idade = teclado.nextByte();

        if (idade > 18){
            System.out.println("Acesso aprovado!");
        }else{
            System.out.println("Acesso negado!");
        }
    }
}
