package Ativ;

import java.util.Scanner;

public class Exer12SomadeVetores {

	public static void main(String[] args) {
        String comando = "Digite o tamanho dos vetores: ";
		Scanner scanner = new Scanner(System.in);
		System.out.print(comando);
        int Num = scanner.nextInt();
        int Number;
    	int[] V1 = new int[Num];
    	int[] V2 = new int[Num];
    	int[] R = new int[Num];
        String msg = String.format("Digite os elementos do primeiro vetor:");
		System.out.println(msg);
        for(int i=0;i<Num;i++) {
            Number = scanner.nextInt();
    		V1[i]=Number;	
    	}
        msg = String.format("Digite os elementos do segundo vetor:");
		System.out.println(msg);
    	for(int j=0;j<Num;j++) {
            Number = scanner.nextInt();
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
		System.out.println(mensagem);
	scanner.close();
}}
