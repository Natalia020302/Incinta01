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
	public void insertar(Certificados_de_obstetra usuario) {
		// TODO Auto-generated method stub
		
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Certificados_de_obstetra> listar() {
		List<Certificados_de_obstetra> lista = new ArrayList<Certificados_de_obstetra>();
		Query q =em.createQuery("select co from Certificados_de_obstetra co");
		lista =(List<Certificados_de_obstetra>) q.getResultList();
		
		return lista;
	}

	@Transactional 
	@Override
	public void eliminar(int idCertificado, int IDObstetra) {
		Certificados_de_obstetra co = new Certificados_de_obstetra();
		co = em.getReference(Certificados_de_obstetra.class, co);
		em.remove(co);
	}

	
}