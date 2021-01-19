package persistence;

import java.util.List;

import model.Veiculo;

public interface VeiculoDAO {
	public void inclur(Veiculo veiculo);
	public void alterar(Veiculo veiculo);
	public void excluir(Veiculo veiculo);
	public List<Veiculo>listarTodos();
	public Veiculo buscarPelaPlaca(String placa);
}
