package Ativ;

import javax.swing.JOptionPane;

public class Exer8 {

	public static void main(String[] args) {
		double total;
		String msg;
		String strNum1 = JOptionPane.showInputDialog("Digite o primeiro numero: ");
		double Num1 = Double.parseDouble(strNum1);
		String strNum2 = JOptionPane.showInputDialog("Digite o segundo numero: ");
		double Num2 = Double.parseDouble(strNum2);
		String Escolhas = JOptionPane.showInputDialog("Escolha a operação:\n1. Adicao\n2. Subtracao\n3. Multiplicacao\n4. Divisao");
		int Escolha = Integer.parseInt(Escolhas);
		switch (Escolha){
	    case 1:
	    	total = Num1+Num2;
			msg = String.format("Opção %d\n Resultado: %.2f", Escolha, total);
			JOptionPane.showMessageDialog(null, msg);
	        break;
	    case 2:
	    	total = Num1-Num2;
			msg = String.format("Opção %d\n Resultado: %.2f", Escolha, total);
			JOptionPane.showMessageDialog(null, msg);
	        break;
	    case 3:
	    	total = Num1*Num2;
			msg = String.format("Opção %d\n Resultado: %.2f", Escolha, total);
			JOptionPane.showMessageDialog(null, msg);
	        break;
	    case 4:
	    	total = Num1/Num2;
			msg = String.format("Opção %d\n Resultado: %.2f", Escolha, total);
			JOptionPane.showMessageDialog(null, msg);
	        break;
	    default:
	        System.out.println("Opção inválida");
	        break;
	}
	}
}
