package modelo.persistencia;

import java.util.List;

import modelo.Livro;

import org.hibernate.Session;

public class LivroDAO {
	
	private Session session;
	
	public LivroDAO() {
		session = HibernateUtil.openSession();
	}

	public void salvar(Livro livro){
		session.beginTransaction();
		session.save(livro);
		session.getTransaction().commit();
	}
	
	public List<Livro> todos(){
		return session.createCriteria(Livro.class).list();
	}
	
}
