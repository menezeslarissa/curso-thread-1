package aula01.atividade08;

public class ImprimeString implements Runnable{

	private String text;
	
	public ImprimeString(String text) {
		this.text = text;
	}
	
	public String getText() {
		return text;
	}
	@Override
	public void run() {
		System.out.println(this.text);
		
	}

}
