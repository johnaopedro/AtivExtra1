package Ativ;

import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {
		String comando = "Digite um número para a tabela de multiplicação: ";
		Scanner scanner = new Scanner(System.in);
		System.out.print(comando);
        int Num = scanner.nextInt();
    	int[] Number = new int[10];
        for(int i=0;i<10;i++) {       	
        	Number[i]= (i+1)*Num;
            String finale = String.format("%d x %d = %d", i+1, Num, Number[i]);
            System.out.println(finale);
        }
scanner.close();}
}
