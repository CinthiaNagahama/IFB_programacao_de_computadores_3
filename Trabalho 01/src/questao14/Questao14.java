package questao14;

import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import questao13.Aluno;

public class Questao14 {
	public static boolean encontradoSet(Set<Aluno> set, Aluno busca) {
		return set.contains(busca);
	}
	
	public static boolean encontradoMap(HashMap<Integer, Aluno> map, Aluno busca) {
		return map.containsValue(busca);
	}
	
	public static void main(String[] args) {
		HashMap<Integer, Aluno> map = new HashMap<Integer, Aluno>();
		Set<Aluno> set = new HashSet<Aluno>();
		
		for(int i = 0; i < 20_000; i++) {
			Aluno a = new Aluno();
			a.setNome("Aluno " + i);
			a.setRg(Integer.toString(i));
			
			map.put(i, a);
			set.add(a);
		}
		
		Random num = new Random();
		Aluno busca = new Aluno();
		busca.setRg(Integer.toString(num.nextInt(20_000)));
		
		long mapTime0 = Calendar.getInstance().getTimeInMillis();
		// boolean encontradoMap = map.containsValue(busca);
		boolean encontradoMap = encontradoMap(map, busca);
		long mapTime1 = Calendar.getInstance().getTimeInMillis();
		
		System.out.println(encontradoMap ? 
			"Tempo do HashMap para encontrar o aluno de rg " + busca.getRg() + ": " + (mapTime1 - mapTime0) + "ms" :
			"Aluno não encontrado"	
		);
		
		long setTime0 = Calendar.getInstance().getTimeInMillis();
		// boolean encontradoSet = set.contains(busca);
		boolean encontradoSet = encontradoSet(set, busca);
		long setTime1 = Calendar.getInstance().getTimeInMillis();
		
		System.out.println(encontradoSet ?
			"Tempo do HashSet para encontrar o aluno de rg " + busca.getRg() + ": " + (setTime1 - setTime0) + "ms" :
			"Aluno não encontrado"
		);
	}
}
