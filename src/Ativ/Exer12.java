package Ativ;

import javax.swing.JOptionPane;

public class Exer12 {

	public static void main(String[] args) {
        String strNum = JOptionPane.showInputDialog("Digite um número para a tabela de multiplicação: ");
        int Num = Integer.parseInt(strNum);
    	int[] Number = new int[10];
        for(int i=0;i<10;i++) {       	
        	Number[i]= (i+1)*Num;
            String finale = String.format("%d x %d = %d", i+1, Num, Number[i]);
            JOptionPane.showMessageDialog(null, finale);
        }
	}
}

