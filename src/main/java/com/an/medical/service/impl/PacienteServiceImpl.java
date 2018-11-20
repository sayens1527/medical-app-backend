package com.an.medical.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.an.medical.dao.IPacienteDAO;
import com.an.medical.dto.PacienteDTO;
import com.an.medical.model.Paciente;
import com.an.medical.service.IPacienteService;
import com.an.medical.util.Mapper;


@Service
public class PacienteServiceImpl implements IPacienteService{

	@Autowired
	IPacienteDAO dao;
	
	@Override
	public PacienteDTO registrar(PacienteDTO t) {
		Paciente paciente= Mapper.getEntityFromDTO(t);
		return Mapper.getDTOFromEntity(dao.save(paciente));
	}

	@Override
	public List<PacienteDTO> obtenerTodos() {
		List<PacienteDTO> pacientes = new ArrayList<PacienteDTO>();
		dao.findAll().forEach(data -> {
			pacientes.add(Mapper.getDTOFromEntity(data));
		});
		return pacientes;
	}

	@Override
	public PacienteDTO actualizar(PacienteDTO t) {
		Paciente paciente= Mapper.getEntityFromDTO(t);
		return Mapper.getDTOFromEntity(dao.save(paciente));
	}

	@Override
	public void eliminar(Integer id) {
		dao.delete(id);
		
	}

	@Override
	public PacienteDTO obtenerPorId(Integer id) {
		return Mapper.getDTOFromEntity(dao.findOne(id));
	}

}
