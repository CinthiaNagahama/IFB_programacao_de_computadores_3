package atividade02;

public class MostraDataTeste {
	public static void main(String args[]) {
		MostraData md1 = new MostraData("Ol�");
		MostraData md2 = new MostraData("Adeus");
		
		// Acontecem ao "mesmo tempo"
		// md1.start();
		// md2.start();
		
		// md1 primeiro e depois md2
		// obs: Se a chamada dos m�todos star() n�o estiver comentada, eles ser�o executados em sincronia com a chamada dos m�todos run()
		md1.run();
		md2.run();
	}
}
