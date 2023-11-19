package Ativ;

import javax.swing.JOptionPane;

public class Exer5 {

	public static void main(String[] args) {
		String strIdade = JOptionPane.showInputDialog("Qual a sua idade em anos: ");
		int Idade = Integer.parseInt(strIdade);
		int meses = Idade*12;
		int dias = Idade*365;
		int horas = dias*24;
		int minutos = horas*60;
		
		String msg = String.format("Meses de vida: %d", meses);
		JOptionPane.showMessageDialog(null, msg);
		String msg1 = String.format("Dias de vida: %d", dias);
		JOptionPane.showMessageDialog(null, msg1);
		String msg2 = String.format("Horas de vida: %d", horas);
		JOptionPane.showMessageDialog(null, msg2);
		String msg3 = String.format("Minutos de vida: %d", minutos);
		JOptionPane.showMessageDialog(null, msg3);

}}
