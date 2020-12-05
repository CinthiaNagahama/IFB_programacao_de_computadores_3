package questao08;

import java.util.HashMap;
import java.util.Map;

public class Questao08 {
	public static void main (String args[]) {
		Map<Integer, String> array = new HashMap<Integer, String>();
		
		for(int i = 1; i < 4; i++) {
			array.put(i, "String " + i);
			array.put(i, "String " + i);
		}
		
		System.out.println("Strings no HashMap:\n");
		for(Integer key : array.keySet()) {
			System.out.println(key + " | " + array.get(key));
		}
		
		System.out.println("\nTamanho do HashMap: " + array.size());
	}
}
