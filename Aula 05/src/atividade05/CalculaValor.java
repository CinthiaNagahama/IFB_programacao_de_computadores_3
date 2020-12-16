package atividade05;

import java.util.Map;

public class CalculaValor {
	public static double calculaValorServico(Servicos tipo, int qtd) {
		return qtd * tipo.getValor();
	}
	
	public static double calculaValorTotal(Map<Servicos, Integer> listaServicos) {
		double total = 0;
		
		for(Servicos servico : listaServicos.keySet()) {
			total += calculaValorServico(servico, listaServicos.get(servico));
		}
		
		return total;
	}
}
