package Aula6;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String[] titulos = {"ID", "Nome", "Email", "Telefone"};
        int resp;

        System.out.println("Quantas pessoas você quer cadastrar?");
        resp = teclado.nextInt() + 1;
        teclado.nextLine();

        String[][] cadastro = new String[resp][4];

        cadastro[0] = titulos;

        Scanner teclado = new Scanner(System.in);
        for (int i = 1; i < cadastro.length; i++) {
            cadastro[i][0] = Integer.toString(i);
            for (int j = 1; j < cadastro[i].length; j++) {
                System.out.print(titulos[j] + ": ");
                cadastro[i][j] = teclado.nextLine();
            }
            System.out.println("-----------------------------");
        }
        teclado.close();

        for(String[] linha : cadastro){
            for (String item : linha){
                System.out.print(item + "\t\t");
            }
            System.out.println();
        }


    }
}
