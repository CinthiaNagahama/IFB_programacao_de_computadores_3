package questao06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Usuario {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Servico> servicos = new ArrayList<Servico>();
		
		String keepGoing = "S";
		System.out.println("Bem vindo! Por favor insira os dados do servico: ");
		while(!keepGoing.equals("N")) {
			System.out.println("Preço por Hora de Serviço: ");
			Double ps = Double.parseDouble(scan.next());
			Servico s = new Servico(ps);
			
			System.out.println("Código do Serviço: ");
			s.setCodigo(Integer.parseInt(scan.next()));
			
			System.out.println("Descrição do Serviço: ");
			s.setDescricao(scan.next());
			
			System.out.println("Quantidade de Horas: ");
			s.setQtdeHora(Integer.parseInt(scan.next()));
			
			servicos.add(s);
			
			System.out.println("Deseja continuar? S/N");
			keepGoing = scan.next();
		}
		
		for(Servico s : servicos) {
			System.out.println("Serviço " + s.getCodigo() + ": " + s.getDescricao());
		}
		
		servicos.sort(null);
		for(Servico s : servicos) {
			System.out.println("Serviço " + s.getCodigo() + ": " + s.getDescricao());
		}
		
		scan.close();
	}
}
