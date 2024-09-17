package Aula_5;

import java.util.Scanner;

public class Pedra_Papel_Tesoura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String pedra = "     _______\n" +
                       " ---'   ____)\n" +
                       "       (_____)\n" +
                       "       (_____)\n" +
                       "       (____)\n" +
                       "---.__(___)";

        String tesoura = "    _______\n" +
                         "---'   ____)____\n" +
                         "           ______)\n" +
                         "       __________)\n" +
                         "      (____)\n" +
                         "--.__(___)";

        String papel = "    _______\n" +
                       "---'   ____)____\n" +
                       "           ______)\n" +
                       "         _______)\n" +
                       "        _______)\n" +
                       "---.__________)\n";

        System.out.println("ヽ(´ー`)人(´∇｀)人(`Д´)ノヽ(´ー`)人(´∇｀)人(`Д´)ノ");
        System.out.println("Bem-vindo, escolha uma das opções a seguir:");

        System.out.println("(☞ﾟヮﾟ)☞[1]\n" + pedra);

        System.out.println("(☞ﾟヮﾟ)☞[2]\n" + papel);

        System.out.println("(☞ﾟヮﾟ)☞[3]\n" + tesoura);

        byte entrada = teclado.nextByte();

        teclado.close();

        switch (entrada){
            case 1:
                System.out.println("    _______\n" +
                                   "---'   ____)\n" +
                                   "      (_____)\n" +
                                   "      (_____)\n" +
                                   "      (____)\n" +
                                   "---.__(___)"+"     Empate     ");
                break;

            case 2:
                System.out.println("    _______\n" +
                                   "---'   ____)\n" +
                                   "      (_____)\n" +
                                   "      (_____)\n" +
                                   "      (____)\n" +
                                   "---.__(___)"+"     Você venceu     ");
                break;

            case 3:
                System.out.println("    _______\n" +
                                   "---'   ____)\n" +
                                   "      (_____)\n" +
                                   "      (_____)\n" +
                                   "      (____)\n" +
                                   "---.__(___)"+"     Você perdeu     ");
                break;
        }
    }
}
