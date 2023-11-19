package Ativ;

import javax.swing.JOptionPane;

public class Exer1 {

	public static void main(String[] args) {
		double gorgeta;
		double total;
		
		String strConta = JOptionPane.showInputDialog("Digite o valor da conta:");
		double c = Double.parseDouble(strConta);
		String strPorc = JOptionPane.showInputDialog("Digite a porcentagem de gorgeta que deseja deixar:");
		double p = Double.parseDouble(strPorc);
		
		gorgeta = (c*p)/100;
		total = c+gorgeta;
		String msg1 = String.format("Valor da gorgeta: $ %.2f", gorgeta);
		String msg2 = String.format("Total a ser pago: $ %.2f", total);
		JOptionPane.showMessageDialog(null, msg1);
		JOptionPane.showMessageDialog(null, msg2);
	}

}
