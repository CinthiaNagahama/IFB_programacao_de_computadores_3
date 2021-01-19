package controller;

import java.util.List;

import model.Multa;
import model.Veiculo;
// import util.HibernateUtil;

public class Teste {
	public static void main(String[] args) {
		//HibernateUtil.getSessionFactory();
		
		/*
		Veiculo v = new Veiculo();
		VeiculoController vc = new VeiculoController();
		
		v.setPlaca("JIB4590");
		v.setAnoFabricacao(2015);
		v.setAnoModelo(2016);
		v.setCor("Prata");
		v.setModelo("Civic");
		vc.incluir(v);
		
		v.setPlaca("JIK1320");
		v.setAnoFabricacao(2015);
		v.setAnoModelo(2015);
		v.setCor("Cinza");
		v.setModelo("Crossfox");
		vc.incluir(v);
		
		v.setPlaca("JIB4560");
		v.setAnoFabricacao(2012);
		v.setAnoModelo(2012);
		v.setCor("Prata");
		v.setModelo("Logan");
		vc.incluir(v);
		
		v.setPlaca("PAZ1020");
		v.setAnoFabricacao(2017);
		v.setAnoModelo(2018);
		v.setCor("Verde");
		v.setModelo("Up");
		vc.incluir(v);
		*/
		
		/*
		List<Veiculo> lista = vc.listarTodos();
		if(lista != null){
			for(Veiculo ve : lista){
				System.out.println("Placa: "+ve.getPlaca());
				System.out.println("Cor: "+ve.getCor());
			}
		}
		*/
		
		/*
		v = vc.buscarPelaPlaca("PAZ1020");
		if(v != null){
			System.out.println("Placa: " + v.getPlaca());
			System.out.println("Cor: " + v.getCor());
			System.out.println("Ano de fabricação: " + v.getAnoFabricacao());
		}
		*/
		
		Multa m = new Multa();
		Veiculo v = new Veiculo();
		MultaController mc = new MultaController();
		
		/*
		v.setPlaca("PAZ1020");
		m.setCodigo(1);
		m.setDescricao("Ultrapassou com sinal vermelho");
		m.setArtigoViolado("Art. 3");
		m.setVeiculo(v);
		mc.incluir(m);
		
		m.setCodigo(2);
		m.setDescricao("Estacionamento proibido");
		m.setArtigoViolado("Art. 5");
		m.setVeiculo(v);
		mc.incluir(m);
		
		v.setPlaca("JIB4560");
		m.setCodigo(3);
		m.setDescricao("Parou na faixa de pedestre");
		m.setArtigoViolado("Art. 10");
		m.setVeiculo(v);
		mc.incluir(m);
		
		m.setCodigo(4);
		m.setDescricao("Estacionamento proibido");
		m.setArtigoViolado("Art. 5");
		m.setVeiculo(v);
		mc.incluir(m);
		
		m.setCodigo(5);
		m.setDescricao("Velocidade acima do permitido");
		m.setArtigoViolado("Art. 8");
		m.setVeiculo(v);
		mc.incluir(m);
		*/
		
		/*
		v.setPlaca("PAZ1020");
		m.setCodigo(1);
		m.setDescricao("Ultrapassou com sinal vermelho");
		m.setArtigoViolado("Art. 35");
		m.setVeiculo(v);
		mc.alterar(m);
		
		m.setCodigo(5);
		mc.excluir(m);
		*/
		/*
		List<Multa> lista = mc.listarTodos();
		if(lista != null){
			for(Multa mu : lista){
				System.out.println("Placa: " + mu.getVeiculo().getPlaca());
				System.out.println("Descrição: " + mu.getDescricao());
			}
		}
		*/
		
		m = mc.buscarPeloCodigo(3);
		if(m != null){
			System.out.println("Placa: " + m.getVeiculo().getPlaca());
			System.out.println("Descrição: " + m.getDescricao());
		}
		
		v.setPlaca("JIB4560");
		List<Multa> lista = mc.buscarPeloVeiculo(v);
		if(lista != null){
			for(Multa mu : lista){
				System.out.println("Placa: " + mu.getVeiculo().getPlaca());
				System.out.println("Descrição: " + mu.getDescricao());
			}	
		}
	}
}
