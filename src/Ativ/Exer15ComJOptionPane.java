package Ativ;

import javax.swing.JOptionPane;

public class Exer15ComJOptionPane {

    public static void main(String[] args) {

        // NUMERO DE LINHAS
        String comando = "Digite o numero de linhas: ";
        String strlin = JOptionPane.showInputDialog(comando);
        int lin = Integer.parseInt(strlin);

        // NUMERO DE COLUNAS
        comando = "Digite o numero de colunas: ";
        String strcol = JOptionPane.showInputDialog(comando);
        int col = Integer.parseInt(strcol);

        // MATRIZES
        int[][] M1 = new int[lin][col];
        int[][] M2 = new int[lin][col];
        int[][] R = new int[lin][col];

        String msg = String.format("Digite os elementos da primeira matriz:");
        JOptionPane.showMessageDialog(null, msg);
        for (int i = 0; i < lin; i++) {
            for (int j = 0; j < col; j++) {
                String numero = JOptionPane.showInputDialog("Elemento na posição [" + i + "][" + j + "]:");
                M1[i][j] = Integer.parseInt(numero);
            }
        }

        msg = String.format("Digite os elementos da segunda matriz:");
        JOptionPane.showMessageDialog(null, msg);
        for (int i = 0; i < lin; i++) {
            for (int j = 0; j < col; j++) {
                String numero = JOptionPane.showInputDialog("Elemento na posição [" + i + "][" + j + "]:");
                M2[i][j] = Integer.parseInt(numero);
            }
        }

        for (int i = 0; i < lin; i++) {
            for (int j = 0; j < col; j++) {
                R[i][j] = M1[i][j] + M2[i][j];
            }
        }

        String resultado = "A soma das matrizes é:\n";
        for (int i = 0; i < lin; i++) {
            for (int j = 0; j < col; j++) {
                resultado += R[i][j] + " ";
            }
            resultado += "\n";
        }
        JOptionPane.showMessageDialog(null, resultado);
    }
}