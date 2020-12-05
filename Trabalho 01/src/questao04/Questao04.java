package questao04;

import java.util.ArrayList;
import java.util.List;

public class Questao04 {
	public static void main (String args[]) {
		List <String> array = new ArrayList<String>();
		
		for(int i = 1; i < 4; i++) {
			array.add("String " + i);
			array.add("String " + i);
		}
		
		System.out.println(array.contains("String 2") ? "'String 2' está presente no array" : "'String 2' não está presente no array");
	}
}
