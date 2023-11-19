package Ativ;

import java.util.Random;
import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
		Random random = new Random();
		int i=1;
		String msg;
		String comando = "Adivinhe o número entre 1 e 10: ";
		Scanner scanner = new Scanner(System.in);
		System.out.println(comando);
		int Num=0;
        int numeroAleatorio = random.nextInt(10) + 1;
        do {
        	if(i>=2 && Num<numeroAleatorio){
        		System.out.println("Tente novamente. O número é maior.");
        	}
        	else if(i>=2 && Num>numeroAleatorio){
        		System.out.println("Tente novamente. O número é menor.");
        	}
			msg = String.format("Tentativa %d: ", i);
			System.out.print(msg);
	        Num= scanner.nextInt();
        	i++;
        }while(Num!=numeroAleatorio);
        String finale = String.format("Parabéns! Você acertou o número %d em %d tentativas.", numeroAleatorio, i-1);
        System.out.println(finale);
        scanner.close();
	}
}
