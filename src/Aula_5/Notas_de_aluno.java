package Aula_5;

import java.util.Scanner;

public class Notas_de_aluno {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Bem-vindo, este programa " +
                "dirá se um aluno está aprovado, reprovado " +
                "ou em recuperação");

        System.out.print("Digite a nota: ");
        byte nota = teclado.nextByte();

        teclado.close();

        if (nota >= 7){
            System.out.println("Aluno aprovado");
        }
        else if(nota < 7 && nota >= 5){
            System.out.println("Passou para a recuperação");
        }
        else{
            System.out.println("Aluno reprovado");
        }
    }
}
