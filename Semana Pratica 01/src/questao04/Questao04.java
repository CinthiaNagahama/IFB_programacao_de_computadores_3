package questao04;

public class Questao04 {
	public static void main(String args[]) {
		System.out.println("As grandes diferen�as entre o ArrayList e o Vector s�o:\n");
		System.out.println(" > ArrayList:"
				+ "\n\t- Como uma lista de dimensionamento din�mico, sempre que necess�rio, o array ser� copiado para um novo ArrayList"
				+ "que tenha 50% a mais de espa�o dispon�vel."
				+ "\n\t- N�o � thread-safe, ou seja, necessita de c�digo pr�prio para sincroniza��o caso for necess�rio usar em v�rias"
				+ " threads.");
		
		System.out.println(" > Vector:"
				+ "\n\t- Como uma lista de dimensionamento din�mico, sempre que necess�rio, o array ser� copiado para um novo Vector"
				+ "que tenha 100% a mais de espa�o dispon�vel."
				+ "\n\t- � thread-safe.");
	}
}
