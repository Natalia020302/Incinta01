package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IPreguntas_GestanteDao;
import pe.edu.upc.entity.Preguntas_Gestante;

public class Preguntas_GestanteDaoImpl implements IPreguntas_GestanteDao, Serializable{

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pu")
	private EntityManager em;

	
	@Transactional
	@Override
	public void insertar(Preguntas_Gestante preguntas_Gestante) {
		// TODO Auto-generated method stub
		
	}
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Preguntas_Gestante> listar() {
		List<Preguntas_Gestante> lista = new ArrayList<Preguntas_Gestante>();
		Query q =em.createQuery("select m from Preguntas_Gestante m");
		lista =(List<Preguntas_Gestante>) q.getResultList();
		
		return lista;
	}

	@Transactional 
	@Override
	public void eliminar(int idPreguntas_Gestante, int IDGestante) {
		Preguntas_Gestante preguntas_Gestante = new Preguntas_Gestante();
		preguntas_Gestante = em.getReference(Preguntas_Gestante.class, preguntas_Gestante);
		em.remove(preguntas_Gestante);
		
	}

	
}