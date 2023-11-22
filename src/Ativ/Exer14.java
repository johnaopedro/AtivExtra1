package Ativ;

import javax.swing.JOptionPane;

public class Exer14 {

	public static void main(String[] args) {
		boolean def=false;
		int i=0;
		String palavra = JOptionPane.showInputDialog("Digite uma palavra: ");
		char[] str = palavra.replaceAll("[^a-zA-Z]", "").toCharArray();
        int  j=str.length-1;
		while (i < j) {
            if (str[i] != str[j]) {
                def = false;
            }
            i++;
            j--;
            def = true;
        }
		if(def==true) {
			String msg = String.format("A palavra %s é um palíndromo.", palavra);
			JOptionPane.showMessageDialog(null, msg);
		}
		else {
			String msg = String.format("A palavra %s não é um palíndromo.", palavra);
			JOptionPane.showMessageDialog(null, msg);
		}
}}
