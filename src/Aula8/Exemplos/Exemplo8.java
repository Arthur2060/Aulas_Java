package Aula8.Exemplos;

public class Exemplo8 {
    public static void main(String[] args) {
        String linha = "ID:1 ;Nome:Arthur ;Idade:18";
        String[] tokens = linha.split(";");

        for (String token : tokens) {
            System.out.println(token);
        }

        String text = "";
        for (int i = 0; i < tokens.length; i++) {
             String Valor = tokens[i].split(":")[1];
             text += Valor + ",";
        }

        System.out.println(text);
    }
}
