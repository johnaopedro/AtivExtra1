package Ativ;

import java.util.Random;

import javax.swing.JOptionPane;

public class Exer11 {

    public static void main(String[] args) {
        Random random = new Random();
        int i = 1;
        String msg;
        String comando = "Adivinhe o número entre 1 e 10: ";
        int Num = 0;

        JOptionPane.showMessageDialog(null, comando);
        int numeroAleatorio = random.nextInt(10) + 1;

        do {
            if (i >= 2 && Num < numeroAleatorio) {
                JOptionPane.showMessageDialog(null, "Tente novamente. O número é maior.");
            } else if (i >= 2 && Num > numeroAleatorio) {
                JOptionPane.showMessageDialog(null, "Tente novamente. O número é menor.");
            }

            msg = String.format("Tentativa %d: ", i);
            String input = JOptionPane.showInputDialog(null, msg);
            Num = Integer.parseInt(input);

            i++;
        } while (Num != numeroAleatorio);

        String finale = String.format("Parabéns! Você acertou o número %d em %d tentativas.", numeroAleatorio, i - 1);
        JOptionPane.showMessageDialog(null, finale);
    }
}
