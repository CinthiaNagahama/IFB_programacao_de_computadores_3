package questao02;

import java.util.ArrayList;
import java.util.List;

public class Questao02 {
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
		
		// a) adicione um elemento na primeira posição da lista;
		
		cores.add(0, "Marrom");
		
		System.out.println("\nLetra (a): Inserindo \"Marrom\" na primeira posição");
		cores.forEach((cor)->System.out.println("\t" + cor));
		
		// b) remova o terceiro elemento da lista;
		
		cores.remove(2);
		
		System.out.println("\nLetra (b): Removendo \"Azul\"");
		cores.forEach((cor)->System.out.println("\t" + cor));
		
		// c) copie o ArrayList para outro;
		
		List<String> cores2 = new ArrayList<String>();
		cores.forEach((cor)->cores2.add(cor));
		
		System.out.println("\nLetra (c): Copiando o ArrayList cores no ArrayList cores2");
		cores2.forEach((cor)->System.out.println("\t" + cor));
		
		// d) ordene o ArrayList de cores pelo nome
		cores.sort(null);
		
		System.out.println("\nLetra (d): Ordenando o ArrayList de cores");
		cores.forEach((cor)->System.out.println("\t" + cor));
	}
}
