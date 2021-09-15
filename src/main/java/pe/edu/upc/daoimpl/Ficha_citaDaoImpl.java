package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IFicha_citaDao;
import pe.edu.upc.entity.Ficha_cita;

public class Ficha_citaDaoImpl implements IFicha_citaDao, Serializable{

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pu")
	private EntityManager em;

	
	@Transactional
	@Override
	public void insertar(Ficha_cita fc) {
		// TODO Auto-generated method stub
		
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Ficha_cita> listar() {
		List<Ficha_cita> lista = new ArrayList<Ficha_cita>();
		Query q =em.createQuery("select fc from Ficha_cita fc");
		lista =(List<Ficha_cita>) q.getResultList();
		
		return lista;
	}

	@Transactional 
	@Override
	public void eliminar(int idFC) {
		Ficha_cita fc = new Ficha_cita();
		fc = em.getReference(Ficha_cita.class, fc);
		em.remove(fc);
		
	}

	
}
