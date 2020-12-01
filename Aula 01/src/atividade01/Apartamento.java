package atividade01;

public class Apartamento {
	private Integer codigo;
	private Double area;
	private Integer numeroComodo;
	
	// Getters and Setters
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	
	public Double getArea() {
		return area;
	}
	public void setArea(Double area) {
		this.area = area;
	}
	
	public Integer getNumeroComodo() {
		return numeroComodo;
	}
	public void setNumeroComodo(Integer numeroComodo) {
		this.numeroComodo = numeroComodo;
	}
	
	public Apartamento() {
		
	}
	
	// Others
	public boolean equals(Object obj) {
		if((obj instanceof Apartamento) && ((Apartamento)obj).getCodigo().equals(this.getCodigo())) return true;
		else return false;
	}
	
	public int hashCode() {
		// return this.getCodigo();
		return 0;
	}
}
