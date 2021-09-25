package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IPreguntasGestanteDao;
import pe.edu.upc.entity.PreguntasGestante;

public class PreguntasGestanteDaoImpl implements IPreguntasGestanteDao, Serializable{

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pu")
	private EntityManager em;

	
	@Transactional
	@Override
	public void insertar(PreguntasGestante preguntasGestante) {
		// TODO Auto-generated method stub
		em.persist(preguntasGestante);
	}
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<PreguntasGestante> listar() {
		List<PreguntasGestante> lista = new ArrayList<PreguntasGestante>();
		Query q =em.createQuery("select m from PreguntasGestante m");
		lista =(List<PreguntasGestante>) q.getResultList();
		
		return lista;
	}

	@Transactional 
	@Override
	public void eliminar(int idPregunta) {
		PreguntasGestante preguntasGestante = new PreguntasGestante();
		preguntasGestante = em.getReference(PreguntasGestante.class, idPregunta);
		em.remove(preguntasGestante);
		
	}

	
}