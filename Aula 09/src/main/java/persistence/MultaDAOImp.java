package persistence;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import model.Multa;
import model.Veiculo;
import util.HibernateUtil;

public class MultaDAOImp implements MultaDAO{
	private Session session;
	
	public void incluir(Multa multa) {
		session = null;
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			session = sessionFactory.openSession();
			session.beginTransaction();
			session.save(multa);
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
	
	public void alterar(Multa multa) {
		session = null;
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			session = sessionFactory.openSession();
			session.beginTransaction();
			session.update(multa);
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
	
	public void excluir(Multa multa) {
		session = null;
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			session = sessionFactory.openSession();
			session.beginTransaction();
			session.delete(multa);
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
	
	public List<Multa> listarTodos() {
		session = null;
		List<Multa> lista = null;
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			session = sessionFactory.openSession();
			session.beginTransaction();
			lista = session.createQuery("from Multa").list();
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
	
	public Multa buscarPeloCodigo(int codigo) {
		session = null;
		Multa multa = new Multa();
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			session = sessionFactory.openSession();
			session.beginTransaction();
			multa = (Multa)session.load(Multa.class, codigo);
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
		return multa;
	}
	
	public List<Multa> buscarPeloVeiculo(Veiculo veiculo) {
		session = null;
		List<Multa> lista = null;
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			session = sessionFactory.openSession();
			session.beginTransaction();
			
			Query query = session.createQuery("from Multa where placa = :placa");
			query.setParameter("placa", veiculo.getPlaca());
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
