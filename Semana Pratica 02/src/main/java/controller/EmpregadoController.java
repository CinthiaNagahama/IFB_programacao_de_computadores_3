package controller;

import java.util.List;

import model.Empregado;
import persistence.EmpregadoDAOImp;

public class EmpregadoController {
	public void incluir(Empregado empregado) {
		EmpregadoDAOImp ed = new EmpregadoDAOImp();
		ed.incluir(empregado);
	}
	
	public void alterar(Empregado empregado) {
		EmpregadoDAOImp ed = new EmpregadoDAOImp();
		ed.alterar(empregado);
	}
	
	public void excluir(Empregado empregado) {
		EmpregadoDAOImp ed = new EmpregadoDAOImp();
		ed.excluir(empregado);
	}
	
	public List<Empregado> listarTodos(){
		EmpregadoDAOImp ed = new EmpregadoDAOImp();
		return ed.listarTodos();
	}
	
	public Empregado buscarPeloCPF(String cpf) {
		EmpregadoDAOImp ed = new EmpregadoDAOImp();
		return ed.buscarPeloCPF(cpf);
	}
}
