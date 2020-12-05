package questao15;

public class ContaCorrente {
	private String agencia;
	private Integer numero;
	private String nome;
	private String cpf;
	private Double saldo;
	
	// Getters e Setters
	
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public ContaCorrente() {}
	
	// Outros
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ContaCorrente && this.getNumero().equals(((ContaCorrente)obj).getNumero())) return true;
		else return false;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((this.getNumero() == null) ? 0 : this.getNumero().hashCode());
		
		return result;
	}
}
