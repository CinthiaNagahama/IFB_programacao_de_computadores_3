package atividade04;

public class EnumTeste {
	public static void main(String args[]) {
		System.out.println(Imposto.calcularImposto(115000.0, Taxa.ITBI));
		System.out.println(Imposto.calcularImposto(115000.0, Taxa.IPTU));
		System.out.println(Imposto.calcularImposto(115000.0, Taxa.IPVA));
	}
}
