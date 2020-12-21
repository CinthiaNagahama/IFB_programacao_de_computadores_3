package atividade08;

public class ContaBancaria {
	private Double saldo;
	
	// Getter
	public double getSaldo() {
		return saldo;
	}
	
	// Constructor
	public ContaBancaria() {
		saldo = 0.0;
	}
	
	public synchronized void deposito(double quantia) {
		System.out.print("Depositando " + quantia);
		double novoSaldo = saldo + quantia;
		System.out.println(", novo saldo é " + novoSaldo);
		saldo = novoSaldo;
		notifyAll();
	}
	
	public synchronized void saque(double quantia) throws InterruptedException {
		while (saldo < quantia) wait();
		
		System.out.print("Sacando " + quantia);
		double novoSaldo = saldo - quantia;
		System.out.println(", novo saldo é " + novoSaldo);
		saldo = novoSaldo;
	}
}
