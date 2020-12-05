package questao07;

import java.util.HashSet;
import java.util.Set;

public class Questao07 {
	public static void main (String args[]) {
		Set<String> array = new HashSet<String>();
		
		for(int i = 1; i < 4; i++) {
			array.add("String " + i);
			array.add("String " + i);
		}
		
		System.out.println("Strings no HashSet:\n");
		for(String a : array) {
			System.out.println(a);
		}
		System.out.println("\nTamanho do HashSet: " + array.size());
	}
}
