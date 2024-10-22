package Aula8;

import java.io.*;

public class Exercicio3 {
    public static void main(String[] args) {
        File arquivo = new File("Alunos.txt");

        if (arquivo.exists()){
            String conteudoOriginal = Exercicio2.lerArquivo(arquivo);
            geradorDeBackup(conteudoOriginal);
        }
    }

    static void geradorDeBackup(String conteudoOriginal){
        try{
            File backup = new File("backup_alunos.txt");
            if(backup.exists()){
                copiadorDeArquivo(conteudoOriginal);
            }else{
                backup.createNewFile();
                copiadorDeArquivo(conteudoOriginal);
            }
        }catch (Exception e){

        }
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
