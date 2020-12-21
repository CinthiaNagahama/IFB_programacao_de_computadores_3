package atividade01;

public class ConhecendoThread1 {
	public static void main(String args[]) {
		try {
			int tempo = 0;
			System.out.println("Tempo: " + tempo + "s");
			for(int i = 0; i < 10; i++) {
				Thread.sleep(1000);
				tempo += 1;
				System.out.println("Tempo: " + tempo + "s");
			}
		} catch (Exception e){
			System.out.println(e.getMessage());
		}
	}
}
