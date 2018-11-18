package com.an.medical.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.an.medical.model.ConsultaExamen;
import com.an.medical.model.ConsultaExamenPK;

public interface IConsultaExamenDAO extends JpaRepository<ConsultaExamen, ConsultaExamenPK>{
	
	@Query("select ce from ConsultaExamen ce where ce.consultaExamenPK.consulta.idConsulta = ?1")
	public List<ConsultaExamen> getExamenesPorConsulta(Integer idConsulta);

}
