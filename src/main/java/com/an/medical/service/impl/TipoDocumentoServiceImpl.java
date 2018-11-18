package com.an.medical.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.an.medical.dao.ITipoDocumentoDAO;
import com.an.medical.model.TipoDocumento;
import com.an.medical.service.ITipoDocumentoService;

@Service
public class TipoDocumentoServiceImpl implements ITipoDocumentoService{

	@Autowired
	ITipoDocumentoDAO dao;
	
	@Override
	public TipoDocumento registrar(TipoDocumento t) {
		// TODO Auto-generated method stub
		return dao.save(t);
	}

	@Override
	public List<TipoDocumento> obtenerTodos() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public TipoDocumento actualizar(TipoDocumento t) {
		// TODO Auto-generated method stub
		return dao.save(t);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
	}

	@Override
	public void eliminar(String id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public TipoDocumento obtenerPorId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
}
