package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IUnidadDao;
import pe.edu.upc.entity.Unidad;

public class UnidadDaoImpl implements IUnidadDao, Serializable{

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pu")
	private EntityManager em;

	
	@Transactional
	@Override
	public void insertar(Unidad unidad) {
		// TODO Auto-generated method stub
		em.persist(unidad);
	}
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Unidad> listar() {
		List<Unidad> lista = new ArrayList<Unidad>();
		Query q =em.createQuery("select unidad from Unidad unidad");
		lista =(List<Unidad>) q.getResultList();
		
		return lista;
	}

	@Transactional 
	@Override
	public void eliminar(int idUnidad) {
		Unidad unidad = new Unidad();
		unidad = em.getReference(Unidad.class, unidad);
		em.remove(unidad);
		
	}

	
}