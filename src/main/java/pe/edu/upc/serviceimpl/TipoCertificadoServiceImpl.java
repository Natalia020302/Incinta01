package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.ITipoCertificadoDao;
import pe.edu.upc.entity.TipoCertificado;
import pe.edu.upc.service.ITipoCertificadoService;

@Named
@RequestScoped
public class TipoCertificadoServiceImpl implements ITipoCertificadoService, Serializable{

	private static final long serialVersionUID = 1L;

	
	@Inject
	private ITipoCertificadoDao mD;
	
	
	@Override
	public void insertar(TipoCertificado tc) {
		mD.insertar(tc);
		
	}

	@Override
	public List<TipoCertificado> listar() {
		return mD.listar();
	}

	@Override
	public void eliminar(int idtc) {
		mD.eliminar(idtc);
	}
	
	

}