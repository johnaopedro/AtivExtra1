package Ativ;

import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {
		
		//NUMERO DE LINHAS
        String comando = "Digite o numero de linhas: ";
		Scanner scanner = new Scanner(System.in);
		System.out.print(comando);
        int lin = scanner.nextInt();
        
        //NUMERO DE COLUNAS
        comando = "Digite o numero de colunas: ";
		System.out.print(comando);
        int col = scanner.nextInt();
        
        //MATRIZES
        int[][] M1 = new int[lin][col];
        int[][] M2 = new int[lin][col];
        int[][] R = new int[lin][col];
        
        
        
        System.out.println("Digite os elementos da primeira matriz: ");
        for (int i = 0; i < lin; i++) {
            for (int j = 0; j < col; j++) {
            	
                String numero = scanner.next();
                M1[i][j] = Integer.parseInt(numero);
            }
        }
        
        System.out.println("Digite os elementos da segunda matriz: ");
        for (int i = 0; i < lin; i++) {
            for (int j = 0; j < col; j++) {
            	
                String numero = scanner.next();
                M2[i][j] = Integer.parseInt(numero);
            }
        }

        for (int i = 0; i < lin; i++) {
            for (int j = 0; j < col; j++) {
            	
            	R[i][j]= M1[i][j]+M2[i][j];
            }
        }
        
        System.out.println("A soma das matrizes é: ");
        for (int i = 0; i < lin; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(R[i][j] + " ");
            }
            System.out.println();
        }
        
scanner.close();
}}