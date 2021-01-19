package controller;

import java.util.List;

import model.Multa;
import model.Veiculo;
import persistence.MultaDAOImp;

public class MultaController {
	public void incluir(Multa multa){
		MultaDAOImp md = new MultaDAOImp();
		md.incluir(multa);
	}
	
	public void alterar(Multa multa){
		MultaDAOImp md = new MultaDAOImp();
		md.alterar(multa);
	}
	
	public void excluir(Multa multa){
		MultaDAOImp md = new MultaDAOImp();
		md.excluir(multa);
	}

	public List<Multa> listarTodos(){
		MultaDAOImp md = new MultaDAOImp();
		return md.listarTodos();
	}

	public Multa buscarPeloCodigo(int codigo){
		MultaDAOImp md = new MultaDAOImp();
		return md.buscarPeloCodigo(codigo);
	}
	
	public List<Multa> buscarPeloVeiculo(Veiculo veiculo){
		MultaDAOImp md = new MultaDAOImp();
		return md.buscarPeloVeiculo(veiculo);
	}
}
