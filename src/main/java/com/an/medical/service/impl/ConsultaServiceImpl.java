package com.an.medical.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.an.medical.dao.IConsultaDAO;
import com.an.medical.dao.IConsultaExamenDAO;
import com.an.medical.dao.IDetalleConsultaDAO;
import com.an.medical.dto.ConsultaDTO;
import com.an.medical.dto.ExamenDTO;
import com.an.medical.model.Consulta;
import com.an.medical.model.ConsultaExamen;
import com.an.medical.model.ConsultaExamenPK;
import com.an.medical.model.DetalleConsulta;
import com.an.medical.model.Examen;
import com.an.medical.service.IConsultaService;
import com.an.medical.util.Mapper;


@Service
@Transactional
public class ConsultaServiceImpl implements IConsultaService {

	
	@Autowired
	IConsultaDAO consultaDAO;
	
	@Autowired
	IDetalleConsultaDAO detalleConsultaDAO;
	
	@Autowired
	IConsultaExamenDAO consultaExamenDAO;
	
	@Override
	public ConsultaDTO registrar(ConsultaDTO consulta) {
		Consulta consultaEntity = consultaDAO.save(Mapper.getConsultaEntityFromDTO(consulta));
		consulta.getDetalles(). forEach(detalle ->
			{
				DetalleConsulta detalleEntity = Mapper.getDetalleConsultaEntityFromDTO(detalle);
				detalleEntity.setConsulta(consultaEntity);
				detalleConsultaDAO.save(detalleEntity);
			}
		);
		consulta.getExamenes().forEach(examen ->
			{
				Examen examenEntity = Mapper.getEntityFromDTO(examen);
				ConsultaExamen consultaExamenEntity = new ConsultaExamen();
				consultaExamenEntity.setConsultaExamenPK(new ConsultaExamenPK());
				consultaExamenEntity.getConsultaExamenPK().setConsulta(consultaEntity);
				consultaExamenEntity.getConsultaExamenPK().setExamen(examenEntity);
				consultaExamenDAO.save(consultaExamenEntity);
			}
		);
		return Mapper.getDTOFromEntity(consultaEntity);
	}

	@Override
	public List<ConsultaDTO> obtenerTodos() {
		List<ConsultaDTO> list= new ArrayList<>();
		consultaDAO.findAll().forEach(c ->list.add(Mapper.getDTOFromEntity(c)));
		return list;
	}
	
	@Override
	public ConsultaDTO obtenerPorId(Integer id) {
		Consulta consulta = consultaDAO.findOne(id);
		List<ConsultaExamen> consultaExamenes = 
				consultaExamenDAO.getExamenesPorConsulta(consulta.getIdConsulta());
		List<ExamenDTO> examenes = new ArrayList<ExamenDTO>();
		consultaExamenes.forEach(ce -> examenes.add(Mapper.getDTOFromEntity(ce.getConsultaExamenPK().getExamen())));
		ConsultaDTO dto = Mapper.getDTOFromEntity(consulta);
		dto.setExamenes(examenes);
		return dto;
	}

	@Override
	public ConsultaDTO actualizar(ConsultaDTO t) {
		return null;
	}

	@Override
	public void eliminar(Integer id) {
		consultaDAO.delete(id);
		
	}

}
