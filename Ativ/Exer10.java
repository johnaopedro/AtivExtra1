package Ativ;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {
		String msg;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite um numero inicial: ");
        int num= scanner.nextInt();
		while(num!=0) {
			msg = String.format("%d", num);
			System.out.println(msg);
			num--;
	}scanner.close();

	}
}
