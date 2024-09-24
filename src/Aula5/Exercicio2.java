package Aula5;

public class Exercicio2 {
    public static void main(String[] args) {
        int c = 0;
        int n = 0;

        while (c <= 100){
            if(c % 2 == 0){
                n = n + c;
            }
            c++;
        }
        System.out.println(n);
    }
}
