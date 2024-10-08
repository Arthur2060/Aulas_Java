package Aula8.Exemplos;

import java.io.File;
import java.io.IOException;

public class Exemplo1 {
    public static void main(String[] args) {
        // Caminho do arquivo que será criado
        File arquivo = new File("exemplo.txt");

        // Verifica se o arquivo existe
        if (arquivo.exists()){
            System.out.println("O arquivo já existe");
        } else {
            try{
                // Tenta criar o arquivo
                if (arquivo.createNewFile()){
                    System.out.println("Arquivo criado com sucesso " + arquivo.getName());
                } else {
                    System.out.println("Falha ao criar o arquivo");
                }
            } catch (IOException e){
                System.out.println("Falha ao criar o arquivo");
            } finally {

            }
        }
    }
}
