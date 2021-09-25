package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IRegistroCitaDao;
import pe.edu.upc.entity.RegistroCita;

public class RegistroCitaDaoImpl implements IRegistroCitaDao, Serializable{

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pu")
	private EntityManager em;

	
	@Transactional
	@Override
	public void insertar(RegistroCita registroCita) {
		// TODO Auto-generated method stub
		
	}
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<RegistroCita> listar() {
		List<RegistroCita> lista = new ArrayList<RegistroCita>();
		Query q =em.createQuery("select m from RegistroCita m");
		lista =(List<RegistroCita>) q.getResultList();
		
		return lista;
	}

	@Transactional 
	@Override
	public void eliminar(int idRegistroCita) {
		RegistroCita registroCita = new RegistroCita();
		registroCita = em.getReference(RegistroCita.class, idRegistroCita);
		em.remove(registroCita);
		
	}

	
}