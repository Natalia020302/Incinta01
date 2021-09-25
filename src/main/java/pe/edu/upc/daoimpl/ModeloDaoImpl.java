package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IObstetraDao;
import pe.edu.upc.entity.Obstetra;

public class ModeloDaoImpl implements IObstetraDao, Serializable{

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pu")
	private EntityManager em;

	
	@Transactional
	@Override
	public void insertar(Obstetra a) {
		// TODO Auto-generated method stub
		em.persist(a);
	}
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Obstetra> listar() {
		List<Obstetra> lista = new ArrayList<Obstetra>();
		Query q =em.createQuery("select obs from Obstetra obs");
		lista =(List<Obstetra>) q.getResultList();
		
		return lista;
	}

	@Transactional 
	@Override

	public void eliminar(int idObstetra) {
		Obstetra a = new Obstetra();
		a = em.getReference(Obstetra.class, a);
		em.remove(a);

	public void eliminar(int idQueja) {
		Queja queja = new Queja();
		queja = em.getReference(Queja.class, idQueja);
		em.remove(queja);
		
	}

	
}