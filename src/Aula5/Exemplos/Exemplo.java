package Aula5.Exemplos;

import javax.swing.*;

public class Exemplo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("meu titulo");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        frame.setVisible(true);

        JLabel painel = new JLabel();
        painel.setText("Olá Mundo");

        frame.add(painel);

    }


}
