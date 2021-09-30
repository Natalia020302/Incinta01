package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IParametroDao;
import pe.edu.upc.entity.Parametro;

public class ParametroDaoImpl implements IParametroDao, Serializable{

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pu")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(Parametro parametro) {
		em.persist(parametro);
	}
	
	public int update(Parametro parametro) {
		em.merge(parametro);
		return parametro.getiDParametro();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Parametro> listar() {
		List<Parametro> lista = new ArrayList<Parametro>();
		Query q =em.createQuery("select p from Parametro p");
		lista =(List<Parametro>) q.getResultList();
		return lista;
	}

	@Transactional 
	@Override
	public void eliminar(int idParametro) {
		Parametro parametro = new Parametro();
		parametro = em.getReference(Parametro.class, idParametro);
		em.remove(parametro);
		
	}

	
}