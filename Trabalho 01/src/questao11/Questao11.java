package questao11;

import java.util.HashSet;
import java.util.Set;

public class Questao11 {
	public static void main (String args[]) {
		Set <Integer> num = new HashSet<Integer>();
		
		num.add(100);
		num.add(20);
		num.add(200);
		num.add(30);
		num.add(80);
		num.add(40);
		num.add(100);
		num.add(200);
		
		float media = 0;
		for(Integer a : num) {
			System.out.println(a);
			media += a;
		}
		System.out.println("Média = " + (media/num.size()));
	}
}
