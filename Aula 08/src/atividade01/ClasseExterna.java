package atividade01;

public class ClasseExterna {
	private Integer numero;
	
	private class ClasseInterna{
		public void imprimir() {
			System.out.println("Dentro do m�todo da inner class");
		}
	}
	
	
	public void mostraInnerClass() {
		ClasseInterna ci = new ClasseInterna();
		ci.imprimir();
	}
}
