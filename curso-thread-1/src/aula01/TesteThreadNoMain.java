package aula01;

public class TesteThreadNoMain {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Thread main");
		
		//manda a thread dormir
		//30 segundos
		Thread.sleep(30000);
		
		//esse m�todo precisa de exce��o
		/*
		 * try {
        Thread.sleep(5000);    
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
		 */
	}
}
