package Ativ;

import javax.swing.JOptionPane;

public class Exer13 {

	public static void main(String[] args) {
        String strNum = JOptionPane.showInputDialog("Digite o tamanho dos vetores: ");
        int Num = Integer.parseInt(strNum);
        double Number;
        double[] V1 = new double[Num];
        double[] V2 = new double[Num];
        double[] R = new double[Num];
        String msg = String.format("Digite os elementos do primeiro vetor:");
    	JOptionPane.showMessageDialog(null, msg);
        for(int i=0;i<Num;i++) {
            String input = JOptionPane.showInputDialog(null,"");
            Number = Double.parseDouble(input);
    		V1[i]=Number;	
    	}
		msg = String.format("Digite os elementos do segundo vetor:");
    	JOptionPane.showMessageDialog(null, msg);
		for(int j=0;j<Num;j++) {
            String input = JOptionPane.showInputDialog(null,"");
            Number = Double.parseDouble(input);
    		V2[j]=Number;	
    	}
    	for(int i=0;i<Num;i++) {
    		R[i]= V1[i] * V2[i];
    	}
		double Resultado= R[0];
        for (int i=1; i<R.length;i++) {
    		Resultado = Resultado + R[i];
        }
        JOptionPane.showMessageDialog(null, "O produto escalar dos vetores é:"+Resultado);
	}

}