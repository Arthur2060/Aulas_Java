package Aula8.Exemplos;

import java.io.*;

public class Exemplo4 {
    public static void main(String[] args) {
        // Escrita otimizada usando BufferWriter
        try {
            BufferedWriter bufferwrite = new BufferedWriter(new FileWriter("exemplo.txt"));
            bufferwrite.write("Texto a ser gravado no arquivo com buffer.");
            bufferwrite.close();
        } catch (Exception e) {
            throw new RuntimeException();
        }


        // Leitura otimizada usando BufferReader
        String linha;
        try {
            BufferedReader bufferread = new BufferedReader(new FileReader("exemplo.txt"));
            while ((linha = bufferread.readLine()) != null) {
                System.out.println(linha); //Lê linha por linha do arquivo
            }
            bufferread.close();
        } catch (Exception e) {
            throw new RuntimeException();
        }

    }
}
