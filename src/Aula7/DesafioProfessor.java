package Aula7;

import java.util.Scanner;

public class DesafioProfessor {
    static String[][] matrizCadastro = {null};
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] cabecalho = {"ID", "Nome", "Email", "Telefone"};
        matrizCadastro[0] = cabecalho;
        int opcao = 0;

        do{
            System.out.println("Escolha uma opção:");
            System.out.println("\t1 - Para exibir os usuários cadastrados");
            System.out.println("\t2 - Para cadastrar um usuários cadastrados");
            System.out.println("\t3 - Para editar um usuários cadastrados");
            System.out.println("\t4 - Para deletar um usuários cadastrados");
            System.out.println("\t5 - Para sair");
            opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    exibirCadastro(matrizCadastro);
                    break;

                case 2:
                    cadastrarUsuario(scanner);
                    break;

                case 3:
                    break;

                case 4:
                    break;

                default:
                    System.out.println("Opção invalida, releia o menu!");
                    break;
            }
        }while (opcao != 5);
        System.out.println("Fim do programa!");
        scanner.close();
    }
    private static void cadastrarUsuario(Scanner teclado){
        System.out.println("Quantas pessoas você quer cadastrar?");
        int qtdPessoas;
        qtdPessoas = teclado.nextInt() + 1;
        teclado.nextLine();

        String[][] novaMatriz = new String[matrizCadastro.length + qtdPessoas][matrizCadastro[0].length];

        for (int linha = 0; linha < matrizCadastro.length; linha++) {
            for (int colunas = 0; colunas < matrizCadastro[linha].length; colunas++) {
                matrizCadastro[linha][colunas] = novaMatriz[linha][colunas];
            }
        }

        for (int linha = matrizCadastro.length; linha < novaMatriz.length; linha++) {
            novaMatriz[linha][0] = Integer.toString(linha);
            for (int coluna = 1; coluna < novaMatriz[linha].length; coluna++) {
                System.out.print(matrizCadastro[0][coluna] + ": ");
                novaMatriz[linha][coluna] = teclado.nextLine();
            }
            System.out.println("-----------------------------");
        }
        matrizCadastro = novaMatriz;
    }

    private static void exibirCadastro(String[][] cadastro){
        for(String[] linha : cadastro){
            for (String item : linha){
                System.out.print(item + "\t\t\t");
            }
            System.out.println();
        }
    }
}
