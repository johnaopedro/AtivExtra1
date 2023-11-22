package Ativ;

import javax.swing.JOptionPane;

public class Exer7 {

	public static void main(String[] args) {
		String def = null;
		String strNum= JOptionPane.showInputDialog("Digite um numero inteiro: ");
		int Num = Integer.parseInt(strNum);
		if(Num%2==0) {
			def = "par";
		}
		else {
			def = "impar";
		}
		String msg = String.format("O numero %d é %s", Num, def);
		JOptionPane.showMessageDialog(null, msg);
	}

}
