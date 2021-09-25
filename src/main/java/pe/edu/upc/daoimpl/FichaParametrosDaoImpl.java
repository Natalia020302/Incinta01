package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IFichaParametrosDao;
import pe.edu.upc.entity.FichaParametros;

public class FichaParametrosDaoImpl implements IFichaParametrosDao, Serializable{

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pu")
	private EntityManager em;

	
	@Transactional
	@Override
	public void insertar(FichaParametros fichaParametros) {
		// TODO Auto-generated method stub
		em.persist(fichaParametros);
	}
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<FichaParametros> listar() {
		List<FichaParametros> lista = new ArrayList<FichaParametros>();
		Query q =em.createQuery("select m from FichaParametros m");
		lista =(List<FichaParametros>) q.getResultList();
		
		return lista;
	}

	@Transactional 
	@Override
	public void eliminar(int idFichaParametro) {
		FichaParametros fichaParametros = new FichaParametros();
		fichaParametros = em.getReference(FichaParametros.class, idFichaParametro);
		em.remove(fichaParametros);
		
	}

	
}