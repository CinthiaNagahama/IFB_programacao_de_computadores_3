package atividade04;

public class InnerTeste {
	public static void main(String args[]) {
		Transporte transporte = new Transporte() {
			@Override
			public double calcularFrete() {
				return 0.0;
			}
		};
		
		System.out.println("Valor do frete: " + transporte.calcularFrete());
	}
}
