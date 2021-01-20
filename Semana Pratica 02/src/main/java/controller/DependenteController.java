package controller;

import java.util.List;

import model.Dependente;
import model.Empregado;
import persistence.DependenteDAOImp;

public class DependenteController {
	public void incluir(Dependente dependente){
		DependenteDAOImp dd = new DependenteDAOImp();
		dd.incluir(dependente);
	}
	
	public void alterar(Dependente dependente){
		DependenteDAOImp dd = new DependenteDAOImp();
		dd.alterar(dependente);
	}
	
	public void excluir(Dependente dependente){
		DependenteDAOImp dd = new DependenteDAOImp();
		dd.excluir(dependente);
	}

	public List<Dependente> listarTodos(){
		DependenteDAOImp dd = new DependenteDAOImp();
		return dd.listarTodos();
	}

	public Dependente buscarPeloCodigo(int codigo){
		DependenteDAOImp dd = new DependenteDAOImp();
		return dd.buscarPeloCodigo(codigo);
	}
	
	public List<Dependente> buscarPeloEmpregado(Empregado empregado){
		DependenteDAOImp dd = new DependenteDAOImp();
		return dd.buscarPeloEmpregado(empregado);
	}
}
