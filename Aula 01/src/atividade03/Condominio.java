package atividade03;

import java.util.HashSet;
import java.util.Set;

import atividade01.Apartamento;

public class Condominio {
	// Quest�o 01 - Crie uma classe chamada Condominio, com o m�todo main. 
	public static void main(String[] args) {
		// Quest�o 02 - Dentro do m�todo main crie 3 objetos e atribua valores aos seus atributos, repetindo o c�digo para dois deles, 
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
		
		// Quest�o 03 - Crie um Set e insira os objetos dentro dele. Imprima o tamanho do conjunto.
		Set<Apartamento> apes = new HashSet<Apartamento>();
		
		apes.add(a);
		apes.add(b);
		apes.add(c);
		
		System.out.println(apes.size());
		
		// Quest�o 04 - Verifique se os objetos s�o iguais, usando o m�todo sobrescrito da classe Apartamento. Imprima o resultado da 
		//				compara��o. Liste os apartamentos contidos na lista, usando iterator.
		
		
		// Quest�o 05 - Insira 10.000 apartamentos aleat�rios no Set criado no exerc�cio 3, verifique o tempo gasto (captura o tempo 
		//				atual em milissegundos: Calendar.getInstance().getTimeInMillis(); - retorna um long) para fazer as 	inser��es e 
		//				imprima o resultado. 
		
		// Quest�o 06 - Remova da lista o apartamento de c�digo igual a 5000, verifique o tempo gasto (captura o tempo atual em 
		// 				milissegundos: Calendar.getInstance().getTimeInMillis(); ) para fazer a remo��o e imprima o resultado. 
		
		// Quest�o 07 - Altere o m�todo hashCode() da classe Apartamento para ficar assim:
		/*
			public int hashCode(){
				return 0;
			}
		*/
		
		// Quest�o 08 - Repita os exerc�cios 5 e 6 e observe os resultados
	}
}
