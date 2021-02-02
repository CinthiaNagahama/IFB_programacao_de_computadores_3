package prog03.trabalho04.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import prog03.trabalho04.domain.Dependente;

@Repository
public interface DependenteRepository extends CrudRepository<Dependente, Long>{
	
}
