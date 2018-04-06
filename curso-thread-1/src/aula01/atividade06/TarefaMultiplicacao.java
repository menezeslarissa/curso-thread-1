package aula01.atividade06;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class TarefaMultiplicacao implements Runnable {

	private JTextField primeiro;
	private JTextField segundo;
	private JLabel resultado;
	
	public TarefaMultiplicacao(JTextField primeiro, JTextField segundo, JLabel resultado) {
		this.primeiro = primeiro;
		this.segundo = segundo;
		this.resultado = resultado;
	}

	@Override
	public void run() {
		Integer valor1 = Integer.parseInt(primeiro.getText());
		Integer valor2 = Integer.parseInt(segundo.getText());
		Integer calculo;

		calculo = valor1 * valor2;
		/*for (int i = 0; i < valor1; i++) {
			for (int j = 0; j < valor2; j++) {
				calculo = calculo.add(new BigInteger("1"));
			}
		}*/
		
		resultado.setText(calculo.toString());
	}

}
