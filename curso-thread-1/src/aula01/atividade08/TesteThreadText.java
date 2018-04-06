package aula01.atividade08;

public class TesteThreadText {
	public static void main(String[] args) {
		//ImprimeString teste = new ImprimeString("imprimindo uma string com uma thread");
		//Thread threadString = new Thread(teste, "Thread Imprime String");
		
		//threadString.start();
		
		/*
		 * outra forma enxuta de executar tarefas pequenas
		 * instanciando a tarefa já pela interface
		 * dessa forma, o compilador gera uma classe anônima que implementa a interface
		 * ->>
		 */
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("resposta");
			}
		}).start();
	}
}
