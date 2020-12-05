package questao18;

import java.util.HashMap;

import questao13.Aluno;

public class Questao18 {
	public static void main(String[] args) {
		HashMap<String, Aluno> mapAlunos = new HashMap<String, Aluno>();
		
		Aluno a = new Aluno(), b = new Aluno(), c = new Aluno();
		
		a.setRg("11111");
		a.setNome("a");
		mapAlunos.put(a.getRg(), a);
		
		b.setRg("22222");
		b.setNome("b");
		mapAlunos.put(b.getRg(), b);
		
		c.setRg("11111");
		c.setNome("c");
		mapAlunos.put(c.getRg(), c);
		
		mapAlunos.forEach((key, aluno) -> System.out.println("RG: " + aluno.getRg() + " | Nome: " + aluno.getNome()));
	}
}
