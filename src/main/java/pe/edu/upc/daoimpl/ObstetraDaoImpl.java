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

public class ObstetraDaoImpl implements IObstetraDao, Serializable{

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pu")
	private EntityManager em;

	
	@Transactional
	@Override
	public void insertar(Obstetra obs) {
		// TODO Auto-generated method stub
		em.persist(obs);
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
		Obstetra obs = new Obstetra();
		obs = em.getReference(Obstetra.class, obs);
		em.remove(obs);
		
	}

	
}