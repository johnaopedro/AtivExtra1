package Ativ;

import javax.swing.JOptionPane;

public class Exer3 {

	public static void main(String[] args) {
		int i=0;
		String tarefa[] = null;
		String adiciona;
		String Escolha;
		String comandos = "Comandos disponiveis:\n-\"adicionar\" para adicionar uma nova tarefa\n-\"listar\" para listar as tarefas\n-\"concluir\" para marcar uma tarefa como concluida\n-\"sair\" para sair do programa";
		JOptionPane.showMessageDialog(null, comandos);
		
		do {
			Escolha = JOptionPane.showInputDialog("Digite um comando:");
			if (Escolha.equals("adicionar")) {
			    adiciona = JOptionPane.showInputDialog("Digite a descrição da tarefa:");
			    if (tarefa == null) {
			        tarefa = new String[1];
			    } else {
			        String[] novoTarefa = new String[tarefa.length + 1];
			        for (int j = 0; j < tarefa.length; j++) {
			            novoTarefa[j] = tarefa[j];
			        }
			        tarefa = novoTarefa;
			    }
			    tarefa[i] = adiciona;
			    i++;
			    JOptionPane.showMessageDialog(null, "Tarefa adicionada com sucesso");
			}
			if (Escolha.equals("listar")) {
			    JOptionPane.showMessageDialog(null, "Tarefas pendentes:");
			    boolean temTarefasPendentes = false;
			    if (tarefa != null && i > 0) {
			        for (int j = 0; j < i; j++) {
			            if (tarefa[j] != null) {
			                JOptionPane.showMessageDialog(null, (j + 1) + ". " + tarefa[j]);
			                temTarefasPendentes = true;
			            }
			        }
			    }
			    if (temTarefasPendentes==false) {
			        JOptionPane.showMessageDialog(null, "(Nenhuma tarefa pendente)");
			    }
			}
			if (Escolha.equals("concluir")) {
			    String Numero = JOptionPane.showInputDialog("Digite o numero da tarefa a ser concluida:");
			    int n = Integer.parseInt(Numero);
			    if (n > 0 && n <= i) {
			        tarefa[n - 1] = null;
			        for (int j = n - 1; j < i - 1; j++) {
			            tarefa[j] = tarefa[j + 1];
			        }
			        i--;
			    } else {
			        JOptionPane.showMessageDialog(null, "ERRO: Numero de tarefa invalido");
			    }
			}
	
}while(!Escolha.equals("sair"));
	}
}
