package Aula8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Exercicio2 {
    public static void main(String[] args){
        File arquivo = new File("Alunos.txt");

        if (arquivo.exists()){
            System.out.println(lerArquivo(arquivo));
        }
    }

    public static String lerArquivo(File arquivo){
        String conteudo = "";

        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader(arquivo));
            String linha;
            while((linha = bufferedReader.readLine()) != null){
                conteudo += linha + "\n";
            }
            bufferedReader.close();
        }catch (IOException e){
            System.out.println("ERROR");
        }
        return conteudo;
    }
}
