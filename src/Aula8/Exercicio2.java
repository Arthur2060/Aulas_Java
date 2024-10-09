package Aula8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercicio2 {
    public static void main(String[] args) {
        leitorDeArquivo();
    }
    public static void leitorDeArquivo(){
        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader("Alunos.txt"));

            String linha;
            while((linha = bufferedReader.readLine()) != null){
                System.out.println(linha);
            }
            bufferedReader.close();
        }catch (IOException e){
            System.out.println("ERROR");
        }
    }
}
