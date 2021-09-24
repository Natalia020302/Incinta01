package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.ISuscripcionDao;
import pe.edu.upc.entity.Suscripcion;

public class SuscripcionDaoImpl implements ISuscripcionDao, Serializable{

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pu")
	private EntityManager em;

	
	@Transactional
	@Override
	public void insertar(Suscripcion s) {
		// TODO Auto-generated method stub
		em.persist(s);
	}
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Suscripcion> listar() {
		List<Suscripcion> lista = new ArrayList<Suscripcion>();
		Query q =em.createQuery("select obs from Obstetra obs");
		lista =(List<Suscripcion>) q.getResultList();
		
		return lista;
	}

	@Transactional 
	@Override
	public void eliminar(int idS) {
		Suscripcion s = new Suscripcion();
		s = em.getReference(Suscripcion.class, s);
		em.remove(s);
		
	}

	
}