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
                copiadorDeArquivo(conteudoOriginal, backup);
            }else{
                backup.createNewFile();
                copiadorDeArquivo(conteudoOriginal, backup);
            }
        }catch (Exception e){
            System.out.println("ERROR");
        }
    }

    static void copiadorDeArquivo(String original, File arquivo){
        try{
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(arquivo));
            bufferedWriter.write(original);
            bufferedWriter.close();
        }catch (IOException e){
            System.out.println("ERROR");
        }
    }
}
