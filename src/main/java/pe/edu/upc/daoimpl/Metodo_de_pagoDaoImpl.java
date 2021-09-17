package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IMetodo_de_pagoDao;
import pe.edu.upc.entity.Metodo_de_pago;

public class Metodo_de_pagoDaoImpl implements IMetodo_de_pagoDao, Serializable{

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pu")
	private EntityManager em;

	
	@Transactional
	@Override
	public void insertar(Metodo_de_pago metodo_de_pago) {
		// TODO Auto-generated method stub
		
	}
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Metodo_de_pago> listar() {
		List<Metodo_de_pago> lista = new ArrayList<Metodo_de_pago>();
		Query q =em.createQuery("select p from Metodo_de_pago p");
		lista =(List<Metodo_de_pago>) q.getResultList();
		
		return lista;
	}

	@Transactional 
	@Override
	public void eliminar(int idMetodo_de_pago) {
		Metodo_de_pago metodo_de_pago = new Metodo_de_pago();
		metodo_de_pago = em.getReference(Metodo_de_pago.class, metodo_de_pago);
		em.remove(metodo_de_pago);
		
	}

	
}