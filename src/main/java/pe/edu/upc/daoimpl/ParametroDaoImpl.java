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
		// TODO Auto-generated method stub
		em.persist(parametro);
	}
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Parametro> listar() {
		List<Parametro> lista = new ArrayList<Parametro>();
		Query q =em.createQuery("select parametro from Parametro parametro");
		lista =(List<Parametro>) q.getResultList();
		
		return lista;
	}

	@Transactional 
	@Override
	public void eliminar(int idParametro) {
		Parametro parametro = new Parametro();
		parametro = em.getReference(Parametro.class, parametro);
		em.remove(parametro);
		
	}

	
}