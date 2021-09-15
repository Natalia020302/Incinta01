package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IFichaRegistroMedicoDao;
import pe.edu.upc.entity.FichaRegistroMedico;

public class FichaRegistroMedicoDaoImpl implements IFichaRegistroMedicoDao, Serializable{

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pu")
	private EntityManager em;

	
	@Transactional
	@Override
	public void insertar(FichaRegistroMedico ficharegistromedico) {
		// TODO Auto-generated method stub
		
	}
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<FichaRegistroMedico> listar() {
		List<FichaRegistroMedico> lista = new ArrayList<FichaRegistroMedico>();
		Query q =em.createQuery("select frm from FichaRegistroMedico frm");
		lista =(List<FichaRegistroMedico>) q.getResultList();
		
		return lista;
	}

	@Transactional 
	@Override
	public void eliminar(int idFicha) {
		FichaRegistroMedico ficharegistromedico = new FichaRegistroMedico();
		ficharegistromedico = em.getReference(FichaRegistroMedico.class, ficharegistromedico);
		em.remove(ficharegistromedico);
		
	}

	
}
