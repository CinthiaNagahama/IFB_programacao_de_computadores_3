package questao06;

public class Teste {
	public static void main(String args[]) {
		Pessoa p1 = new Pessoa("João Alberto de Souza", 44, "847379548-222", "3958768137-12");
		Reflexao.mostraAtributos(p1.getClass());
		Reflexao.mostraMetodos(p1.getClass());
	}
}
