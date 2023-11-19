package Ativ;

import javax.swing.JOptionPane;

public class Exer4 {

	public static void main(String[] args) {
		String comando = "Insira o valor das notas e pesos a seguir.";
		JOptionPane.showMessageDialog(null, comando);
		String strNum1 = JOptionPane.showInputDialog("Nota 1:");
		double Num1 = Double.parseDouble(strNum1);
		String strPeso1 = JOptionPane.showInputDialog("Peso da Nota 1:");
		double Peso1 = Double.parseDouble(strPeso1);
		String strNum2 = JOptionPane.showInputDialog("Nota 2:");
		double Num2 = Double.parseDouble(strNum2);
		String strPeso2 = JOptionPane.showInputDialog("Peso da Nota 2:");
		double Peso2 = Double.parseDouble(strPeso2);
		String strNum3 = JOptionPane.showInputDialog("Nota 3:");
		double Num3 = Double.parseDouble(strNum3);
		String strPeso3 = JOptionPane.showInputDialog("Peso da Nota 3:");
		double Peso3 = Double.parseDouble(strPeso3);
		double total = ((Num1*Peso1)+(Peso2*Num2)+(Peso3*Num3))/(Peso1+Peso2+Peso3);
		
		String msg = String.format("Media Ponderada: %.2f", total);
		JOptionPane.showMessageDialog(null, msg);
	}
}
