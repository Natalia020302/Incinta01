package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.ICertificadosDeObstetraDao;
import pe.edu.upc.entity.CertificadosDeObstetra;
import pe.edu.upc.service.ICertificadosDeObstetraService;

@Named
@RequestScoped
public class CertificadosDeObstetraServiceImpl implements ICertificadosDeObstetraService, Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private ICertificadosDeObstetraDao mD;

	@Override
	public void insertar(CertificadosDeObstetra cdo) {
		mD.insertar(cdo);

	}

	@Override
	public List<CertificadosDeObstetra> listar() {
		return mD.listar();
	}

	@Override
	public void eliminar(int idcdo) {
		mD.eliminar(idcdo);
	}

}