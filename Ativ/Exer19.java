package Ativ;

public class Exer19 {
	private static Aluno CopiaAluno(Aluno a1) {
		return new Aluno(a1.normalNome(), a1.normalNota());
}
	public static void main(String[] args) {
		Aluno a1;
		a1 = new Aluno("oi",7);
		Aluno copia = CopiaAluno(a1);
		
		//É Possivel fazer alterações na copia:
		copia.novoNome("jaca");
		copia.novoNota(5);
		
		System.out.println(a1.nome);
		System.out.println(a1.nota);
		
		System.out.println(copia.nome);
		System.out.println(copia.nota);
	}
}