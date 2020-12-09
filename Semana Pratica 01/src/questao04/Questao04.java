package questao04;

public class Questao04 {
	public static void main(String args[]) {
		System.out.println("As grandes diferenças entre o ArrayList e o Vector são:\n");
		System.out.println(" > ArrayList:"
				+ "\n\t- Como uma lista de dimensionamento dinâmico, sempre que necessário, o array será copiado para um novo ArrayList"
				+ "que tenha 50% a mais de espaço disponível."
				+ "\n\t- Não é thread-safe, ou seja, necessita de código próprio para sincronização caso for necessário usar em várias"
				+ " threads.");
		
		System.out.println(" > Vector:"
				+ "\n\t- Como uma lista de dimensionamento dinâmico, sempre que necessário, o array será copiado para um novo Vector"
				+ "que tenha 100% a mais de espaço disponível."
				+ "\n\t- É thread-safe.");
	}
}
