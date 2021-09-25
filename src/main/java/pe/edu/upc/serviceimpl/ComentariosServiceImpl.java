package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IComentariosDao;
import pe.edu.upc.entity.Comentarios;
import pe.edu.upc.service.IComentariosService;

@Named
@RequestScoped
public class ComentariosServiceImpl implements IComentariosService, Serializable{

	private static final long serialVersionUID = 1L;

	
	@Inject
	private IComentariosDao mD;
	
	
	@Override
	public void insertar(Comentarios comentarios) {
		mD.insertar(comentarios);
		
	}

	@Override
	public List<Comentarios> listar() {
		return mD.listar();
	}

	@Override
	public void eliminar(int idComentario) {
		mD.eliminar(idComentario);
	}
	
	

}