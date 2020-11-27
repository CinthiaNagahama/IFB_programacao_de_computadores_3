package atividade02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		// Quest�o 01 - Crie uma classe, com o m�todo main, e crie um HashSet para armazenar uma lista de cursos, da seguinte forma:
		Set<String> listaCursos = new HashSet<String>();
		
		// Quest�o 02 - Insira, usando o m�todo add, os seguintes cursos: Ci�ncia da Computa��o, Licenciatura em F�sica, 
		//				Licenciatura em Qu�mica, Eletromec�nica e Ci�ncia da Computa��o.
		listaCursos.add("Ci�ncia da Computa��o");
		listaCursos.add("Licenciatura em F�sica");
		listaCursos.add("Licenciatura em Qu�mica");
		listaCursos.add("Eletromec�nica");
		listaCursos.add("Licenciatura em Computa��o");
		
		// Quest�o 03 - Mostre a quantidade de elementos da lista de cursos e veja qual o valor impresso.
		System.out.println(listaCursos.size() + "\n");
		
		// Quest�o 04 - Imprima os valores contidos na lista
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
		
		// Quest�o 05 - Remova o curso Eletromec�nica da lista e imprima a lista novamente.
		listaCursos.remove("Eletromec�nica");
		for (String s : listaCursos) {
			System.out.println(s);
		}
		
		// Quest�o 06 - Verifique se a lista cont�m o curso Licenciatura em F�sica e Eletromec�nica, imprima o resultado.
		System.out.println("\nLicenciatura em F�sica " + (listaCursos.contains("Licenciatura em F�sica") ? "est� na lista" : "n�o est� na lista"));
		System.out.println("\nEletromec�nica " + (listaCursos.contains("Eletromec�nica") ? "est� na lista" : "n�o est� na lista"));
		
		// Quest�o 07 - Limpe a lista toda e imprima o tamanho dela.
		listaCursos.clear();
		System.out.println("\n" + listaCursos.size());
		
		// Quest�o 08 - Repita os exerc�cios de 1 a 7 usando LinkedHashSet em vez de HashSet.
		System.out.println("\n\n --------- LinkedHashSet --------- \n\n");
		Set <String> listaCursosH = new LinkedHashSet<String>();
		
		listaCursosH.add("Ci�ncia da Computa��o");
		listaCursosH.add("Licenciatura em F�sica");
		listaCursosH.add("Licenciatura em Qu�mica");
		listaCursosH.add("Eletromec�nica");
		listaCursosH.add("Licenciatura em Computa��o");
		
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
		
		listaCursosH.remove("Eletromec�nica");
		for (String s : listaCursosH) {
			System.out.println(s);
		}
		
		System.out.println("\nLicenciatura em F�sica " + (listaCursosH.contains("Licenciatura em F�sica") ? "est� na lista" : "n�o est� na lista"));
		System.out.println("\nEletromec�nica " + (listaCursosH.contains("Eletromec�nica") ? "est� na lista" : "n�o est� na lista"));
		
		listaCursosH.clear();
		System.out.println("\n" + listaCursosH.size());
	}
}
