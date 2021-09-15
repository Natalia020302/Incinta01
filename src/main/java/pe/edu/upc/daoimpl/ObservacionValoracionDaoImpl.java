package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IObservacionValoracionDao;
import pe.edu.upc.entity.ObservacionValoracion;

public class ObservacionValoracionDaoImpl implements IObservacionValoracionDao, Serializable{

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pu")
	private EntityManager em;

	
	@Transactional
	@Override
	public void insertar(ObservacionValoracion observacionValoracion) {
		// TODO Auto-generated method stub
		
	}
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<ObservacionValoracion> listar() {
		List<ObservacionValoracion> lista = new ArrayList<ObservacionValoracion>();
		Query q =em.createQuery("select m from Usuario m");
		lista =(List<ObservacionValoracion>) q.getResultList();
		
		return lista;
	}

	@Transactional 
	@Override
	public void eliminar(int idObservacionValoracion) {
		ObservacionValoracion observacionValoracion = new ObservacionValoracion();
		observacionValoracion = em.getReference(ObservacionValoracion.class, observacionValoracion);
		em.remove(observacionValoracion);
		
	}

	
}
