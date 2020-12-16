package atividade05;

import java.util.HashMap;
import java.util.Map;

public class NotaFiscal {
	public static void main(String[] args) {
		Map<Servicos, Integer> listaServicos = new HashMap<Servicos, Integer>();
		
		listaServicos.put(Servicos.CONSERTO_COMPUTADOR, 7);
		listaServicos.put(Servicos.CONSERTO_IMPRESSORA, 5);
		listaServicos.put(Servicos.CONSERTO_ARCONDICIONADO, 2);
		listaServicos.put(Servicos.CONSERTO_CELULAR, 2);
		listaServicos.put(Servicos.CONSERTO_GELADEIRA, 1);
		listaServicos.put(Servicos.CONSERTO_NOTEBOOK, 3);
		
		System.out.println("\tTipo\t\t\tDescri��o\t\tValor unit�rio\tQuantidade\tValor total");
		
		for(Servicos servico : listaServicos.keySet()) {
			System.out.println(servico.toString() + "\t " +
					servico.getDescricao() + "\t   " +
					servico.getValor() + "\t    " +
					listaServicos.get(servico) + "\t\t  " +
					CalculaValor.calculaValorServico(servico, listaServicos.get(servico))
				);
		}
		
		System.out.println("\nTotal dos servi�os -------------------------------------------------------------------: R$" + 
				CalculaValor.calculaValorTotal(listaServicos));
	}
}
