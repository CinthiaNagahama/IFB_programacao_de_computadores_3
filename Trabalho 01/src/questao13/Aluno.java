package questao13;

import java.util.Date;

public class Aluno {
	private String nome;
	private String rg;
	private Date dataNascimento;
	
	// Getters e Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	// Outros
	@Override
	public boolean equals(Object o) {
		if(o instanceof Aluno) {
			return (this.rg.equals(((Aluno) o).getRg())? true : false);
		}
		else return false;
	}
	
	/* ---- Questão 19 ---- */
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((this.getRg() == null) ? 0 : this.getRg().hashCode());
		
		return result;
	}
}
