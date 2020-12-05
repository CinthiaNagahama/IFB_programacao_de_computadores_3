package questao06;

public class Servico implements Comparable<Servico>{
	private Integer codigo;
	private String descricao;
	private Double precoHora;
	private Integer qtdeHora;
	
	// Getters e Setter
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Double getPrecoHora() {
		return precoHora;
	}
	public void setPrecoHora(Double precoHora) {
		this.precoHora = precoHora;
	}
	
	public Integer getQtdeHora() {
		return qtdeHora;
	}
	public void setQtdeHora(Integer qtdeHora) {
		this.qtdeHora = qtdeHora;
	}
	
	public Servico(Double precoHora) {
		this.setPrecoHora(precoHora);
	}
	
	// Outros
	
	public Double calculaValor() {
		return this.getPrecoHora() * this.getQtdeHora();
	}
	
	@Override
	public int compareTo(Servico servico2){
		return (this.getDescricao().equals(servico2.getDescricao()) ? 0 : -1);
	}
}
