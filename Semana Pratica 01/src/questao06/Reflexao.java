package questao06;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflexao {
	public static void mostraAtributos(Class<?> c) {
		System.out.println("\nAtributos, exceto so herdados: \n");
		for(Field f : c.getDeclaredFields()) {
			System.out.println(f);
		}
		
		System.out.println("\nAtributos, exceto os privados: \n");
		for(Field f : c.getFields()) {
			System.out.println(f);
		}
	}
	
	public static void mostraMetodos(Class<?> c) {
		System.out.println("\nMétodos, exceto so herdados: \n");
		for(Method f : c.getDeclaredMethods()) {
			System.out.println(f);
		}
		
		System.out.println("\nMétodos, exceto os privados: \n");
		for(Method f : c.getMethods()) {
			System.out.println(f);
		}
	}
}
