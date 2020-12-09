package questao05;

public class Questao05 {
	public static void main(String args[]) {
		System.out.println("As grandes diferenças entre o HashSet e o HashMap são:\n");
		System.out.println(" > HashMap:"
				+ "\n\t- Permite a existência de uma chave nula."
				+ "\n\t- Permite a existência de valores nulos"
				+"\n\t- Não é thread-safe, ou seja, necessita de código próprio para sincronização caso for necessário usar em várias"
				+ " threads.");
		
		System.out.println(" > HashSet:"
				+ "\n\t- Não permite chaves nulas."
				+ "\n\t- Não permite valores nulos."
				+ "\n\t- É thread-safe.");
	}
}
