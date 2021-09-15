package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IFichaRegistroMedicoDao;
import pe.edu.upc.entity.FichaRegistroMedico;
import pe.edu.upc.service.IFichaRegistroMedicoService;

@Named
@RequestScoped
public class FichaRegistroMedicoServiceImpl implements IFichaRegistroMedicoService, Serializable{

	private static final long serialVersionUID = 1L;

	
	@Inject
	private IFichaRegistroMedicoDao mD;
	
	
	@Override
	public void insertar(FichaRegistroMedico frm) {
		mD.insertar(frm);
		
	}

	@Override
	public List<FichaRegistroMedico> listar() {
		return mD.listar();
	}

	@Override
	public void eliminar(int idFicha) {
		mD.eliminar(idFicha);
	}
	
	

}
