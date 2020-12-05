package questao03;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Questao03 {
	public static void main (String args[]) {
		List <String> array = new ArrayList<String>();
		
		for(int i = 1; i < 4; i++) {
			array.add("String " + i);
			array.add("String " + i);
		}
		
		Set<String> setList = new HashSet<String>();
		
		setList.addAll(array);
		
		System.out.println("\nStrings no ArrayList:\n");
		for(String a : array) {
			System.out.println(a);
		}
		
		System.out.println("\nStrings no HashSet:\n");
		for(String a : setList) {
			System.out.println(a);
		}
	}
}
