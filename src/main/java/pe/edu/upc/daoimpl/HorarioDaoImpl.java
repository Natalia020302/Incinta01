package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IUsuarioDao;
import pe.edu.upc.entity.Usuario;

public class HorarioDaoImpl implements IUsuarioDao, Serializable{

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pu")
	private EntityManager em;

	
	@Transactional
	@Override
	public void insertar(Usuario usuario) {
		// TODO Auto-generated method stub
		
	}
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Usuario> listar() {
		List<Usuario> lista = new ArrayList<Usuario>();
		Query q =em.createQuery("select m from Usuario m");
		lista =(List<Usuario>) q.getResultList();
		
		return lista;
	}

	@Transactional 
	@Override
	public void eliminar(int idUsuario) {
		Usuario usuario = new Usuario();
		usuario = em.getReference(Usuario.class, usuario);
		em.remove(usuario);
		
	}

	
}