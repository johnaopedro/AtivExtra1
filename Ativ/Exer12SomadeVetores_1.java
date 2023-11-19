package Ativ;

import javax.swing.JOptionPane;

public class Exer12SomadeVetores_1 {

	public static void main(String[] args) {
        String strNum = JOptionPane.showInputDialog("Digite o tamanho dos vetores: ");
        int Num = Integer.parseInt(strNum);
        int Number;
    	int[] V1 = new int[Num];
    	int[] V2 = new int[Num];
    	int[] R = new int[Num];
        String msg = String.format("Digite os elementos do primeiro vetor:");
    	JOptionPane.showMessageDialog(null, msg);
        for(int i=0;i<Num;i++) {

            String input = JOptionPane.showInputDialog(null,"");
            Number = Integer.parseInt(input);
    		V1[i]=Number;	
    	}
		msg = String.format("Digite os elementos do segundo vetor:");
    	JOptionPane.showMessageDialog(null, msg);
		for(int j=0;j<Num;j++) {
            String input = JOptionPane.showInputDialog(null,"");
            Number = Integer.parseInt(input);
    		V2[j]=Number;	
    	}
    	for(int i=0;i<Num;i++) {
    		R[i]= V1[i]+ V2[i];
    	}
    	String mensagem = "A soma dos vetores e: [";
        for (int i=0; i<R.length;i++) {
        	if(i<Num-1){
            mensagem += R[i] + ", ";
        	}
        	else{
        		mensagem += R[i] + "]";
        	}}
        JOptionPane.showMessageDialog(null, mensagem);
	}

}