package Aula8.Exemplos;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Exemplo2 {
    public static void main(String[] args) {
        try{
            // Escrita em um arquivo
            FileWriter writer = new FileWriter("exemplo.txt");
            writer.write("Texto a ser gravado no arquivo.");
            writer.close(); //Sempre feche o stream após a escrita
        }catch (IOException e){
            System.out.println("Error");
        }

        try {
            // Leitura de um arquivo
            FileReader reader = new FileReader("exemplo.txt");
            int character;
            while ((character = reader.read()) != -1){
                System.out.print((char) character); // Lê cada caractere do arquivo
            }
            reader.close(); //Feche o stream após a leitura
        }catch (IOException e){
            System.out.println("Error");
        }
    }
}
