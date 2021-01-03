package trabalho02;

public class Compra extends Thread{
	private Produto produto;
	private int quantia;
	
	private static final int REPETICOES = 10;
	private static final int ESPERA = 10;
	
	public Compra(Produto produto, int quantia) {
		this.produto = produto;
		this.quantia = quantia;
	}
	
	public void run() {
		try {
			for(int i = 1; i <= REPETICOES && !isInterrupted(); i++) {
				produto.deposito(quantia);
				sleep(ESPERA);
			}
		} catch (InterruptedException ie) {
			System.out.println(ie.getMessage());
		}
	}
}
