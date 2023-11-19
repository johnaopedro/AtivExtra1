package Ativ;

import javax.swing.JOptionPane;

public class Exer9 {

	public static void main(String[] args) {
		String msg;
		String comando = "Média ponderada de 90 a 100: A\r\n"
				+ "Média ponderada de 80 a 89: B\r\n"
				+ "Média ponderada de 70 a 79: C\r\n"
				+ "Média ponderada de 60 a 69: D\r\n"
				+ "Média ponderada abaixo de 60: F";
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
		
		if(total>=90 && total<100) {
			msg = String.format("Media ponderada de %.2f que corresponde a classificacao A", total);
			JOptionPane.showMessageDialog(null, msg);
		}
		else if(total>=80 && total<89) {
			msg = String.format("Media ponderada de %.2f que corresponde a classificacao B", total);
			JOptionPane.showMessageDialog(null, msg);
		}
		else if(total>=70 && total<79) {
			msg = String.format("Media ponderada de %.2f que corresponde a classificacao C", total);
			JOptionPane.showMessageDialog(null, msg);
		}
		else if(total>=60 && total<69) {
			msg = String.format("Media ponderada de %.2f que corresponde a classificacao D", total);
			JOptionPane.showMessageDialog(null, msg);
		}
		else if(total<60) {
			msg = String.format("Media ponderada de %.2f que corresponde a classificacao F", total);
			JOptionPane.showMessageDialog(null, msg);
		}
	}
}
