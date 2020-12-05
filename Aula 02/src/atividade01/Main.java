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
		// Quest�o 01 - Crie uma classe com os atributos codigo e descricao, crie os m�todos get/set
		// Okay, feito
		
		// Quest�o 02 - Crie uma classe execut�vel com um HashSet da classe do exerc�cio 1
		Set <Objeto> objetos = new HashSet<Objeto>();
		
		// Quest�o 03 - Crie alguns objetos e adicione-os ao HashSet
		Objeto a = new Objeto(), b = new Objeto(), c = new Objeto();
		
		a.setCodigo(1);
		a.setDescricao("Objeto Objeto de c�digo 1");
		
		b.setCodigo(2);
		b.setDescricao("Objeto Objeto de c�digo 2");
		
		c.setCodigo(3);
		c.setDescricao("Objeto Objeto de c�digo 3");
		
		objetos.add(a);
		objetos.add(b);
		objetos.add(c);
		
		// Quest�o 04 - Percorra o HashSet utilizando for-each e Iterator
		System.out.println("Iterator");
		Iterator<Objeto> it = objetos.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().getDescricao());
		}
		
		System.out.println("For-Each");
		for(Objeto o : objetos) {
			System.out.println(o.getDescricao());
		}
		
		// Quest�o 05 - Implemente um m�todo na classe do exerc�cio 2 que manipule uma cole��o HashSet e outra cole��o LinkedHashSet,
		// 				adicione a elas 20 n�meros inteiros (Integer), em ordem crescente, e percorra todos os elementos, observe se 
		//				a ordem de itera��o � a mesma.
		Set<Integer> hashSet = new HashSet<Integer>();
		Set<Integer> linkedHashSet = new LinkedHashSet<Integer>();
		questao5(hashSet, linkedHashSet);
	}
}
