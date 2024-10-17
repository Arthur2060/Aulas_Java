package Aula8.Exemplos;

public class Exemplo8 {
    public static void main(String[] args) {
        String linha = "ID:1 ;Nome:Arthur ;Idade:18 ";
        String[] tokens = linha.split(";");

        for (String token : tokens) {
            System.out.println(token);
        }

        String text = "";
        for (String token : tokens) {
             String Valor = token.split(":")[1];
             text += Valor + ",";
        }

        System.out.println(text);

        String[] idade = tokens[2].split(":");

        int ValorIdade = Integer.parseInt(idade[1].trim());

        System.out.println("A idade agora é: " + (ValorIdade + 1));
    }
}
