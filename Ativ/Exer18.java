package Ativ;

//metodo
public class Exer18 {
		private static void Trocavalor(Ponto a1, Ponto a2) {
			int ax = a1.x;
			int ay = a1.y;
			a1.x= a2.x;
			a1.y= a2.y;
			a2.x=ax;
			a2.y=ay;
			
		}
	public static void main(String[] args) {
		Ponto a1, a2;
		a1 = new Ponto(1,5);
		a2 = new Ponto(5,6);

		System.out.println("Valores de a1: "+a1.x+" "+a1.y);
		System.out.println("Valores de a2: "+a2.x+" "+a2.y);
		Trocavalor(a1, a2);
		System.out.println("Valores de a1 após troca: "+a1.x+" "+a1.y);
		System.out.println("Valores de a2 após troca: "+a2.x+" "+a2.y);
	}
}