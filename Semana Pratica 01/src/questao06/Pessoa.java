package questao06;

public class Pessoa {
	private String nome;
	private int idade;
	private String cpf;
	private String rg;
	
	// Constructor
	
	public Pessoa(String nome, int idade, String cpf, String rg){
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.rg = rg;
	}
	
	// Getters
	
	public String getNome() {
		return nome;
	}
	public int getIdade() {
		return idade;
	}
	
	public String getCpf() {
		return cpf;
	}
	public String getRg() {
		return rg;
	}
}
