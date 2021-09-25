package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.ITipoCertificadoDao;
import pe.edu.upc.entity.TipoCertificado;

public class TipoCertificadoDaoImpl implements ITipoCertificadoDao, Serializable{

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pu")
	private EntityManager em;

	
	@Transactional
	@Override
	public void insertar(TipoCertificado tc) {
		// TODO Auto-generated method stub
		em.persist(tc);
	}
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<TipoCertificado> listar() {
		List<TipoCertificado> lista = new ArrayList<TipoCertificado>();
		Query q =em.createQuery("select tc from TipoCertificado tc");
		lista =(List<TipoCertificado>) q.getResultList();
		
		return lista;
	}

	@Transactional 
	@Override
	public void eliminar(int idTipoCertificado) {
		TipoCertificado tc = new TipoCertificado();
		tc = em.getReference(TipoCertificado.class, tc);
		em.remove(tc);
		
	}

	
}