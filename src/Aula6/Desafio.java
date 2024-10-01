package Aula6;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] titulos = {"ID", "Nome", "Email", "Telefone"};
        int resp;

        System.out.println("Quantas pessoas você que cadastrar?");
        resp = teclado.nextInt() + 1;
        teclado.nextLine();

        String[][] cadastro = new String[resp][4];

        cadastro[0][0] = "ID";
        cadastro[0][1] = "Nome";
        cadastro[0][2] = "Email";
        cadastro[0][3] = "Telefone";

        for (int i = 1; i < cadastro.length; i++) {
            for (int j = 0; j < cadastro[i].length; j++) {
                System.out.print(titulos[j] + ": ");
                cadastro[i][j] = teclado.nextLine();
            }
            System.out.println("-----------------------------");
        }

        for (int i = 0; i < cadastro.length; i++) {
            for (int j = 0; j < cadastro[i].length; j++) {
                System.out.print(cadastro[i][j] + " ");
            }
            System.out.println();
        }

        teclado.close();
    }
}
