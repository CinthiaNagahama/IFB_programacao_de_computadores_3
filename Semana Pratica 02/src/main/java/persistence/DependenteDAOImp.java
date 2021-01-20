package persistence;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import model.Dependente;
import model.Empregado;
import util.HibernateUtil;

public class DependenteDAOImp implements DependenteDAO{
	private Session session; // Tem que ajeitar os métodos ainda
	
	public void incluir(Dependente dependente) {
		session = null;
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			session = sessionFactory.openSession();
			session.beginTransaction();
			session.save(dependente);
			session.getTransaction().commit();
		} catch (Exception e) {
			if(session != null){
				session.getTransaction().rollback();
			}
			e.printStackTrace();
		} finally {
			if(session != null){
				session.close();
			}
		}
	}
	
	public void alterar(Dependente dependente) {
		session = null;
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			session = sessionFactory.openSession();
			session.beginTransaction();
			session.update(dependente);
			session.getTransaction().commit();
		} catch (Exception e) {
			if(session != null){
				session.getTransaction().rollback();
			}
			e.printStackTrace();
		} finally {
			if(session != null){
				session.close();
			}
		}
	}
	
	public void excluir(Dependente dependente) {
		session = null;
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			session = sessionFactory.openSession();
			session.beginTransaction();
			session.delete(dependente);
			session.getTransaction().commit();
		} catch (Exception e) {
			if(session != null){
				session.getTransaction().rollback();
			}
			e.printStackTrace();
		} finally {
			if(session != null){
				session.close();
			}
		}
	}
	
	public List<Dependente> listarTodos() {
		session = null;
		List<Dependente> lista = null;
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			session = sessionFactory.openSession();
			session.beginTransaction();
			lista = session.createQuery("from Dependente").list();
			session.getTransaction().commit();
		} catch (Exception e) {
			if(session != null){
				session.getTransaction().rollback();
			}
			return null;
		} finally {
			if(session != null){
				session.close();
			}
		}
		return lista;
	}
	
	public Dependente buscarPeloCodigo(int codigo) {
		session = null;
		Dependente dependente = new Dependente();
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			session = sessionFactory.openSession();
			session.beginTransaction();
			dependente = (Dependente)session.load(Dependente.class, codigo);
			session.getTransaction().commit();
		} catch (Exception e) {
			if(session != null){
				session.getTransaction().rollback();
			}
			return null;
		} finally {
			if(session != null){
				session.close();
			}
		}	
		return dependente;
	}
	
	public List<Dependente> buscarPeloEmpregado(Empregado empregado) {
		session = null;
		List<Dependente> lista = null;
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			session = sessionFactory.openSession();
			session.beginTransaction();
			
			Query query = session.createQuery("from Dependente where cpf = :cpf");
			query.setParameter("cpf", empregado.getCpf());
			lista = query.list();
			
			session.getTransaction().commit();
		} catch (Exception e) {
			if(session != null){
				session.getTransaction().rollback();
			}
			return null;
		} finally {
			if(session != null){
				session.close();
			}
		}
		return lista;
	}	
}
