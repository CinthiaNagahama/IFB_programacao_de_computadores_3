package atividade01;

public class EnumTeste {
	public static void main(String args[]) {
		// System.out.println(TipoPessoa.PESSOA_JURIDICA);
		
		TipoPessoa tp1 = TipoPessoa.PESSOA_FISICA;
		TipoPessoa tp2 = TipoPessoa.PESSOA_JURIDICA;
		
		System.out.println(tp1);
		System.out.println(tp1.name());
		System.out.println(tp1.toString());
	}
}
