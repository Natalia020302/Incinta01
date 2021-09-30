package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IHorarioCitasObstetrasDao;
import pe.edu.upc.entity.HorarioCitasObstetras;

public class HorarioCitasObstetrasDaoImpl implements IHorarioCitasObstetrasDao, Serializable{

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pu")
	private EntityManager em;

	
	@Transactional
	@Override
	public void insertar(HorarioCitasObstetras hco) {
		// TODO Auto-generated method stub
		em.persist(hco);
	}
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<HorarioCitasObstetras> listar() {
		List<HorarioCitasObstetras> lista = new ArrayList<HorarioCitasObstetras>();
		Query q =em.createQuery("select obs from HorarioCitasObstetras obs");
		lista =(List<HorarioCitasObstetras>) q.getResultList();
		
		return lista;
	}

	@Transactional 
	@Override
	public void eliminar(int idHorarioCitasObstetras) {
		HorarioCitasObstetras hco = new HorarioCitasObstetras();
		hco = em.getReference(HorarioCitasObstetras.class, idHorarioCitasObstetras);
		em.remove(hco);
		
	}

	
}