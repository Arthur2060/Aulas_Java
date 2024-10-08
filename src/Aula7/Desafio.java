package Aula7;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[][] cadastros = new String[10][4];               /*Cria uma matriz 10 x 4 para agir como banco de dados*/
        String[] colunas = {"ID", "Nome", "Email", "Telefone"}; /*Cria um vetor com os nomes pré prontos de cada seção*/

        /*Adiciona os nomes na primeira linha*/
        for (int i = 0; i < cadastros[0].length; i++) {
            cadastros[0][i] = colunas[i];
        }

        byte resposta = 1;

        /*Para se encaixar nas opções a resposta deve ser um numero entre 1 e 4, 0 ou menor encerrará o programa, maior que 4 exibirá uma mensagem de erro*/
        while (resposta > 0 && resposta <= 4) {
            System.out.println("Bem-vindo ao meu sistema de cadastros, o que quer fazer? " +
                    "(No momento só posso cadastrar até 10 usuários), para encerrar, digite zero ou menor.");
            System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
            System.out.println("X                   Cadastrar[1]                        X");
            System.out.println("X                   Exibir cadastros[2]                 X");
            System.out.println("X                   Atualizar usuário[3]                X");
            System.out.println("X                   Deletar usuário[4]                  X");
            System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

            resposta = teclado.nextByte();

            String info;
            switch (resposta) {
                case 1:
                    cadastrar(cadastros, colunas);
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

                    deletarUsuario(cadastros, info);
                    break;
                default:
                    System.out.println("Numero invalido");
            }
        }

        teclado.close();
    }

    static int localizarNull(String[][] matriz) {
        for (int linha = 1; linha < matriz.length; linha++) {
            if (matriz[linha][0] == null) {
                return linha;
            }
        }
        return 11;
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

    static void cadastrar(String[][] matriz, String[] colunas){
        Scanner teclado = new Scanner(System.in);
        int linha = localizarNull(matriz);

        for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
            System.out.print(colunas[coluna] + ": ");
            matriz[linha][coluna] = teclado.nextLine();
        }
    }

    static void exibirCadastros(String[][] matriz){
        for(String[] linha : matriz){
            for(String item : linha) {
                if (item == null){
                    break;
                }
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

    static void deletarUsuario(String[][] matriz,String info){
        int linha = localizarUsuario(matriz, info);
        String nulificar = null;

        for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
            matriz[linha][coluna] = nulificar;
        }
    }
}