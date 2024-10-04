package Aula7;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[][] cadastros = new String[10][4];
        String[] colunas = {"ID", "Nome", "Email", "Telefone"};

        cadastros[0][0] = colunas[0];
        cadastros[0][1] = colunas[1];
        cadastros[0][2] = colunas[2];
        cadastros[0][3] = colunas[3];

        byte res = 0;

        while (res != -1) {
            System.out.println("Bem-vindo ao meu sistema de cadastros, o que quer fazer? " +
                    "(No momento só posso cadastrar até 10 usuários)");
            System.out.println("X                   Cadastrar[1]                        x");
            System.out.println("X                   Exibir cadastros[2]                 x");

            res = teclado.nextByte();

            switch (res) {
                case 1:
                    cadastrar(cadastros, colunas);
                    break;
                case 2:
                    exibirCadastros(cadastros);
                    break;
            }
        }
        teclado.close();
    }

    static int localizarNull(String[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i][0] == null) {
                return i;
            } else {
                continue;
            }
        }
        return 11;
    }

    static void cadastrar(String[][] matriz, String[] colunas){
        Scanner teclado = new Scanner(System.in);
        String[] usuario = new String[4];

        for (int i = 0; i < usuario.length; i++) {
            System.out.print("Digite o " + colunas[i] + ": ");
            usuario[i] = teclado.nextLine();
        }

        for (int i = 0; i < matriz[localizarNull(matriz)].length; i++) {
            matriz[localizarNull(matriz)][i] = usuario[i];
        }
    }

    static void exibirCadastros(String[][] matriz){
        for(String[] linha : matriz){
            for(String item : linha) {
                if(item != null) {
                    System.out.print(item + "\t");
                }
            }
            System.out.println();
        }
    }

    static void atualizarUsuario(String[][] matriz){
        Scanner teclado = new Scanner(System.in);

        teclado.close();
    }
}
