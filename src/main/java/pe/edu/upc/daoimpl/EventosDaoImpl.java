package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IEventosDao;
import pe.edu.upc.entity.Eventos;

public class EventosDaoImpl implements IEventosDao, Serializable{

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pu")
	private EntityManager em;

	
	@Transactional
	@Override
	public void insertar(Eventos eventos) {
		em.persist(eventos);
	}
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Eventos> listar() {
		List<Eventos> lista = new ArrayList<Eventos>();
		Query q =em.createQuery("select eventos from Eventos eventos");
		lista =(List<Eventos>) q.getResultList();
		return lista;
	}

	@Transactional 
	@Override
	public void eliminar(int idEventos) {
		Eventos eventos = new Eventos();
		eventos = em.getReference(Eventos.class, idEventos);
		em.remove(eventos);
		
	}

	
}