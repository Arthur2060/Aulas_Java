package Exercises;

import java.util.Scanner;

public class Entre_10_e_20 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in); //Criando comando para ler valores digitados

        System.out.print("Digite um numero: "); //Recebe o numero a ser comparado
        float n = teclado.nextFloat();

        teclado.close();

        if (n >= 10 && n <= 20){ //Efetua a comparação
            System.out.printf("%.2f está entre 10 e 20!", n); //Mostra o resultado
        }else{
            System.out.printf("%.2f não está entre 10 e 20!", n); //Mostra o resultado.
        }
    }
}