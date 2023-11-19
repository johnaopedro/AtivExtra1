package Ativ;

import javax.swing.JOptionPane;

public class Exer2 {

	public static void main(String[] args) {
		double conversao;
		
		String strEscolha = JOptionPane.showInputDialog("Escolha o tipo de conversao:\n1.Celsius para Fahrenheit\n2.Fahrenheit para Celsius");
		int escolha = Integer.parseInt(strEscolha);
		if(escolha==1) {
			String strTemperatura = JOptionPane.showInputDialog("Digite a temperatura em graus Celsius:");
			int temperatura = Integer.parseInt(strTemperatura);
			conversao=(temperatura*9/5)+32;
			String msg = String.format("Opção: %d\nResultado em graus Fahrenheit: %.2f", escolha, conversao);
			JOptionPane.showMessageDialog(null, msg);
		}
		else if(escolha==2) {
			String strTemperatura = JOptionPane.showInputDialog("Digite a temperatura em graus Fahrenheit:");
			int temperatura = Integer.parseInt(strTemperatura);
			conversao=(temperatura-32)*5/9;
			String msg = String.format("Opção: %d\nResultado em graus Celsius: %.2f", escolha, conversao);
			JOptionPane.showMessageDialog(null, msg);
		}
	}
}
