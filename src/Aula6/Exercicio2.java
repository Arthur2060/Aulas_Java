package Aula6;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] letras = {"A", "B", "C", "D", "E", "F"};

        System.out.print("Digite uma letra: ");
        String target = teclado.nextLine();
        boolean valido = true;

        for(int contador = 0; contador < letras.length; contador++){
            if (letras[contador].equals(target)){
                valido = true;
                break;
            }else{
                valido = false;
            }
        }
        if (valido){
            System.out.println("Essa letra está no vetor.");
        }else{
            System.out.println("Essa letra não está no vetor.");
        }
        teclado.close();
    }
}
