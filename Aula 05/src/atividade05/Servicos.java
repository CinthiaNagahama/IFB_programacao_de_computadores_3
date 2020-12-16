package atividade05;

public enum Servicos {
	CONSERTO_IMPRESSORA("Conserto de impressora  ", 134),
	CONSERTO_COMPUTADOR("Conserto de computador de mesa", 200),
	CONSERTO_NOTEBOOK("Conserto de notebook/laptop", 110),
	CONSERTO_CELULAR("Conserto de celular     ", 100),
	CONSERTO_GELADEIRA("Conserto de geladeira   ", 160),
	CONSERTO_ARCONDICIONADO("Conserto de ar condicionado", 210);
	
	private String descricao;
	private double valor;
	
	Servicos(String descricao, double valor){
		this.descricao = descricao;
		this.valor = valor;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public double getValor() {
		return valor;
	}
}
