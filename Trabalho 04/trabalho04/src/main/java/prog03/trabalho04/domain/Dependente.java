package prog03.trabalho04.domain;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Dependente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codigo;
	private String nome;
	private String grauParentesco;
	private LocalDate dataNascimento;
	
	@ManyToOne
	@JoinColumn(name = "cpf_empregado")
	private Empregado empregado;
	
	public Dependente() { }	
	
	// Getters e Setters

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGrauParentesco() {
		return grauParentesco;
	}
	public void setGrauParentesco(String grauParentesco) {
		this.grauParentesco = grauParentesco;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public Empregado getEmpregado() {
		return empregado;
	}
	public void setEmpregado(Empregado empregado) {
		this.empregado = empregado;
	}	
}
