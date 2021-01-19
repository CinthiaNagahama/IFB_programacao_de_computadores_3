package persistence;

import java.util.List;

import model.Multa;
import model.Veiculo;

public interface MultaDAO {
	public void incluir(Multa multa);
	public void alterar(Multa multa);
	public void excluir(Multa multa);
	public List<Multa>listarTodos();
	public Multa buscarPeloCodigo(int codigo);
	public List<Multa>buscarPeloVeiculo(Veiculo veiculo);
}
