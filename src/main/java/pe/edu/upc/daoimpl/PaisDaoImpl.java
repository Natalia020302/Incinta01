package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IPaisDao;
import pe.edu.upc.entity.Pais;

public class PaisDaoImpl implements IPaisDao, Serializable{

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pu")
	private EntityManager em;

	
	@Transactional
	@Override
	public void insertar(Pais pais) {
		// TODO Auto-generated method stub
		
	}
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Pais> listar() {
		List<Pais> lista = new ArrayList<Pais>();
		Query q =em.createQuery("select m from Pais m");
		lista =(List<Pais>) q.getResultList();
		
		return lista;
	}

	@Transactional 
	@Override
	public void eliminar(int idPais) {
		Pais pais = new Pais();
		pais = em.getReference(Pais.class, pais);
		em.remove(pais);
		
	}

	
}