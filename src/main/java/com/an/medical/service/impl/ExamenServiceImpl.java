package com.an.medical.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.an.medical.dao.IExamenDAO;
import com.an.medical.dto.ExamenDTO;
import com.an.medical.model.Examen;
import com.an.medical.service.IExamenService;
import com.an.medical.util.Mapper;

@Service
public class ExamenServiceImpl implements IExamenService {

	@Autowired
	IExamenDAO dao;
	
	@Override
	public ExamenDTO registrar(ExamenDTO t) {
		// TODO Auto-generated method stub
		Examen examen = dao.save(Mapper.getEntityFromDTO(t));
		return Mapper.getDTOFromEntity(examen);
	}

	@Override
	public List<ExamenDTO> obtenerTodos() {
		// TODO Auto-generated method stub
		List<ExamenDTO> examenes= new ArrayList<ExamenDTO>();
		dao.findAll().forEach(e -> examenes.add(Mapper.getDTOFromEntity(e)));
		return examenes;
	}

	@Override
	public ExamenDTO obtenerPorId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ExamenDTO actualizar(ExamenDTO t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
