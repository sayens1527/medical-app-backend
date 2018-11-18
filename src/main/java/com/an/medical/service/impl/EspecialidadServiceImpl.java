package com.an.medical.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.an.medical.dao.IEspecialidadDAO;
import com.an.medical.model.Especialidad;
import com.an.medical.service.IEspecialidadService;


@Service
public class EspecialidadServiceImpl implements IEspecialidadService{

	
	@Autowired
	IEspecialidadDAO dao;
	
	@Override
	public Especialidad registrar(Especialidad t) {
		// TODO Auto-generated method stub
		return dao.save(t);
	}

	@Override
	public List<Especialidad> obtenerTodos() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Especialidad obtenerPorId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Especialidad actualizar(Especialidad t) {
		// TODO Auto-generated method stub
		return dao.save(t);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

}
