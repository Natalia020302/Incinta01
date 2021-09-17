package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.ICitaDao;
import pe.edu.upc.entity.Cita;

public class CitaDaoImpl implements ICitaDao, Serializable{

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pu")
	private EntityManager em;

	
	@Transactional
	@Override
	public void insertar(Cita cita) {
		// TODO Auto-generated method stub
		
	}
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Cita> listar() {
		List<Cita> lista = new ArrayList<Cita>();
		Query q =em.createQuery("select m from Cita m");
		lista =(List<Cita>) q.getResultList();
		
		return lista;
	}

	@Transactional 
	@Override
	public void eliminar(int idCita) {
		Cita cita = new Cita();
		cita = em.getReference(Cita.class, cita);
		em.remove(cita);
		
	}

	
}