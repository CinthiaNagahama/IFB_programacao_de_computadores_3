package atividade04;

public class Imposto {
	public static double calcularImposto(double valor, Taxa tipo) {
		switch (tipo) {
			case IPTU: return valor * Taxa.IPTU.getPercentual();
		
			case IPVA: return valor * Taxa.IPVA.getPercentual();
		
			case ITBI: return valor * Taxa.ITBI.getPercentual();
		
			case ISSQN: return valor * Taxa.ISSQN.getPercentual();
		
			default:
				return 0.0;
		}
	}
}
