package atividade02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		// Questão 01 - Crie uma classe, com o método main, e crie um HashSet para armazenar uma lista de cursos, da seguinte forma:
		Set<String> listaCursos = new HashSet<String>();
		
		// Questão 02 - Insira, usando o método add, os seguintes cursos: Ciência da Computação, Licenciatura em Física, 
		//				Licenciatura em Química, Eletromecânica e Ciência da Computação.
		listaCursos.add("Ciência da Computação");
		listaCursos.add("Licenciatura em Física");
		listaCursos.add("Licenciatura em Química");
		listaCursos.add("Eletromecânica");
		listaCursos.add("Licenciatura em Computação");
		
		// Questão 03 - Mostre a quantidade de elementos da lista de cursos e veja qual o valor impresso.
		System.out.println(listaCursos.size() + "\n");
		
		// Questão 04 - Imprima os valores contidos na lista
		// Imprimindo lista com Iterator
		Iterator<String> it = listaCursos.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("\n");
		
		// Imprimindo lista com Enhanced For
		for (String s : listaCursos) {
			System.out.println(s);
		}
		
		System.out.println("\n");
		
		// Questão 05 - Remova o curso Eletromecânica da lista e imprima a lista novamente.
		listaCursos.remove("Eletromecânica");
		for (String s : listaCursos) {
			System.out.println(s);
		}
		
		// Questão 06 - Verifique se a lista contém o curso Licenciatura em Física e Eletromecânica, imprima o resultado.
		System.out.println("\nLicenciatura em Física " + (listaCursos.contains("Licenciatura em Física") ? "está na lista" : "não está na lista"));
		System.out.println("\nEletromecânica " + (listaCursos.contains("Eletromecânica") ? "está na lista" : "não está na lista"));
		
		// Questão 07 - Limpe a lista toda e imprima o tamanho dela.
		listaCursos.clear();
		System.out.println("\n" + listaCursos.size());
		
		// Questão 08 - Repita os exercícios de 1 a 7 usando LinkedHashSet em vez de HashSet.
		System.out.println("\n\n --------- LinkedHashSet --------- \n\n");
		Set <String> listaCursosH = new LinkedHashSet<String>();
		
		listaCursosH.add("Ciência da Computação");
		listaCursosH.add("Licenciatura em Física");
		listaCursosH.add("Licenciatura em Química");
		listaCursosH.add("Eletromecânica");
		listaCursosH.add("Licenciatura em Computação");
		
		System.out.println(listaCursosH.size() + "\n");
		
		Iterator<String> itH = listaCursosH.iterator();
		while(itH.hasNext()) {
			System.out.println(itH.next());
		}
		
		System.out.println("\n");
		
		for (String s : listaCursosH) {
			System.out.println(s);
		}
		
		System.out.println("\n");
		
		listaCursosH.remove("Eletromecânica");
		for (String s : listaCursosH) {
			System.out.println(s);
		}
		
		System.out.println("\nLicenciatura em Física " + (listaCursosH.contains("Licenciatura em Física") ? "está na lista" : "não está na lista"));
		System.out.println("\nEletromecânica " + (listaCursosH.contains("Eletromecânica") ? "está na lista" : "não está na lista"));
		
		listaCursosH.clear();
		System.out.println("\n" + listaCursosH.size());
	}
}
