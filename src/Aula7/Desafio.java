package Aula7;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[][] cadastros = new String[10][4];   //Cria uma matriz 10 x 4 para agir como banco de dados;
        String[] colunas = {"ID", "Nome", "Email", "Telefone"}; //Cria um vetor com os nomes pré prontos de cada seção;

        //Adiciona os nomes na primeira linha;
        for (int i = 0; i < cadastros[0].length; i++) {
            cadastros[0][i] = colunas[i];
        }

        byte resposta = 1;

        //Para se encaixar nas opções a resposta deve ser um numero entre 1 e 4, 0 ou menor encerrará o programa, maior que
        //4 exibirá uma mensagem de erro;
        while (resposta > 0 && resposta <= 4) {
            resposta = escolhaDeOpcao(cadastros, colunas);
        }

        teclado.close();
    }

    static byte escolhaDeOpcao(String[][] cadastros, String[] colunas){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Bem-vindo ao meu sistema de cadastros, o que quer fazer? " +
                "(No momento só posso cadastrar até 10 usuários), para encerrar, digite zero ou menor.");
        System.out.println("X                   Cadastrar[1]                        X");
        System.out.println("X                   Exibir cadastros[2]                 X");
        System.out.println("X                   Atualizar usuário[3]                X");
        System.out.println("X                   Deletar usuário[4]                  X");

        byte resposta = teclado.nextByte();

        switch (resposta) {
            case 1:
                cadastrar(cadastros, colunas);
                break;

            case 2:
                exibirCadastros(cadastros);
                break;

            case 3:
                atualizarUsuario(cadastros, colunas);
                break;

            case 4:
                deletarUsuario(cadastros);
                break;

            default:
                System.out.println("Numero invalido");
        }
        return resposta;
    }

    static int localizarNull(String[][] matriz) {
        for (int i = 1; i < matriz.length; i++) {
            if (matriz[i][0] == null) {
                return i;
            }
        }
        return 11;
    }

    static int localizarUsuario(String[][] matriz){
        Scanner teclado = new Scanner(System.in);
        int n = 0;

        System.out.print("Digite uma informação do usuário para pesquisar: ");
        String info = teclado.nextLine();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] != null && matriz[i][j].equals(info)) {
                    n = i;
                    break;
                }
            }
        }

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
                if (item == null){
                    break;
                }
                System.out.print(item + "\t");
            }
            System.out.println();
        }
    }

    static void atualizarUsuario(String[][] matriz, String[] colunas){
        Scanner teclado = new Scanner(System.in);

        int linha = localizarUsuario(matriz);

        for (int i = 0; i < matriz[linha].length; i++) {
            System.out.print("Digite o " + colunas[i] + ": ");
            matriz[linha][i] = teclado.nextLine();
        }
    }

    static void deletarUsuario(String[][] matriz){
        int linha = localizarUsuario(matriz);
        String nulificar = null;

        for (int i = 0; i < matriz[linha].length; i++) {
            matriz[linha][i] = nulificar;
        }
    }
}