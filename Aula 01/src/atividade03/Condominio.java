package atividade03;

import java.util.HashSet;
import java.util.Set;

import atividade01.Apartamento;

public class Condominio {
	// Questão 01 - Crie uma classe chamada Condominio, com o método main. 
	public static void main(String[] args) {
		// Questão 02 - Dentro do método main crie 3 objetos e atribua valores aos seus atributos, repetindo o código para dois deles, 
		//				da classe Apartamento. 
		Apartamento a = new Apartamento(), b = new Apartamento(), c = new Apartamento();
		
		a.setCodigo(1);
		a.setArea(100d);
		a.setNumeroComodo(5);
		
		b.setCodigo(2);
		b.setArea(100d);
		b.setNumeroComodo(5);
		
		c.setCodigo(3);
		c.setArea(60d);
		c.setNumeroComodo(3);
		
		// Questão 03 - Crie um Set e insira os objetos dentro dele. Imprima o tamanho do conjunto.
		Set<Apartamento> apes = new HashSet<Apartamento>();
		
		apes.add(a);
		apes.add(b);
		apes.add(c);
		
		System.out.println(apes.size());
		
		// Questão 04 - Verifique se os objetos são iguais, usando o método sobrescrito da classe Apartamento. Imprima o resultado da 
		//				comparação. Liste os apartamentos contidos na lista, usando iterator.
		
		
		// Questão 05 - Insira 10.000 apartamentos aleatórios no Set criado no exercício 3, verifique o tempo gasto (captura o tempo 
		//				atual em milissegundos: Calendar.getInstance().getTimeInMillis(); - retorna um long) para fazer as 	inserções e 
		//				imprima o resultado. 
		
		// Questão 06 - Remova da lista o apartamento de código igual a 5000, verifique o tempo gasto (captura o tempo atual em 
		// 				milissegundos: Calendar.getInstance().getTimeInMillis(); ) para fazer a remoção e imprima o resultado. 
		
		// Questão 07 - Altere o método hashCode() da classe Apartamento para ficar assim:
		/*
			public int hashCode(){
				return 0;
			}
		*/
		
		// Questão 08 - Repita os exercícios 5 e 6 e observe os resultados
	}
}
