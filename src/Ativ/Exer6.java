package Ativ;

import javax.swing.JOptionPane;

public class Exer6 {

	public static void main(String[] args) {
		double IMC;
		String strPeso = JOptionPane.showInputDialog("Digite o seu peso em quilogramas: ");
		double Peso = Double.parseDouble(strPeso);
		String strAltura = JOptionPane.showInputDialog("Digite a sua altura: ");
		double Altura = Double.parseDouble(strAltura);
		IMC = Peso/(Altura*Altura);
		
		if(IMC<18.5){
			String msg = String.format("Media Ponderada: %.2f\n"
					+ "Classificação de IMC: Baixo peso", IMC);
			JOptionPane.showMessageDialog(null, msg);
		}
		else if(IMC>=18.5 && IMC<=24.9){
			String msg = String.format("Media Ponderada: %.2f\n"
					+ "Classificação de IMC: Normal", IMC);
			JOptionPane.showMessageDialog(null, msg);
		}
		else if(IMC>=25 && IMC<=29.9){
			String msg = String.format("Media Ponderada: %.2f\n"
					+ "Classificação de IMC: Sobrepeso", IMC);
			JOptionPane.showMessageDialog(null, msg);
		}
		else if(IMC>=30 && IMC<=34.9){
			String msg = String.format("Media Ponderada: %.2f\n"
					+ "Classificação de IMC: Obesidade grau I", IMC);
			JOptionPane.showMessageDialog(null, msg);
		}
		else if(IMC>=35 && IMC<=39.9){
			String msg = String.format("Media Ponderada: %.2f\n"
					+ "Classificação de IMC: Obesidade grau II", IMC);
			JOptionPane.showMessageDialog(null, msg);
		}
		else if(IMC>=40){
			String msg = String.format("Media Ponderada: %.2f\n"
					+ "Classificação de IMC: Obesidade grau III", IMC);
			JOptionPane.showMessageDialog(null, msg);
		}
	}

}
