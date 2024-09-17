package Exercises;

import java.util.Scanner;

public class Ordenador {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("O objetivo deste programa é receber três numeros e ordena-los de maneira crecente ou decrecente");

        System.out.print("Digite os três numeros:");

        System.out.print("1º: ");
        int n1 = teclado.nextInt();

        System.out.print("2º: ");
        int n2 = teclado.nextInt();

        System.out.print("2º: ");
        int n3 = teclado.nextInt();

        System.out.print("Quer que organizae em ordem crecente [1] ou decrecente [2]?: ");
        int res = teclado.nextInt();

        teclado.close();

        int p1 = 0;
        int p2 = 0;
        int p3 = 0;

        switch(res){
            case 1:
                if (n1 < n2 && n1 < n3){
                    p3 = n3;
                } else if (n2 < n1 && n2 < n3) {
                    p3 = n2;
                }else{
                    p3 = n1;
                }

                if (n1 > n2 && n1 > n3){
                    p1 = n3;
                } else if (n2 > n1 && n2 > n3) {
                    p1 = n2;
                }else{
                    p1 = n1;
                }
                break;

            case 2:
                if (n1 < n2 && n1 < n3){
                    p3 = n1;
                } else if (n2 < n1 && n2 < n3) {
                    p3 = n2;
                }else{
                    p3 = n3;
                }

                if (n1 > n2 && n1 > n3){
                    p1 = n1;
                } else if (n2 > n1 && n2 > n3) {
                    p1 = n2;
                }else{
                    p1 = n3;
                }
                break;
        }

        if (p1 != n1 && p3 != n1){
            p2 = n1;
        } else if (p1 != n2 && p3 != n2) {
            p2 = n2;
        } else if (p1 != n3 && p3 != n3){
            p2 = n3;
        }

        System.out.printf("%d,%d,%d", p1, p2, p3);
    }
}
