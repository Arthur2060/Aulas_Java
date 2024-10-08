package Aula8.Exemplos;

import java.io.FileWriter;
import java.io.IOException;

public class Exemplo3 {
    public static void main(String[] args) {
        String caminhoArquivo = "exemplo.txt";
        String conteudoNovo = "Este é o novo conteudo adicionado ao arquivo. \n";

        // Tenta abrir o arquivo em modo append para adicionar conteúdo sem apagar o já existente
        try (FileWriter fw = new FileWriter(caminhoArquivo, true)){
            fw.write(conteudoNovo); //adiciona o novo conteúdo ao final do arquivo
            System.out.println("Conteudo adicionado com sucesso ao arquivo.");
        } catch (IOException e){
            System.out.println("Erro ao tentar atualizar o arquivo.");
            e.printStackTrace();
        }
    }
}
