package Ativ;

import javax.swing.JOptionPane;

public class Exer16ComJOptionPane {
		public static void main(String[] args) {

	        // NUMERO DE LINHAS E COLUNAS DA PRIMEIRA MATRIZ
	        String comando = "Digite o numero de linhas da primeira matriz: ";
	        int lin = Integer.parseInt(JOptionPane.showInputDialog(comando));

	        comando = "Digite o numero de colunas da primeira matriz: ";
	        int col = Integer.parseInt(JOptionPane.showInputDialog(comando));

	        int[][] M1 = new int[lin][col];

	        JOptionPane.showMessageDialog(null, "Digite os elementos da primeira matriz:");
	        for (int i = 0; i < lin; i++) {
	            for (int j = 0; j < col; j++) {
	                String numero = JOptionPane.showInputDialog("Elemento na posição ["+(i+1)+"]["+(j+1)+"]:");
	                M1[i][j] = Integer.parseInt(numero);
	            }
	        }

	        // NUMERO DE LINHAS E COLUNAS DA SEGUNDA MATRIZ
	        comando = "Digite o numero de linhas da segunda matriz: ";
	        int lin2 = Integer.parseInt(JOptionPane.showInputDialog(comando));

	        comando = "Digite o numero de colunas da segunda matriz: ";
	        int col2 = Integer.parseInt(JOptionPane.showInputDialog(comando));

	        int[][] M2 = new int[lin2][col2];

	        JOptionPane.showMessageDialog(null, "Digite os elementos da segunda matriz:");
	        for (int i = 0; i < lin2; i++) {
	            for (int j = 0; j < col2; j++) {
	                String numero = JOptionPane.showInputDialog("Elemento na posição ["+(i+1)+"]["+(j+1)+"]:");
	                M2[i][j] = Integer.parseInt(numero);
	            }
	        }

	        // Multiplicação das matrizes
	        int[][] R = new int[lin][col2];
	        for (int i = 0; i < lin; i++) {
	            for (int j = 0; j < col2; j++) {
	                for (int k = 0; k < col; k++) {
	                    R[i][j] += M1[i][k] * M2[k][j];
	                }
	            }
	        }

	        String resultado = "O resultado da multiplicação das matrizes é:\n";
	        for (int i = 0; i < lin; i++) {
	            for (int j = 0; j < col2; j++) {
	                resultado += R[i][j] + " ";
	            }
	            resultado += "\n";
	        }
	        JOptionPane.showMessageDialog(null, resultado);
	    }
	}

