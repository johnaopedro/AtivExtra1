package Exer19;

import javax.swing.JOptionPane;

public class Exer19 {
	private static Aluno CopiaAluno(Aluno a1) {
		Aluno copia = new Aluno(null, 0);
		copia.normalNome();
		copia.normalNota();
		return copia;
}
	public static void main(String[] args) {
		String Nome = JOptionPane.showInputDialog("Nome do aluno: ");
		String strNota = JOptionPane.showInputDialog("Nota do aluno: ");
		double Nota = Double.parseDouble(strNota);
		Aluno a1;
		a1 = new Aluno(Nome,Nota);
		Aluno copia = CopiaAluno(a1);
		
		//É Possivel fazer alterações na copia:
		String Nome1 = JOptionPane.showInputDialog("Nome do aluno: ");
		String strNota1 = JOptionPane.showInputDialog("Nota do aluno: ");
		double Nota1 = Double.parseDouble(strNota1);
		copia.novoNome(Nome1);
		copia.novoNota(Nota1);
		//Mantem o original
		String msg = String.format("Nome do Aluno original: %s\n"
				+ "Nota do Aluno original: %.2f", a1.nome, a1.nota);
		JOptionPane.showMessageDialog(null, msg);

		String msg1 = String.format("Copia alterada do nome: %s\n"
				+ "Copia alterada da nota: %.2f", copia.nome, copia.nota);
		JOptionPane.showMessageDialog(null, msg1);
	}
}