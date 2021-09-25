package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IQuejaDao;
import pe.edu.upc.entity.Queja;

public class QuejaDaoImpl implements IQuejaDao, Serializable{

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pu")
	private EntityManager em;

	
	@Transactional
	@Override
	public void insertar(Queja queja) {
		// TODO Auto-generated method stub
		em.persist(queja);
	}
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Queja> listar() {
		List<Queja> lista = new ArrayList<Queja>();
		Query q =em.createQuery("select m from Queja m");
		lista =(List<Queja>) q.getResultList();
		
		return lista;
	}

	@Transactional 
	@Override
	public void eliminar(int idQueja) {
		Queja queja = new Queja();
		queja = em.getReference(Queja.class, idQueja);
		em.remove(queja);
		
	}

	
}