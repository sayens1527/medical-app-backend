package com.an.medical.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.an.medical.dao.IMedicoDAO;
import com.an.medical.model.Medico;
import com.an.medical.service.IMedicoService;


@Service
public class MedicoServiceImpl implements IMedicoService{

	@Autowired
	IMedicoDAO dao;
	
	@Override
	public Medico registrar(Medico t) {
		// TODO Auto-generated method stub
		return dao.save(t);
	}

	@Override
	public List<Medico> obtenerTodos() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Medico actualizar(Medico t) {
		// TODO Auto-generated method stub
		return dao.save(t);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Medico obtenerPorId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
