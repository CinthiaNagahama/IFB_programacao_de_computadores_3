package questao16;

import java.util.HashSet;
import java.util.Set;

import questao15.ContaCorrente;

public class Questao16 {
	public static void main(String args[]) {
		Set<ContaCorrente> set = new HashSet<ContaCorrente>();
		
		for(int i = 0; i < 5; i++) {
			ContaCorrente cc = new ContaCorrente();
			cc.setNumero(i);
			
			set.add(cc);
		}
		
		for(ContaCorrente c : set) {
			System.out.println("ContaCorrente #" + c.getNumero());
		}
	}
}
