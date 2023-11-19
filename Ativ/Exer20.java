package Ativ;
import java.util.Scanner;
public class Exer20 {
	
	private static void ContaBancaria(double deposito, ContaBancaria c1){
	c1.saldo = (deposito+c1.saldo);
	}

	public static void main(String[] args) {
		ContaBancaria c1;
		c1 = new ContaBancaria(7);
		String msg = String.format("O seu saldo atual na conta é: %.2f", c1.saldo);
		System.out.println(msg);
		System.out.print("Digite o valor a ser depositado na conta: ");
		Scanner sc = new Scanner(System.in);
        double deposito = sc.nextDouble();
        ContaBancaria(deposito,c1);
        
		System.out.println("Seu novo saldo na conta é: "+c1.saldo);
		
sc.close();	}

}
