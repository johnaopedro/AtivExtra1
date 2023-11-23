package Ativ;

import javax.swing.JOptionPane;

public class Exer17ComJOptionPane {

public static void main(String[] args) {
        String comando = "Digite o numero de linhas da matriz: ";
        int lin = Integer.parseInt(JOptionPane.showInputDialog(comando));

        comando = "Digite o numero de colunas da matriz: ";
        int col = Integer.parseInt(JOptionPane.showInputDialog(comando));
        //MATRIZES
        int[][] M1 = new int[lin][col];
        int[][] R = new int[col][lin];

        String msg = String.format("Digite os elementos da matriz:");
        JOptionPane.showMessageDialog(null, msg);
        for (int i = 0; i < lin; i++) {
            for (int j = 0; j < col; j++) {
                String numero = JOptionPane.showInputDialog("Elemento na posição ["+(i+1)+"]["+(1+j)+"]:");
                M1[i][j] = Integer.parseInt(numero);
            }
        }
        for (int i = 0; i < lin; i++) {
            for (int j = 0; j < col; j++) {
                R[j][i] = M1[i][j];
            }
        }

        String resultado = "A matriz transposta é:\n";
        JOptionPane.showMessageDialog(null, resultado);
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < lin; j++) {
                resultado += R[i][j] + " ";
            }
            resultado += "\n";
        }
        JOptionPane.showMessageDialog(null, resultado);
    }
}