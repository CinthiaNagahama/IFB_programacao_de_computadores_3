package prog03.trabalho04.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.lang.NonNull;

@Entity
public class Empregado {
	/*
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	*/
	@Id
	@NonNull
	private String cpf; 
	private String nome;
	private Integer idade;
	private Double salario;
	
	@OneToMany(mappedBy = "empregado", targetEntity = Dependente.class, cascade =  CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Dependente> dependentes = new ArrayList<>();
	
	public Empregado() { }
	
	// Getters e Setters
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
}
