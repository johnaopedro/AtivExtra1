package Exer18;

import javax.swing.JOptionPane;

//metodo
public class Exer18 {
		private static void Trocavalor(Ponto a1, Ponto a2) {
			int ax = a1.x;
			int ay = a1.y;
			a1.x= a2.x;
			a1.y= a2.y;
			a2.x=ax;
			a2.y=ay;
			
		}
	public static void main(String[] args) {
		Ponto a1, a2;
		String strPon1= JOptionPane.showInputDialog("Digite o valor de Ponto 1(1): ");
		int Pon1 = Integer.parseInt(strPon1);
		String strPon2= JOptionPane.showInputDialog("Digite o valor de Ponto 1(2): ");
		int Pon2 = Integer.parseInt(strPon2);
		a1 = new Ponto(Pon1,Pon2);
		String strPont1= JOptionPane.showInputDialog("Digite o valor de Ponto 2(1): ");
		int Pont1 = Integer.parseInt(strPont1);
		String strPont2= JOptionPane.showInputDialog("Digite o valor de Ponto 2(2): ");
		int Pont2 = Integer.parseInt(strPont2);
		a2 = new Ponto(Pont1,Pont2);

		String msg = String.format("Valores de a1: %d %d\n"
				+"Valores de a2: %d %d", a1.x, a1.y, a2.x, a2.y);
		JOptionPane.showMessageDialog(null, msg);
		Trocavalor(a1, a2);
		String msg1 = String.format("Valores de a1 apos troca: %d %d\n"
				+"Valores de a2 apos troca: %d %d", a1.x, a1.y, a2.x, a2.y);
		JOptionPane.showMessageDialog(null, msg1);
	}
}