package Ativ;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
	        String comando = "Digite o tamanho dos vetores: ";
			Scanner scanner = new Scanner(System.in);
			System.out.print(comando);
	        int Num = scanner.nextInt();
	        double[] V1 = new double[Num];
	        double[] V2 = new double[Num];
	        double[] R = new double[Num];
	        String msg = String.format("Digite os elementos do primeiro vetor:");
			System.out.println(msg);
	        for(int i=0;i<Num;i++) {
	            double Number = scanner.nextDouble();
	    		V1[i]=Number;	
	    	}
	        msg = String.format("Digite os elementos do segundo vetor:");
			System.out.println(msg);
	    	for(int j=0;j<Num;j++) {
	            double Number = scanner.nextDouble();
	    		V2[j]=Number;	
	    	}
	    	for(int i=0;i<Num;i++) {
	    		R[i]= V1[i] * V2[i];
	    	}
			double Resultado= R[0];
	        for (int i=1; i<R.length;i++) {
	    		Resultado = Resultado + R[i];
	        }
			msg = String.format("O produto escalar dos vetores é: %.2f", Resultado);
			System.out.println(msg);
		scanner.close();
	}}