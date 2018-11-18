package com.an.medical.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.an.medical.dao.IPacienteDAO;
import com.an.medical.model.Paciente;
import com.an.medical.service.IPacienteService;


@Service
public class PacienteServiceImpl implements IPacienteService{

	@Autowired
	IPacienteDAO dao;
	
	@Override
	public Paciente registrar(Paciente t) {
		// TODO Auto-generated method stub
		return dao.save(t);
	}

	@Override
	public List<Paciente> obtenerTodos() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Paciente actualizar(Paciente t) {
		// TODO Auto-generated method stub
		return dao.save(t);
	}

	@Override
	public void eliminar(Integer id) {
		dao.delete(id);
		
	}

	@Override
	public Paciente obtenerPorId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
