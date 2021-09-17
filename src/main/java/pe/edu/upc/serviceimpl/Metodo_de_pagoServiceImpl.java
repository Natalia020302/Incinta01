package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IMetodo_de_pagoDao;
import pe.edu.upc.entity.Metodo_de_pago;
import pe.edu.upc.service.IMetodo_de_pagoService;

@Named
@RequestScoped
public class Metodo_de_pagoServiceImpl implements IMetodo_de_pagoService, Serializable{

	private static final long serialVersionUID = 1L;

	
	@Inject
	private IMetodo_de_pagoDao mD;
	
	
	@Override
	public void insertar(Metodo_de_pago metodo_de_pago) {
		mD.insertar(metodo_de_pago);
		
	}

	@Override
	public List<Metodo_de_pago> listar() {
		return mD.listar();
	}

	@Override
	public void eliminar(int idMetodo_de_pago) {
		mD.eliminar(idMetodo_de_pago);
	}
	
	

}