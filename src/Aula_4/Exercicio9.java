package Aula_4;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("este programa recebera a hora atual (em formato 24 Horas) te dizer se estamos no horario " +
                "do dia tarde noite ou madrugada");
        System.out.print("Digite a hora: ");
        int hora = teclado.nextInt();

        teclado.close();

        if (hora >= 5 && hora < 12){
            System.out.println("Você está no horario da manhã");
        }else if (hora >= 12 && hora < 18){
            System.out.println("Você está no horario da tarde");
        }else if (hora >= 18 && hora < 22){
            System.out.println("Você está no horario da noite");
        }else{
            System.out.println("Você está no horario da madrugada");
        }
    }
}
