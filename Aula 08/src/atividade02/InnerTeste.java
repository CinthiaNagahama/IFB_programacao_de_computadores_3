package atividade02;

public class InnerTeste {
	public static void main(String args[]) {
		MostraNumero mn = new MostraNumero();
		MostraNumero.MostraNumeroInterno mni = mn.new MostraNumeroInterno();
		
		System.out.println(mni.getNumero());
	}
}
