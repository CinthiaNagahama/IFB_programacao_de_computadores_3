package persistence;

import java.util.List;

import model.Dependente;
import model.Empregado;

public interface DependenteDAO {
	public void incluir(Dependente dependente);
	public void alterar(Dependente dependente);
	public void excluir(Dependente dependente);
	public List<Dependente>listarTodos();
	public Dependente buscarPeloCodigo(int codigo);
	public List<Dependente>buscarPeloEmpregado(Empregado empregado);
}
