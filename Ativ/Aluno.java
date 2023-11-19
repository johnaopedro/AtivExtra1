package Ativ;

public class Aluno {
	String nome;
	double nota;
	
	Aluno(String nome, double nota){
		this.nome = nome;
		this.nota = nota;
	}
    public String normalNome() {
        return nome;
    }
    public void novoNome(String nome) {
        this.nome = nome;
    }
    public double normalNota() {
        return nota;
    }
    public void novoNota(double nota) {
        this.nota = nota;
    }
}
