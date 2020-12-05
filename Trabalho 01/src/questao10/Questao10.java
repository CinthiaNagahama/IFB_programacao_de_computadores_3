package questao10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Questao10 {
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
		Iterator<Integer> it = num.iterator();
		
		while(it.hasNext()) {
			int current = it.next();
			System.out.println(current);
			media += current;
		}
		System.out.println("Média = " + (media/num.size()));
	}
}
