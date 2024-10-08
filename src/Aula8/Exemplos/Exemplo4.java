package Aula8.Exemplos;

import java.io.*;

public class Exemplo4 {
    public static void main(String[] args) {
        // Escrita otimizada usando BufferWriter
        try {
            BufferedWriter bufferwrite = new BufferedWriter(new FileWriter("exemplo.txt"));
            bufferwrite.write("Texto a ser gravado no arquivo com buffer.");
            bufferwrite.close();
        } catch (IOException e) {
            System.out.println("erro");
        }


        // Leitura otimizada usando BufferReader

        String linha;
        while (true){
            try {
                BufferedReader bufferread = new BufferedReader(new FileReader("exemplo.txt"));
                if (!((linha = bufferread.readLine()) != null)) break;
                System.out.println(linha); //Lê linha por linha do arquivo
                bufferread.close();
            } catch (IOException e) {
                System.out.println("Error");
            } finally {

            }
        }

    }
}
