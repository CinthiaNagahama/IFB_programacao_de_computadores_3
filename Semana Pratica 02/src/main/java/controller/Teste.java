package controller;

import java.time.LocalDate;
import java.util.List;

import model.Dependente;
import model.Empregado;

// import util.HibernateUtil;

public class Teste {
	public static void main(String[] args) {
		// HibernateUtil.getSessionFactory();
		
		EmpregadoController ec = new EmpregadoController();
		Empregado emp = new Empregado();
		
		/* Testes de Empregado */
		/*
		emp.setCpf("0001112223");
		emp.setIdade(21);
		emp.setNome("Arlindo Dias Lobato");
		emp.setSalario(1010.00);
		ec.incluir(emp);
		
		emp.setCpf("0001112224");
		emp.setIdade(21);
		emp.setNome("Arlindo Dias Lobato");
		emp.setSalario(1010.00);
		ec.incluir(emp);
		
		emp.setCpf("0001112225");
		emp.setIdade(21);
		emp.setNome("Arlindo Dias Lobato");
		emp.setSalario(1010.00);
		ec.incluir(emp);
		
		emp.setCpf("0001112226");
		emp.setIdade(21);
		emp.setNome("Arlindo Dias Lobato");
		emp.setSalario(1010.00);
		ec.incluir(emp);
		
		List<Empregado> lista = ec.listarTodos();
		if(lista != null){
			for(Empregado e : lista){
				System.out.println("CPF: " + e.getCpf());
			}
		}
		
		
		emp = ec.buscarPeloCPF("0001112226");
		if(emp != null) {
			System.out.println("Nome: " + emp.getNome() + "\nCPF: " + emp.getCpf());
		}
		*/
		
		Dependente d = new Dependente();
		DependenteController dc = new DependenteController();
		
		/* Testes de Dependente */
		/*
		emp.setCpf("0001112223");
		d.setCodigo(1);
		d.setDataNascimento(LocalDate.of(2019, 12, 12));
		d.setGrauParentesco("Filho");
		d.setNome("João Vítor Lobato");
		d.setEmpregado(emp);
		dc.incluir(d);
		
		
		emp.setCpf("0001112223");
		d.setCodigo(2);
		d.setDataNascimento(LocalDate.of(2019, 12, 12));
		d.setGrauParentesco("Filho");
		d.setNome("Ana Luiza Lobato");
		d.setEmpregado(emp);
		dc.incluir(d);
		
		emp.setCpf("0001112224");
		d.setCodigo(3);
		d.setDataNascimento(LocalDate.of(2016, 11, 02));
		d.setGrauParentesco("Genro");
		d.setNome("Miguel Vasconceles");
		d.setEmpregado(emp);
		dc.incluir(d);
		
		emp.setCpf("0001112226");
		d.setCodigo(4);
		d.setDataNascimento(LocalDate.of(1944, 05, 12));
		d.setGrauParentesco("Avô");
		d.setNome("Ramírez Gomes Lobato");
		d.setEmpregado(emp);
		dc.incluir(d);
		
		emp.setCpf("0001112226");
		d.setCodigo(5);
		d.setDataNascimento(LocalDate.of(2012, 12, 07));
		d.setGrauParentesco("Filho");
		d.setNome("Adão Lobato");
		d.setEmpregado(emp);
		dc.incluir(d);
		
		emp.setCpf("0001112226");
		d.setCodigo(6);
		d.setDataNascimento(LocalDate.of(1939, 03, 01));
		d.setGrauParentesco("Avô");
		d.setNome("Maria Aparecida Nascimento");
		d.setEmpregado(emp);
		dc.incluir(d);
		
		
		List<Dependente> lista = dc.listarTodos();
		if(lista != null){
			for(Dependente dep : lista){
				System.out.println("Nome: " + dep.getNome());
			}
		}
		
		emp.setCpf("0001112226");
		List<Dependente> lista = dc.buscarPeloEmpregado(emp);
		if(lista != null){
			for(Dependente dep : lista){
				System.out.println("Nome: " + dep.getNome());
			}
		}
		
		emp.setCpf("0001112223");
		d.setCodigo(2);
		d.setDataNascimento(LocalDate.of(2019, 12, 12));
		d.setGrauParentesco("Filha");
		d.setNome("Ana Luiza Lobato");
		d.setEmpregado(emp);
		dc.alterar(d);

		dc.buscarPeloCodigo(2);
		if(d != null) {
			System.out.println("Nome: " + d.getNome());
		}
		*/
	}
}
