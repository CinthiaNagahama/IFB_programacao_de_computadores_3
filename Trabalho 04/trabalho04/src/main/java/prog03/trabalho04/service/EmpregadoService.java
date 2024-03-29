package prog03.trabalho04.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import prog03.trabalho04.domain.Empregado;
import prog03.trabalho04.repository.EmpregadoRepository;

@Service
public class EmpregadoService {
	@Autowired
	private EmpregadoRepository empregadoRepository;
	
	public Empregado save(Empregado empregado) {
		return empregadoRepository.save(empregado);
	}
	
	public List<Empregado> findAll(){
		return (List<Empregado>) empregadoRepository.findAll();
	}
	
	public Optional<Empregado> findById(Long id) {
		return empregadoRepository.findById(id);
	}

	public Optional<Empregado> findByCpf(String cpf) {
		return empregadoRepository.findByCpf(cpf);
	}

	public Empregado update(Empregado empregado) {
		return empregadoRepository.save(empregado);
	}

	public void deleteById(Long id) {
		empregadoRepository.deleteById(id);
	}
}
