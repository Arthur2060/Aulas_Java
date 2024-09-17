package Aula_5;

import java.util.Scanner;

public class Hora_Extra {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Bem-vindo ao sistema " +
                "de cálculo de horas! Digite aqui o " +
                "total de horas semanais do trabalhador: ");
        int horas = teclado.nextInt();

        //Cria uma variavel para armazenar as horas extras
        int horasex = horas - 40;

        //Inicia a variavel que armazenara o bonus
        float bonus;

        //Se houverem horas extras
        if (horasex > 0){

            System.out.print("Qual o salário regular por hora?: ");
            float sal = teclado.nextFloat();

            //Cálcula o valor do bonus
            bonus = horasex * (sal + 5 * (sal / 100));

            //imprime o resultado
            System.out.printf("Ok, foram %d horas trabalhadas a mais, " +
            "com salário de %.2fR$ a hora, da um bonus " +
            "total de %.2fR$", horasex, sal, bonus);
        }
        //Caso não tenham horas extras
        else{
            System.out.println("Ótimo, nenhuma hora a mais para ser " +
                    "contabilizada");
        }
        teclado.close();
    }
}




