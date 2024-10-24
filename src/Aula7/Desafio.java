package Aula7;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] colunas = {"ID", "Nome", "Email", "Telefone"};
        String[][] cadastros = {null};
        cadastros[0] = colunas;

        byte resposta = 1;

        while (resposta > 0 && resposta <= 4) {
            System.out.println("Bem-vindo ao meu sistema de cadastros, o que quer fazer? " +
                    "(No momento só posso cadastrar até 10 usuários), para encerrar, digite zero ou menor.");
            System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
            System.out.println("X      X     X      Cadastrar[1]            X     X     X");
            System.out.println("XXXXXXXX     XXXXXXXExibir cadastros[2]xxxxxX     XXXXXXX");
            System.out.println("X      X     X      Atualizar usuário[3]    X     X     X");
            System.out.println("X      X     X      Deletar usuário[4]      X     X     X");
            System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

            resposta = teclado.nextByte();
            teclado.nextLine();

            String info;
            switch (resposta) {
                case 1:
                    cadastros = cadastrar(teclado, colunas, cadastros);
                    break;
                case 2:
                    exibirCadastros(cadastros);
                    break;
                case 3:
                    System.out.print("Digite uma informação do usuário para pesquisar: ");
                    info = teclado.nextLine();

                    atualizarUsuario(cadastros, colunas, info);
                    break;
                case 4:
                    System.out.print("Digite uma informação do usuário para deletar: ");
                    info = teclado.nextLine();

                    cadastros = deletarUsuario(cadastros, info);
                    break;
                default:
                    System.out.println("Numero invalido");
            }
        }

        teclado.close();
    }
    static String[][] copiarEmNovaMatriz(String[] colunas, String[][] matrizAntiga){
        String[][] matrizNova = new String[matrizAntiga.length + 1][colunas.length];

        for (int linha = 0; linha < matrizAntiga.length; linha++) {
            for (int coluna = 0; coluna < matrizAntiga[linha].length; coluna++) {
                matrizNova[linha][coluna] = matrizAntiga[linha][coluna];
            }
        }

        return matrizNova;
    }

    static int localizarUsuario(String[][] matriz,String info){
        int numeroDaLinha = 0;

        for(String[] linha : matriz){
            for(String item : linha){
                if (item.equals(info)) {
                    return numeroDaLinha;
                }
            }
            numeroDaLinha++;
        }

        return numeroDaLinha;
    }

    static String[][] cadastrar(Scanner teclado, String[] colunas, String[][] matrizAntiga){
        String[][] matrizNova = copiarEmNovaMatriz(colunas, matrizAntiga);

        for (int coluna = 0; coluna < matrizNova[0].length; coluna++) {
            System.out.print(colunas[coluna] + ": ");
            matrizNova[matrizNova.length - 1][coluna] = teclado.nextLine();
        }

        return matrizNova;
    }

    static void exibirCadastros(String[][] matriz){
        for(String[] linha : matriz){
            for(String item : linha) {
                System.out.print(item + "\t");
            }
            System.out.println();
        }
    }

    static void atualizarUsuario(String[][] matriz, String[] colunas,String info){
        Scanner teclado = new Scanner(System.in);

        int linha = localizarUsuario(matriz, info);

        for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
            System.out.print("Digite o " + colunas[coluna] + ": ");
            matriz[linha][coluna] = teclado.nextLine();
        }
    }

    static String[][] deletarUsuario(String[][] matrizAntiga,String info){
        int linhaAlvo = localizarUsuario(matrizAntiga, info);

        String[][] matrizNova = new String[matrizAntiga.length - 1][matrizAntiga[0].length];

        for (int linha = 0; linha < matrizAntiga.length; linha++) {
            for (int coluna = 0; coluna < matrizAntiga[linha].length; coluna++) {
                if (linha != linhaAlvo) {
                    matrizNova[linha][coluna] = matrizAntiga[linha][coluna];
                }
            }
        }

        return matrizNova;
    }
}