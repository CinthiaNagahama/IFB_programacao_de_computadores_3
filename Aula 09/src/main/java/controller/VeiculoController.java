package controller;

import java.util.List;

import model.Veiculo;
import persistence.VeiculoDAOImp;

public class VeiculoController {
	public void incluir(Veiculo veiculo) {
		VeiculoDAOImp vd = new VeiculoDAOImp();
		vd.inclur(veiculo);
	}
	
	public void alterar(Veiculo veiculo) {
		VeiculoDAOImp vd = new VeiculoDAOImp();
		vd.alterar(veiculo);
	}
	
	public void excluir(Veiculo veiculo) {
		VeiculoDAOImp vd = new VeiculoDAOImp();
		vd.excluir(veiculo);
	}
	
	public List<Veiculo> listarTodos(){
		VeiculoDAOImp vd = new VeiculoDAOImp();
		return vd.listarTodos();
	}
	
	public Veiculo buscarPelaPlaca(String placa) {
		VeiculoDAOImp vd = new VeiculoDAOImp();
		return vd.buscarPelaPlaca(placa);
	}
}
