package Aula7.Exemplos;

import java.util.Scanner;

public class Exemplo6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String frase;

        System.out.print("Digite uma frase: ");
        frase = teclado.nextLine();

        char[] fraseSeparada = separaString(frase);
        String fraseSemVogaisTeste = eliminaVogais(fraseSeparada).toString();

        System.out.println(fraseSemVogaisTeste);

        teclado.close();
    }

    static char[] separaString(String frase){
        frase = frase.toLowerCase();

        return frase.toCharArray();
    }

    static char[] eliminaVogais(char[] fraseSeparada){
        char[] vogais = {'a', 'e', 'i', 'o', 'u'};
        int nvogais = 0;

        for(char letra : fraseSeparada){
            for (char vogal : vogais){
                if (letra == vogal){
                    nvogais++;
                }
            }
        }

        nvogais = fraseSeparada.length - nvogais;

        char[] fraseSemVogais = new char[nvogais];
        int contador = 0;

        for(char letra : fraseSeparada){
            for (char vogal : vogais){
                if (letra != vogal) {
                    fraseSemVogais[contador] = letra;
                }
            }
            contador++;
        }
        
        return fraseSemVogais;
    }

}
