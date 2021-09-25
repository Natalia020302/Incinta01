package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.ITipoIdentificacionDao;
import pe.edu.upc.entity.TipoIdentificacion;
import pe.edu.upc.service.ITipoIdentificacionService;

@Named
@RequestScoped
public class TipoIdentificacionServiceImpl implements ITipoIdentificacionService, Serializable{

	private static final long serialVersionUID = 1L;

	
	@Inject
	private ITipoIdentificacionDao mD;
	
	
	@Override
	public void insertar(TipoIdentificacion tipoIdentificacion) {
		mD.insertar(tipoIdentificacion);
		
	}

	@Override
	public List<TipoIdentificacion> listar() {
		return mD.listar();
	}

	@Override
	public void eliminar(int idTipoIdentificacion) {
		mD.eliminar(idTipoIdentificacion);
	}
	
}