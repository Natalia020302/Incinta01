package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.ITipo_certificadoDao;
import pe.edu.upc.entity.Tipo_certificado;

public class Tipo_certificadoDaoImpl implements ITipo_certificadoDao, Serializable{

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pu")
	private EntityManager em;

	
	@Transactional
	@Override
	public void insertar(Tipo_certificado tc) {
		// TODO Auto-generated method stub
		
	}
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Tipo_certificado> listar() {
		List<Tipo_certificado> lista = new ArrayList<Tipo_certificado>();
		Query q =em.createQuery("select tc from Tipo_certificado tc");
		lista =(List<Tipo_certificado>) q.getResultList();
		
		return lista;
	}

	@Transactional 
	@Override
	public void eliminar(int idTC) {
		Tipo_certificado tc = new Tipo_certificado();
		tc = em.getReference(Tipo_certificado.class, tc);
		em.remove(tc);
		
	}

	
}