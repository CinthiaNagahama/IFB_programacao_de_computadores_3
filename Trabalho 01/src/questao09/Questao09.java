package questao09;

import java.util.ArrayList;
import java.util.List;

public class Questao09 {
	public static void main (String args[]) {
		List <Integer> num = new ArrayList<Integer>();
		
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
