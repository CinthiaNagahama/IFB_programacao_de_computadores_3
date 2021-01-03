package atividade05;

public class InnerTeste {
	public static void main(String args[]) {
		ClasseConcreta1 cc1 = new ClasseConcreta1();
		cc1.exibirMensagem(new Mensagem() {
			@Override
			public String retornarMensagem() {
				return "\"Mensagem qualquer\"";
			}
		});
	}
}
