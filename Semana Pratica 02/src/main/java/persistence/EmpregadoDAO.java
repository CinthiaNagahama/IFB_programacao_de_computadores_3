package persistence;

import java.util.List;

import model.Empregado;

public interface EmpregadoDAO {
	public void incluir(Empregado empregado);
	public void alterar(Empregado empregado);
	public void excluir(Empregado empregado);
	public List<Empregado>listarTodos();
	public Empregado buscarPeloCPF(String cpf);
}
