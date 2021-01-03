package trabalho02;

public class Produto {
	private int estoque;
	
	// Getter
	public int getEstoque() {
		return estoque;
	}
	
	// Constructor
	public Produto() {
		estoque = 0;
	}
	
	public Produto(int estoque) {
		this.estoque = estoque;
	}
	
	public synchronized void deposito(int quantia) {
		estoque += quantia;
		System.out.println("Estoque pós depósito: " + estoque);
		notifyAll();
	}
	
	public synchronized void retirada(int quantia) throws InterruptedException {
		while (estoque < quantia) wait();
		
		estoque -= quantia;
		System.out.println("Estoque pós retirada: " + estoque);
	}
}
