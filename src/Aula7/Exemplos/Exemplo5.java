package Aula7.Exemplos;

import java.util.Scanner;

public class Exemplo5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int nvogais;

        System.out.print("Digite uma frase: ");
        String frase = teclado.nextLine();

        nvogais = contatorDeVogais(frase);

        System.out.println("Essa frase tem " + nvogais + " vogais");

        teclado.close();
    }

    static int contatorDeVogais(String frase){
        int nvogais = 0;
        char[] vogais = {'a', 'e', 'i', 'o', 'u'};
        frase = frase.toLowerCase();
        char[] fraseSeparada = frase.toCharArray();

        for(char letra : fraseSeparada){
            for(char vogal : vogais){
                if(vogal == letra){
                    nvogais++;
                }
            }
        }

        return nvogais;
    }
}
