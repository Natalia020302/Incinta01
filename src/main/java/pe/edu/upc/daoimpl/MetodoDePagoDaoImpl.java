package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IMetodoDePagoDao;
import pe.edu.upc.entity.MetodoDePago;

public class MetodoDePagoDaoImpl implements IMetodoDePagoDao, Serializable{

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pu")
	private EntityManager em;

	
	@Transactional
	@Override
	public void insertar(MetodoDePago metododePago) {
		// TODO Auto-generated method stub
		em.persist(metododePago);
	}
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<MetodoDePago> listar() {
		List<MetodoDePago> lista = new ArrayList<MetodoDePago>();
		Query q =em.createQuery("select metododePago from MetodoDePago metododePago");
		lista =(List<MetodoDePago>) q.getResultList();
		
		return lista;
	}

	@Transactional 
	@Override
	public void eliminar(int idMetodoDePago) {
		MetodoDePago metododePago = new MetodoDePago();
		metododePago = em.getReference(MetodoDePago.class, idMetodoDePago);
		em.remove(metododePago);
		
	}

	
}