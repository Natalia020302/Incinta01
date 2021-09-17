package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IComentariosDao;
import pe.edu.upc.entity.Comentarios;

public class ComentariosDaoImpl implements IComentariosDao, Serializable{

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pu")
	private EntityManager em;

	
	@Transactional
	@Override
	public void insertar(Comentarios comentarios) {
		// TODO Auto-generated method stub
		
	}
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Comentarios> listar() {
		List<Comentarios> lista = new ArrayList<Comentarios>();
		Query q =em.createQuery("select m from Comentarios m");
		lista =(List<Comentarios>) q.getResultList();
		
		return lista;
	}

	@Transactional 
	@Override
	public void eliminar(int idComentarios) {
		Comentarios comentarios = new Comentarios();
		comentarios = em.getReference(Comentarios.class, comentarios);
		em.remove(comentarios);
		
	}

	
}