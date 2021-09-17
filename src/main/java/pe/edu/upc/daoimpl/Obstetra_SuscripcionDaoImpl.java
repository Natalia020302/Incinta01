package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IObstetra_SuscripcionDao;
import pe.edu.upc.entity.Obstetra_Suscripcion;

public class Obstetra_SuscripcionDaoImpl implements IObstetra_SuscripcionDao, Serializable{

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pu")
	private EntityManager em;

	
	@SuppressWarnings("unchecked")
	@Override
	public List<Obstetra_Suscripcion> listar() {
		List<Obstetra_Suscripcion> lista = new ArrayList<Obstetra_Suscripcion>();
		Query q =em.createQuery("select os from Obstetra_Suscripcion os");
		lista =(List<Obstetra_Suscripcion>) q.getResultList();
		
		return lista;
	}

	@Transactional
	@Override
	public void insertar(Obstetra_Suscripcion os) {
		// TODO Auto-generated method stub
		
	}

	@Transactional 
	@Override
	public void eliminar(int id_suscripcion, Date fechainicio, int idobstetra) {
		// TODO Auto-generated method stub
		Obstetra_Suscripcion os = new Obstetra_Suscripcion();
		os = em.getReference(Obstetra_Suscripcion.class, os);
		em.remove(os);
	}

	
}