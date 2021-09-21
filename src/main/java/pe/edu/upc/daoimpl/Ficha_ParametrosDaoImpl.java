package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IFicha_ParametrosDao;
import pe.edu.upc.entity.Ficha_Parametros;

public class Ficha_ParametrosDaoImpl implements IFicha_ParametrosDao, Serializable{

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pu")
	private EntityManager em;

	
	@Transactional
	@Override
	public void insertar(Ficha_Parametros ficha_Parametros) {
		// TODO Auto-generated method stub
		
	}
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Ficha_Parametros> listar() {
		List<Ficha_Parametros> lista = new ArrayList<Ficha_Parametros>();
		Query q =em.createQuery("select m from Ficha_Parametros m");
		lista =(List<Ficha_Parametros>) q.getResultList();
		
		return lista;
	}

	@Transactional 
	@Override
	public void eliminar(int idFicha_Parametros, int ID_RegistroCita) {
		Ficha_Parametros ficha_Parametros = new Ficha_Parametros();
		ficha_Parametros = em.getReference(Ficha_Parametros.class, ficha_Parametros);
		em.remove(ficha_Parametros);
		
	}

	
}