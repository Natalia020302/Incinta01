package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.ICertificadosDeObstetraDao;
import pe.edu.upc.entity.CertificadosDeObstetra;

public class CertificadosDeObstetraDaoImpl implements ICertificadosDeObstetraDao, Serializable{

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pu")
	private EntityManager em;

	
	@Transactional
	@Override
	public void insertar(CertificadosDeObstetra cdo) {
		// TODO Auto-generated method stub
		em.persist(cdo);
	}
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<CertificadosDeObstetra> listar() {
		List<CertificadosDeObstetra> lista = new ArrayList<CertificadosDeObstetra>();
		Query q =em.createQuery("select obs from CertificadosDeObstetra obs");
		lista =(List<CertificadosDeObstetra>) q.getResultList();
		
		return lista;
	}

	@Transactional 
	@Override
	public void eliminar(int idCertificadosDeObstetra) {
		CertificadosDeObstetra cdo = new CertificadosDeObstetra();
		cdo = em.getReference(CertificadosDeObstetra.class, idCertificadosDeObstetra);
		em.remove(cdo);
		
	}

	
}