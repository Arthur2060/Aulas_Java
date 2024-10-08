package Aula8;

import java.io.File;

public class Exercicio1 {
    public static void main(String[] args) {
        File desktop = new File("C:/Users/Aluno/Desktop");

        if (desktop.exists()){
            System.out.println("Ok");
        }
        else{
            System.out.println("Error");
        }
    }
}
