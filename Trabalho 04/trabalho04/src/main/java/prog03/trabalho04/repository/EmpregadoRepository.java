package prog03.trabalho04.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import prog03.trabalho04.domain.Empregado;

@Repository
public interface EmpregadoRepository extends CrudRepository<Empregado, Long>{
	Optional<Empregado> findByCpf(String cpf);
}
