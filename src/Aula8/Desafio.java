package Aula8;

import java.io.*;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        File Banco = new File("C:\\Users\\Aluno\\Desktop\\Banco de Dados.txt");

        String[] colunas = {"ID", "Nome", "Email", "Telefone"};
        String[][] cadastros = {{colunas[0], colunas[1], colunas[2], colunas[3]}};
        verificacaoDeExistencia(Banco);

        byte controlador = 0;

        while (controlador >= 0 && controlador < 5) {
            System.out.println("Bem-vindo ao sistema de cadastro de usuários, agora com um novo banco de dados provisório!" +
                    " O que você quer fazer?");
            System.out.println();
            System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
            System.out.println("X           Cadastrar novo usuário    [1]       X");
            System.out.println("X           Atualizar usuário         [2]       X");
            System.out.println("X           Excluir usuário           [3]       X");
            System.out.println("X           Exibir cadastros usuário  [4]       X");
            System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
            System.out.println();

            controlador = teclado.nextByte();
            teclado.nextLine();

            switch (controlador){
                case 1:
                    cadastros = cadastrarNovoUsuario(cadastros, colunas, teclado);
                    break;
            }
        }
        salvar(Banco, cadastros);
        teclado.close();
    }

    static void verificacaoDeExistencia(File arquivo) {
        try {
            if (arquivo.exists()) {
                System.out.println("Ok, pronto para funcionar!");
            } else {
                arquivo.createNewFile();
            }
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    static String[][] copiarEColar(String[][] bancoAntigo,String[][] bancoNovo, String[] colunas){
        for (int linha = 0; linha < bancoAntigo.length; linha++) {
            for (int item = 0; item < bancoAntigo[linha].length; item++) {
                bancoNovo[linha][item] = bancoAntigo[linha][item];
            }
        }

        return bancoNovo;
    }

    static String[][] cadastrarNovoUsuario(String[][] bancoAntigo, String[] colunas, Scanner teclado){
        String[][] bancoNovo = new String[bancoAntigo.length + 1][4];
        bancoNovo = copiarEColar(bancoAntigo, bancoNovo, colunas);

        for (int item = 0; item < bancoNovo[0].length; item++) {
            System.out.print(colunas[item] + ": ");
            bancoNovo[bancoNovo.length - 1][item] = teclado.nextLine();
        }
        return bancoNovo;
    }

    static String linhaParaString(String[] linha){
        String usuario = "";

        for(String item : linha){
            usuario += item + "|";
        }
        return usuario;
    }

    static String[][] bancoParaMatriz(File banco){
        try{
            BufferedReader bReader = new BufferedReader(new FileReader(banco));

        }catch (IOException e){
            throw new RuntimeException();
        }

        return antigoBanco;
    }

    static void salvar(File localBanco, String[][] cadastros){
        for(String[] linha : cadastros){
            try {
                String usuario = linhaParaString(linha);
                BufferedWriter bWriter = new BufferedWriter(new FileWriter(localBanco, true));
                bWriter.write(usuario + "\n");
                bWriter.close();
            }catch (Exception e){
                throw new RuntimeException();
            }
        }
    }
}