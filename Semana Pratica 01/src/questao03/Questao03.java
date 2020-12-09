package questao03;

import java.util.HashMap;

public class Questao03 {
	public static void main(String[] args) {
		HashMap<Integer, String> aleatorio = new HashMap<Integer, String>();
		
		for(int i = 0; i < 20; i++) {
			double rand = Math.floor(Math.random() * 1000);
			
			aleatorio.put(i, "Número aleatório entre 0 e 1000: " + rand);
		}
		
		aleatorio.forEach((k, v) -> System.out.println(k + " | " + v));
	}
}
