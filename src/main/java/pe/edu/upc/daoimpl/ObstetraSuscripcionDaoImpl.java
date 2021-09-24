package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IObstetraSuscripcionDao;
import pe.edu.upc.entity.ObstetraSuscripcion;

public class ObstetraSuscripcionDaoImpl implements IObstetraSuscripcionDao, Serializable{

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pu")
	private EntityManager em;

	
	@Transactional
	@Override
	public void insertar(ObstetraSuscripcion os) {
		// TODO Auto-generated method stub
		em.persist(os);
	}
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<ObstetraSuscripcion> listar() {
		List<ObstetraSuscripcion> lista = new ArrayList<ObstetraSuscripcion>();
		Query q =em.createQuery("select obs from ObstetraSuscripcion obs");
		lista =(List<ObstetraSuscripcion>) q.getResultList();
		
		return lista;
	}

	@Transactional 
	@Override
	public void eliminar(int idObstetraSuscripcion) {
		ObstetraSuscripcion os = new ObstetraSuscripcion();
		os = em.getReference(ObstetraSuscripcion.class, os);
		em.remove(os);
		
	}

	
}