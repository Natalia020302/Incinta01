package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IHorarioDao;
import pe.edu.upc.entity.Horario;

public class HorarioDaoImpl implements IHorarioDao, Serializable{

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pu")
	private EntityManager em;

	
	@Transactional
	@Override
	public void insertar(Horario horario) {
		// TODO Auto-generated method stub
		
	}
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Horario> listar() {
		List<Horario> lista = new ArrayList<Horario>();
		Query q =em.createQuery("select h from Horario h");
		lista =(List<Horario>) q.getResultList();
		
		return lista;
	}

	@Transactional 
	@Override
	public void eliminar(int idHorario) {
		Horario horario = new Horario();
		horario = em.getReference(Horario.class, horario);
		em.remove(horario);
		
	}

	
}
