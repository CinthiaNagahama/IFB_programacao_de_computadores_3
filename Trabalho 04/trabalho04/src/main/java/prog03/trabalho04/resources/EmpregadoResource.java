package prog03.trabalho04.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import prog03.trabalho04.domain.Empregado;
import prog03.trabalho04.service.EmpregadoService;

@RestController
@RequestMapping("/empregados")
public class EmpregadoResource {
	@Autowired
	private EmpregadoService empregadoService;
	
	@PostMapping
	public Empregado save(@RequestBody Empregado empregado) {
		return empregadoService.save(empregado);
	}
	
	@GetMapping
	public ResponseEntity<List<Empregado>> findAll(){
		List<Empregado> empregados = empregadoService.findAll();
		if(empregados == null || empregados.isEmpty()) {
			return new ResponseEntity<List<Empregado>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Empregado>>(empregados, HttpStatus.OK);
	}
	
	@GetMapping(path = {"/{id}"})
	public ResponseEntity<?> findById(@PathVariable Long id){
		return empregadoService.findById(id)
			.map(record -> ResponseEntity.ok().body(record))
			.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping(path = {"/empregado/{cpf}"})
	public ResponseEntity<?> findByCpf(@PathVariable Long cpf){
		return empregadoService.findByCpf(Long.toString(cpf))
			.map(record -> ResponseEntity.ok().body(record))
			.orElse(ResponseEntity.notFound().build());
	}
	
	@PutMapping(value="/{id}")
	public ResponseEntity<Empregado> update(@PathVariable("id") Long id, @RequestBody Empregado empregado) {
	return empregadoService.findById(id)
		.map(record -> {
			record.setCpf(empregado.getCpf());
			record.setNome(empregado.getNome());
			record.setIdade(empregado.getIdade());
			record.setSalario(empregado.getSalario());
			
			Empregado updated = empregadoService.save(record);
			return ResponseEntity.ok().body(updated);
		})
		.orElse(ResponseEntity.notFound().build());
	}
	
	@DeleteMapping(path ={"/{id}"})
	public ResponseEntity<?> delete(@PathVariable Long id) {
		return empregadoService.findById(id)
			.map(record -> {
				empregadoService.deleteById(id);
				return ResponseEntity.ok().build();
			})
			.orElse(ResponseEntity.notFound().build());
	}
}
