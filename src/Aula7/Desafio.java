package Aula7;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[][] cadastros = new String[10][4];
        String[] colunas = {"ID", "Nome", "Email", "Telefone"};

        for (int i = 0; i < cadastros[0].length; i++) {
            cadastros[0][i] = colunas[i];
        }

        byte res = 0;

        while (res != -1) {
            System.out.println("Bem-vindo ao meu sistema de cadastros, o que quer fazer? " +
                    "(No momento só posso cadastrar até 10 usuários)");
            System.out.println("X                   Cadastrar[1]                        x");
            System.out.println("X                   Exibir cadastros[2]                 x");
            System.out.println("X                   Atualizar usuário[3]                x");

            res = teclado.nextByte();

            switch (res) {
                case 1:
                    cadastrar(cadastros, colunas);
                    break;

                case 2:
                    exibirCadastros(cadastros);
                    break;

                case 3:
                    atualizarUsuario(cadastros, colunas);
                    break;
            }
        }

        teclado.close();
    }

    static int localizarNull(String[][] matriz) {
        for (int i = 1; i < matriz.length; i++) {
            if (matriz[i][0] == null) {
                return i;
            }
        }
        return 11;
    }

    static int localizarUsuario(String[][] matriz, String info){
        int n = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j].equals(info)){
                    n = i;
                    break;
                }
            }
        }
        System.out.println(n);
        return n;
    }

    static void cadastrar(String[][] matriz, String[] colunas){
        Scanner teclado = new Scanner(System.in);
        String[] usuario = new String[4];
        int linha = localizarNull(matriz);

        for (int i = 0; i < usuario.length; i++) {
            System.out.print("Digite o " + colunas[i] + ": ");
            usuario[i] = teclado.nextLine();
        }

        for(int i = 0; i < matriz[linha].length; i++) {
            matriz[linha][i] = usuario[i];
        }
    }

    static void exibirCadastros(String[][] matriz){
        for(String[] linha : matriz){
            for(String item : linha) {
                System.out.print(item + "\t");
            }
            System.out.println();
        }
    }

    static void atualizarUsuario(String[][] matriz, String[] colunas){
        Scanner teclado = new Scanner(System.in);
        String info;

        System.out.print("Digite uma informação para pesquisar: ");
        info = teclado.nextLine();

        int linha = localizarUsuario(matriz, info);

        for (int i = 0; i < matriz[linha].length; i++) {
            System.out.print("Digite o " + colunas[i] + ": ");
            matriz[linha][i] = teclado.nextLine();
        }
    }
}
