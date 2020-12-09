package questao01;

import java.util.ArrayList;
import java.util.List;

public class Questao01 {
	public static void main(String[] args) {
		List<String> cores = new ArrayList<String>();
		
		cores.add("Amarelo");
		cores.add("Azul");
		cores.add("Branco");
		cores.add("Vermelho");
		cores.add("Verde");
		cores.add("Laranja");
		cores.add("Preto");
		cores.add("Cinza");
		
		cores.forEach((cor)->System.out.println(cor));
	}
}
