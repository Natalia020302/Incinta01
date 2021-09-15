package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.ICertificados_de_obstetraDao;
import pe.edu.upc.entity.Certificados_de_obstetra;

public class Certificados_de_obstetraDaoImpl implements ICertificados_de_obstetraDao, Serializable{

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pu")
	private EntityManager em;

	
	@Transactional
	@Override
	public void insertar(Certificados_de_obstetra certificados_de_obstetra) {
		// TODO Auto-generated method stub
		
	}
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Certificados_de_obstetra> listar() {
		List<Certificados_de_obstetra> lista = new ArrayList<Certificados_de_obstetra>();
		Query q =em.createQuery("select m from Usuario m");
		lista =(List<Certificados_de_obstetra>) q.getResultList();
		
		return lista;
	}

	@Transactional 
	@Override
	public void eliminar(int idCertificados_de_obstetra) {
		Certificados_de_obstetra certificados_de_obstetra = new Certificados_de_obstetra();
		certificados_de_obstetra = em.getReference(Certificados_de_obstetra.class, certificados_de_obstetra);
		em.remove(certificados_de_obstetra);
		
	}

	
}
