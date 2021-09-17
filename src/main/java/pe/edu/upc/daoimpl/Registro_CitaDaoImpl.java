package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IRegistro_CitaDao;
import pe.edu.upc.entity.Registro_Cita;

public class Registro_CitaDaoImpl implements IRegistro_CitaDao, Serializable{

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pu")
	private EntityManager em;

	
	@Transactional
	@Override
	public void insertar(Registro_Cita registro_Cita) {
		// TODO Auto-generated method stub
		
	}
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Registro_Cita> listar() {
		List<Registro_Cita> lista = new ArrayList<Registro_Cita>();
		Query q =em.createQuery("select m from Registro_Cita m");
		lista =(List<Registro_Cita>) q.getResultList();
		
		return lista;
	}

	@Transactional 
	@Override
	public void eliminar(int idRegistro_Cita) {
		Registro_Cita registro_Cita = new Registro_Cita();
		registro_Cita = em.getReference(Registro_Cita.class, registro_Cita);
		em.remove(registro_Cita);
		
	}

	
}