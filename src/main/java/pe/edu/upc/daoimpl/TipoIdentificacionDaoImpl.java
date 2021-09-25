package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.ITipoIdentificacionDao;
import pe.edu.upc.entity.TipoIdentificacion;

public class TipoIdentificacionDaoImpl implements ITipoIdentificacionDao, Serializable{

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pu")
	private EntityManager em;

	
	@Transactional
	@Override
	public void insertar(TipoIdentificacion tipoIdentificacion) {
		// TODO Auto-generated method stub
		em.persist(tipoIdentificacion);
	}
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<TipoIdentificacion> listar() {
		List<TipoIdentificacion> lista = new ArrayList<TipoIdentificacion>();
		Query q =em.createQuery("select m from TipoIdentificacion m");
		lista =(List<TipoIdentificacion>) q.getResultList();
		
		return lista;
	}

	@Transactional 
	@Override
	public void eliminar(int idTipoIdentificacion) {
		TipoIdentificacion tipoIdentificacion = new TipoIdentificacion();
		tipoIdentificacion = em.getReference(TipoIdentificacion.class, idTipoIdentificacion);
		em.remove(tipoIdentificacion);
		
	}

	
}