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
	public void insertar(Suscripcion sus) {
		// TODO Auto-generated method stub
		
	}
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Suscripcion> listar() {
		List<Suscripcion> lista = new ArrayList<Suscripcion>();
		Query q =em.createQuery("select sus from Suscripcion sus");
		lista =(List<Suscripcion>) q.getResultList();
		
		return lista;
	}

	@Transactional 
	@Override
	public void eliminar(int idSuscripcion) {
		Suscripcion sus = new Suscripcion();
		sus = em.getReference(Suscripcion.class, sus);
		em.remove(sus);
		
	}

	
}