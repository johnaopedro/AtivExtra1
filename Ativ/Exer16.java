package Ativ;

import java.util.Scanner;

public class Exer16 {

	public static void main(String[] args) {
		
		//NUMERO DE LINHAS
        String comando = "Digite o numero de linhas da primeira matriz: ";
		Scanner scanner = new Scanner(System.in);
		System.out.print(comando);
        int lin = scanner.nextInt();
        
        //NUMERO DE COLUNAS
        comando = "Digite o numero de colunas da primeira matriz: ";
		System.out.print(comando);
        int col = scanner.nextInt();
        int[][] M1 = new int[lin][col];
               
        
        System.out.println("Digite os elementos da primeira matriz: ");
        for (int i = 0; i < lin; i++) {
            for (int j = 0; j < col; j++) {
            	
                String numero = scanner.next();
                M1[i][j] = Integer.parseInt(numero);
            }
        }
        
		//NUMERO DE LINHAS
        comando = "Digite o numero de linhas da segunda matriz: ";
		System.out.print(comando);
		int lin1 = scanner.nextInt();
        
        //NUMERO DE COLUNAS
        comando = "Digite o numero de colunas da segunda matriz: ";
		System.out.print(comando);
		int col1 = scanner.nextInt();
        
        int[][] M2 = new int[lin1][col1];

        System.out.println("Digite os elementos da segunda matriz: ");
        for (int i = 0; i < lin1; i++) {
            for (int j = 0; j < col1; j++) {
            	
                String numero = scanner.next();
                M2[i][j] = Integer.parseInt(numero);
            }
        }
        int[][] R = new int[lin][col1];
        for (int i = 0; i < lin; i++) {
            for (int j = 0; j < col1; j++) {
            	for (int k = 0; k < col; k++) {
            	R[i][j]= R[i][j] + M1[i][k]*M2[k][j];
            	}
            }
        }
        
        System.out.println("A soma das matrizes é: ");
        for (int i = 0; i < lin; i++) {
            for (int j = 0; j < col1; j++) {
                System.out.print(R[i][j] + " ");
            }
            System.out.println();
        }
        
scanner.close();
}}
