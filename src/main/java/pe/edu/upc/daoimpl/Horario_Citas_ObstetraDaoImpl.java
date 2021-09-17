package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IHorario_Citas_ObstetraDao;
import pe.edu.upc.entity.Horario_Citas_Obstetra;

public class Horario_Citas_ObstetraDaoImpl implements IHorario_Citas_ObstetraDao, Serializable{

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pu")
	private EntityManager em;

	
	@Transactional
	@Override
	public void insertar(Horario_Citas_Obstetra hco) {
		// TODO Auto-generated method stub
		
	}
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Horario_Citas_Obstetra> listar() {
		List<Horario_Citas_Obstetra> lista = new ArrayList<Horario_Citas_Obstetra>();
		Query q =em.createQuery("select hco from Horario_Citas_Obstetra hco");
		lista =(List<Horario_Citas_Obstetra>) q.getResultList();
		
		return lista;
	}

	@Transactional 
	@Override
	public void eliminar(int idhco) {
		Horario_Citas_Obstetra hco = new Horario_Citas_Obstetra();
		hco = em.getReference(Horario_Citas_Obstetra.class, hco);
		em.remove(hco);
		
	}
	
}