package Ativ;

import javax.swing.JOptionPane;

public class Exer10_1 {

public static void main(String[] args) {
	String msg;
	String strNum1 = JOptionPane.showInputDialog("Digite um numero inicial: ");
	int Num1 = Integer.parseInt(strNum1);
	while(Num1!=0) {
		msg = String.format("%d", Num1);
		JOptionPane.showMessageDialog(null, msg);
		Num1--;
	}
}

}
