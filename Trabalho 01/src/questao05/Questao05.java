package questao05;

import java.util.ArrayList;
import java.util.List;

public class Questao05 {
	public static void main (String args[]) {
		List <String> array = new ArrayList<String>();
		
		for(int i = 1; i < 4; i++) {
			array.add("String " + i);
			array.add("String " + i);
		}
		
		array.sort(null);
		
		System.out.println("Strings no ArrayList:\n");
		for(String a : array) {
			System.out.println(a);
		}
	}
}
