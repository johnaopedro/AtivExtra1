package Exer20;

import javax.swing.JOptionPane;
public class Exer20 {
	
	private static void ContaBancaria(double deposito, ContaBancaria c1){
	c1.saldo = (deposito+c1.saldo);
	}

	public static void main(String[] args) {
		ContaBancaria c1;
		String strsal = JOptionPane.showInputDialog("Digite o seu saldo: ");
		double sal = Double.parseDouble(strsal);
		c1 = new ContaBancaria(sal);
		String msg = String.format("O seu saldo atual na conta é: %.2f", c1.saldo);
		JOptionPane.showMessageDialog(null, msg);
		String strdep = JOptionPane.showInputDialog("Digite o valor a ser depositado: ");
		double deposito = Double.parseDouble(strdep);
        ContaBancaria(deposito,c1);
        
		String msg1 = String.format("Seu novo saldo na conta é: "+c1.saldo);
		JOptionPane.showMessageDialog(null, msg1);
}}
