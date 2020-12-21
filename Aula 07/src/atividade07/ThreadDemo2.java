package atividade07;

public class ThreadDemo2 implements Runnable{
	Thread thread;
	
	public ThreadDemo2 (String name) {
		thread = new Thread(this, name);
		thread.start();
	}
	
	public void run(){
		String nome = thread.getName();
		for(int i = 0; i < 100; i++) {
			System.out.println(nome);
		}
	}
	
	public static void main(String args[]) {
		ThreadDemo2 t1 = new ThreadDemo2("A");
		ThreadDemo2 t2 = new ThreadDemo2("B");
		ThreadDemo2 t3 = new ThreadDemo2("C");
		ThreadDemo2 t4 = new ThreadDemo2("D");
		System.out.println("Rodando threads...");
		
		try {
			t1.thread.join();
			t2.thread.join();
			t3.thread.join();
			t4.thread.join();
		} catch (InterruptedException ie) {
			System.out.println(ie.getMessage());
		}
		
		System.out.println("\nThreads mortas.");
	}
}
