package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.ITipo_certificadoDao;
import pe.edu.upc.entity.Tipo_certificado;
import pe.edu.upc.service.ITipo_certificadoService;

@Named
@RequestScoped
public class Tipo_certificadoServiceImpl implements ITipo_certificadoService, Serializable{

	private static final long serialVersionUID = 1L;

	
	@Inject
	private ITipo_certificadoDao mD;
	
	
	@Override
	public void insertar(Tipo_certificado idtc) {
		mD.insertar(idtc);
		
	}

	@Override
	public List<Tipo_certificado> listar() {
		return mD.listar();
	}

	@Override
	public void eliminar(int idtc) {
		mD.eliminar(idtc);
	}
	
	

}