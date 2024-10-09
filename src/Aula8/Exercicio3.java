package Aula8;

import java.io.*;

public class Exercicio3 {
    public static void main(String[] args) {
        geradorDeBackup();
        copiadorDeArquivo(leitorDeArquivo());
    }

    static String leitorDeArquivo(){
        String conteudo = "";
        try{
            BufferedReader bufferReader = new BufferedReader(new FileReader("Alunos.txt"));
            String linha;
            while ((linha = bufferReader.readLine()) != null){
                if (linha != null){
                    conteudo += linha + "\n";
                }
            }
            bufferReader.close();
        }catch (IOException e){
            System.out.println("ERROR");
        }
        return conteudo;
    }

    static void geradorDeBackup(){
        new File("backup_alunos.txt");
    }

    static void copiadorDeArquivo(String original){
        try{
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("backup_alunos.txt"));
            bufferedWriter.write(original);
            bufferedWriter.close();
        }catch (IOException e){
            System.out.println("ERROR");
        }
    }
}
