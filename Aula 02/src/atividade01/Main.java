package atividade01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
	public static void questao5(Set<Integer> hashSet, Set<Integer> linkedHashSet) {
		for (int i = 0; i < 20; i++) {
			hashSet.add(i);
			linkedHashSet.add(i);
		}

		System.out.println("\n------------------------ Hash Set ----------------------------\n");
		for (Integer num : hashSet) {
			System.out.println(num);
		}

		System.out.println("\n------------------------- Linked Hash Set ---------------------------\n");
		for (Integer num : linkedHashSet) {
			System.out.println(num);
		}
	}	
	public static void main(String[] args) {
		// Questão 01 - Crie uma classe com os atributos codigo e descricao, crie os métodos get/set
		// Okay, feito
		
		// Questão 02 - Crie uma classe executável com um HashSet da classe do exercício 1
		Set <Objeto> objetos = new HashSet<Objeto>();
		
		// Questão 03 - Crie alguns objetos e adicione-os ao HashSet
		Objeto a = new Objeto(), b = new Objeto(), c = new Objeto();
		
		a.setCodigo(1);
		a.setDescricao("Objeto Objeto de código 1");
		
		b.setCodigo(2);
		b.setDescricao("Objeto Objeto de código 2");
		
		c.setCodigo(3);
		c.setDescricao("Objeto Objeto de código 3");
		
		objetos.add(a);
		objetos.add(b);
		objetos.add(c);
		
		// Questão 04 - Percorra o HashSet utilizando for-each e Iterator
		System.out.println("Iterator");
		Iterator<Objeto> it = objetos.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().getDescricao());
		}
		
		System.out.println("For-Each");
		for(Objeto o : objetos) {
			System.out.println(o.getDescricao());
		}
		
		// Questão 05 - Implemente um método na classe do exercício 2 que manipule uma coleção HashSet e outra coleção LinkedHashSet,
		// 				adicione a elas 20 números inteiros (Integer), em ordem crescente, e percorra todos os elementos, observe se 
		//				a ordem de iteração é a mesma.
		Set<Integer> hashSet = new HashSet<Integer>();
		Set<Integer> linkedHashSet = new LinkedHashSet<Integer>();
		questao5(hashSet, linkedHashSet);
	}
}
