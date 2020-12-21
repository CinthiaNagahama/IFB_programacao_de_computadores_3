package atividade04;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Contador extends JFrame{
	JLabel l1;
	
	public Contador(String titulo) {
		JFrame j = new JFrame(titulo);
		j.setDefaultCloseOperation(j.EXIT_ON_CLOSE);
		l1 = new JLabel("Inicia Contador");
		j.add(l1);
		j.setSize(300, 200);
		j.setVisible(true);
	}
	
	private void iniciaContador() {
		try {
			for(int i = 10; i > 0; i--) {
				Thread.sleep(1000);
				l1.setText(i + "");
			}
		} catch (InterruptedException ie) {
			System.out.println(ie.getMessage());
		}
		l1.setText(Thread.currentThread().toString());
	}
	
	public static void main(String[] args) {
		Contador t = new Contador("Contador");
		t.iniciaContador();
	}
}
