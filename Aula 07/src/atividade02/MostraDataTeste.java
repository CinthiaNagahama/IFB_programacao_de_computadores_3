package atividade02;

public class MostraDataTeste {
	public static void main(String args[]) {
		MostraData md1 = new MostraData("Olá");
		MostraData md2 = new MostraData("Adeus");
		
		// Acontecem ao "mesmo tempo"
		// md1.start();
		// md2.start();
		
		// md1 primeiro e depois md2
		// obs: Se a chamada dos métodos star() não estiver comentada, eles serão executados em sincronia com a chamada dos métodos run()
		md1.run();
		md2.run();
	}
}
