package questao05;

public class Questao05 {
	public static void main(String args[]) {
		System.out.println("As grandes diferen�as entre o HashSet e o HashMap s�o:\n");
		System.out.println(" > HashMap:"
				+ "\n\t- Permite a exist�ncia de uma chave nula."
				+ "\n\t- Permite a exist�ncia de valores nulos"
				+"\n\t- N�o � thread-safe, ou seja, necessita de c�digo pr�prio para sincroniza��o caso for necess�rio usar em v�rias"
				+ " threads.");
		
		System.out.println(" > HashSet:"
				+ "\n\t- N�o permite chaves nulas."
				+ "\n\t- N�o permite valores nulos."
				+ "\n\t- � thread-safe.");
	}
}
