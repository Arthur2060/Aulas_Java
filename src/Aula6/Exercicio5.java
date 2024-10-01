package Aula6;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] nomes = new String[3];

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite um nome: ");
            nomes[i] = teclado.nextLine();
        }

        String resp = "";

        System.out.println("Digite nomes para pesquisar, digite f para parar");
        while (!resp.equals("f")){
            resp = teclado.nextLine();
            for (int i = 0; i < nomes.length; i++) {
                if (nomes[i].equals(resp)) {
                    System.out.println("Este nome está no vetor");
                    break;
                }
            }
        }

        teclado.close();
    }
}
