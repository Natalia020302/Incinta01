package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.ITipo_identificacionDao;
import pe.edu.upc.entity.Tipo_identificacion;

public class Tipo_identificacionDaoImpl implements ITipo_identificacionDao, Serializable{

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pu")
	private EntityManager em;

	
	@Transactional
	@Override
	public void insertar(Tipo_identificacion tipo_identificacion) {
		// TODO Auto-generated method stub
		
	}
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Tipo_identificacion> listar() {
		List<Tipo_identificacion> lista = new ArrayList<Tipo_identificacion>();
		Query q =em.createQuery("select m from Tipo_identificacion m");
		lista =(List<Tipo_identificacion>) q.getResultList();
		
		return lista;
	}

	@Transactional 
	@Override
	public void eliminar(int idTipo_identificacion) {
		Tipo_identificacion tipo_identificacion = new Tipo_identificacion();
		tipo_identificacion = em.getReference(Tipo_identificacion.class, tipo_identificacion);
		em.remove(tipo_identificacion);
		
	}

	
}