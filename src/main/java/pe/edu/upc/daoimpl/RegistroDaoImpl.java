package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IRegistroDao;
import pe.edu.upc.entity.Registro;

public class RegistroDaoImpl implements IRegistroDao, Serializable{

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pu")
	private EntityManager em;

	
	@Transactional
	@Override
	public void insertar(Registro registro) {
		// TODO Auto-generated method stub
		em.persist(registro);
	}
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Registro> listar() {
		List<Registro> lista = new ArrayList<Registro>();
		Query q =em.createQuery("select registro from Registro registro");
		lista =(List<Registro>) q.getResultList();
		
		return lista;
	}

	@Transactional 
	@Override
	public void eliminar(int idRegistro) {
		Registro registro = new Registro();
		registro = em.getReference(Registro.class, registro);
		em.remove(registro);
		
	}

	
}