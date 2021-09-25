package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IPeriodoGestacionDao;
import pe.edu.upc.entity.PeriodoGestacion;

public class PeriodoGestacionDaoImpl implements IPeriodoGestacionDao, Serializable{

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pu")
	private EntityManager em;

	
	@Transactional
	@Override
	public void insertar(PeriodoGestacion periodoGestacion) {
		// TODO Auto-generated method stub
		em.persist(periodoGestacion);
	}
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<PeriodoGestacion> listar() {
		List<PeriodoGestacion> lista = new ArrayList<PeriodoGestacion>();
		Query q =em.createQuery("select periodoGestacion from PeriodoGestacion periodoGestacion");
		lista =(List<PeriodoGestacion>) q.getResultList();
		
		return lista;
	}

	@Transactional 
	@Override
	public void eliminar(int idPeriodoGestacion) {
		PeriodoGestacion periodoGestacion = new PeriodoGestacion();
		periodoGestacion = em.getReference(PeriodoGestacion.class, periodoGestacion);
		em.remove(periodoGestacion);
		
	}

	
}