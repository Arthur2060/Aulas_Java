package Aula8;

import java.io.*;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        File Banco = new File("Banco de Dados.txt");

        String[][] cadastros = {{"ID;", "Nome;", "Email;", "Telefone]"}};
        cadastros = verificacaoDeExistencia(Banco, cadastros);

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
                    cadastros = cadastrarNovoUsuario(cadastros, teclado);
                    break;

                case 2:
                    System.out.print("Digite uma informação do usuário que deseja apagar: ");
                    cadastros = atualizarUsuario(cadastros, teclado.nextLine(), teclado);
                    break;

                case 3:
                    System.out.print("Digite uma informação do usuário que deseja apagar: ");
                    cadastros = apagarUsuario(cadastros, teclado.nextLine());
                    break;

                case 4:
                    exibirCadastros(cadastros);
                    break;
            }
        }
        salvar(Banco, cadastros);
        teclado.close();
    }
    static int detectarLinhaDeUsuario(String[][] cadastros, String info){
        int alvo = 0;

        for (int linha = 0; linha < cadastros.length; linha++) {
            for (int coluna = 0; coluna < cadastros[linha].length; coluna++) {
                if (cadastros[linha][coluna].equals(info + ";") ||
                        cadastros[linha][coluna].equals(info + "]")){
                    alvo = linha;
                }
            }
        }
        System.out.println(alvo);
        return alvo;
    }

    static String[][] apagarUsuario(String[][] cadastros, String info){
        int alvo = detectarLinhaDeUsuario(cadastros, info);
        String[][] novosCadastros = new String[cadastros.length - 1][4];

        for (int linha = 0; linha < cadastros.length; linha++) {
            if (linha != alvo){
                for (int coluna = 0; coluna < cadastros[linha].length; coluna++) {
                        novosCadastros[linha][coluna] = cadastros[linha][coluna];
                }
            }
        }
        return novosCadastros;
    }

    static String[][] verificacaoDeExistencia(File arquivo, String[][] cadastros) {
        try {
            if (arquivo.exists()) {
                cadastros = importarBancoExistente(arquivo);
                System.out.println("Tudo pronto!");
            } else {
                if(arquivo.createNewFile()){
                    System.out.println("Ok, novo arquivo criado.");
                }
            }
        } catch (Exception e) {
            throw new RuntimeException();
        }
        return cadastros;
    }

    static String[][] importarBancoExistente(File banco){
        String conteudo = "";
        try{
            BufferedReader bReader = new BufferedReader(new FileReader(banco));
            String controlador;
            while ((controlador = bReader.readLine()) != null){
                    conteudo += controlador;
            }
            bReader.close();
        }catch(Exception e) {
            throw new RuntimeException();
        }
        String[] conteudoSeparado = conteudo.split("]");
        return converterConteudoEmMatriz(conteudoSeparado);
    }

    static String[][] converterConteudoEmMatriz(String[] conteudoSeparado){
        String[][] matriz = new String[conteudoSeparado.length][4];

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                matriz[linha][coluna] = conteudoSeparado[linha].split(";")[coluna]
                        + ((coluna == matriz[0].length - 1) ? "]" : ";");
            }
        }
        return matriz;
    }

    static String[][] copiarEColar(String[][] bancoAntigo,String[][] bancoNovo){
        for (int linha = 0; linha < bancoAntigo.length; linha++) {
            for (int item = 0; item < bancoAntigo[linha].length; item++) {
                bancoNovo[linha][item] = bancoAntigo[linha][item];
            }
        }
        return bancoNovo;
    }

    static String[][] cadastrarNovoUsuario(String[][] bancoAntigo, Scanner teclado){
        String[][] bancoNovo = new String[bancoAntigo.length + 1][4];
        String[] colunas = {"ID", "Nome", "Email", "Telefone"};

        bancoNovo = copiarEColar(bancoAntigo, bancoNovo);

        for (int item = 0; item < bancoNovo[0].length; item++) {
            System.out.print(colunas[item] + ": ");
            bancoNovo[bancoNovo.length - 1][item] = teclado.nextLine()
                    + ((item == bancoNovo[0].length - 1) ? "]" : ";");
        }
        return bancoNovo;
    }

    static String matrizParaString(String[][] matriz){
        String usuario = "";

        for (String[] linha : matriz){
            for (String item : linha){
                usuario += item;
            }
            usuario += "\n";
        }
        return usuario;
    }

    static void salvar(File localBanco, String[][] cadastros){
            try {
                String conteudo = matrizParaString(cadastros);
                BufferedWriter bWriter = new BufferedWriter(new FileWriter(localBanco));
                bWriter.write(conteudo);
                bWriter.close();
            }catch (Exception e){
                throw new RuntimeException();
            }
    }

    static void exibirCadastros(String[][] cadastros){
        for (String[] linha : cadastros){
            for(String item : linha){
                System.out.print(item);
            }
            System.out.println();
        }
    }

    static String[][] atualizarUsuario(String[][] cadastros, String info, Scanner teclado){
        String[] colunas = {"ID", "Nome", "Email", "Telefone"};
        int alvo = detectarLinhaDeUsuario(cadastros, info);

        for (int item = 0; item < cadastros[alvo].length; item++) {
            System.out.print(colunas[item] + ": ");
            cadastros[alvo][item] = teclado.nextLine()
                    + ((item == cadastros[0].length - 1) ? "]" : ";");
        }
        return cadastros;
    }
}