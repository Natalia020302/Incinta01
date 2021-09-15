package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IObstetraSuscripcionDao;
import pe.edu.upc.entity.ObservacionValoracion;
import pe.edu.upc.entity.ObstetraSuscripcion;

public class ObstetraSuscripcionDaoImpl implements IObstetraSuscripcionDao, Serializable{

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pu")
	private EntityManager em;

	
	@Transactional
	@Override
	public void insertar(ObstetraSuscripcion obstetraSuscripcion) {
		// TODO Auto-generated method stub
		
	}
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<ObstetraSuscripcion> listar() {
		List<ObstetraSuscripcion> lista = new ArrayList<ObstetraSuscripcion>();
		Query q =em.createQuery("select m from Usuario m");
		lista =(List<ObstetraSuscripcion>) q.getResultList();
		
		return lista;
	}

	@Transactional 
	@Override
	public void eliminar(int idObstetraSuscripcion) {
		ObstetraSuscripcion obstetraSuscripcion = new ObstetraSuscripcion();
		obstetraSuscripcion = em.getReference(ObstetraSuscripcion.class, obstetraSuscripcion);
		em.remove(obstetraSuscripcion);
		
	}

	
}
