package Aula8.Exemplos;

public class Exemplo5 {
    public static void main(String[] args) {
        try {
            int resultado = 10 / 0; // Isso gera uma exceção do tipo ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Erro: divisão por zero.");
        } finally {
            System.out.println("Este bloco sempre será executado.");
        }
    }
}
