package Aula8;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        File arquivo = criarArquivo("Alunos");
        String nome;

        for (int contador = 0; contador < 5; contador++) {
            System.out.print("Digite o nome de um aluno: ");
            nome = teclado.nextLine();
            alterarArquivo(nome, arquivo);
        }
    }

    public static File criarArquivo(String nome){
        return new File(nome + ".txt");
    }

    public static void alterarArquivo(String frase, File arquivo){
        try{
            FileWriter writer = new FileWriter(arquivo, true);
            writer.write(frase + "\n");
            writer.close();
        }catch (IOException e){
            System.out.println("ERROR");
        }
    }
}
