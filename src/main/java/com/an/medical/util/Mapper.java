package com.an.medical.util;

import java.util.ArrayList;

import com.an.medical.dto.ConsultaDTO;
import com.an.medical.dto.DetalleConsultaDTO;
import com.an.medical.dto.EspecialidadDTO;
import com.an.medical.dto.ExamenDTO;
import com.an.medical.dto.MedicoDTO;
import com.an.medical.dto.PacienteDTO;
import com.an.medical.dto.TipoDocumentoDTO;
import com.an.medical.model.Consulta;
import com.an.medical.model.ConsultaExamen;
import com.an.medical.model.DetalleConsulta;
import com.an.medical.model.Especialidad;
import com.an.medical.model.Examen;
import com.an.medical.model.Medico;
import com.an.medical.model.Paciente;
import com.an.medical.model.TipoDocumento;


public class Mapper {
	
	public static Consulta getConsultaEntityFromDTO(ConsultaDTO dto) {
		Consulta c = new Consulta();
		c.setEspecialidad(getEspecialidadEntityFromDTO(dto.getEspecialidad()));
		c.setPaciente(getEntityFromDTO(dto.getPaciente()));
		c.setMedico(getMedicoEntityFromDTO(dto.getMedico()));
		c.setFecha(dto.getFecha());
		return c;
	}
	
	public static Especialidad getEspecialidadEntityFromDTO(EspecialidadDTO dto) {
		Especialidad e = new Especialidad();
		e.setIdEspecialidad(dto.getIdEspecialidad());
		return e;
	}
	
	public static Paciente getEntityFromDTO(PacienteDTO dto) {
		Paciente p = new Paciente();
		p.setIdPaciente(dto.getIdPaciente());
		p.setNombres(dto.getNombres());
		p.setApellidos(dto.getApellidos());
		p.setFechaNacimiento(dto.getFechaNacimiento());
		p.setNumeroDocumento(dto.getNumeroDocumento());
		p.setTipoDocumento( getEntityFromDTO(dto.getTipoDocumento()));
		p.setDireccion(dto.getDireccion());
		p.setEmail(dto.getEmail());
		p.setTelefono(dto.getTelefono());
		return p;
		
	}
	
	public static Medico getMedicoEntityFromDTO(MedicoDTO dto) {
		Medico m = new Medico();
		m.setIdMedico(dto.getIdMedico());
		return m;
		
	}
	
	
	public static DetalleConsulta getDetalleConsultaEntityFromDTO(DetalleConsultaDTO dto) {
		DetalleConsulta dc = new DetalleConsulta();
		dc.setDiagnostico(dto.getDiagnostico());
		dc.setTratamiento(dto.getTratamiento());
		return dc;
		
	}
	
	
	/*public static ConsultaExamen getConsultaExamenEntityFromDTO(ExamenDTO dto) {
		ConsultaExamen ce = new ConsultaExamen();
		ce.setExamen(examen);
		return ce;
		
	}*/
	
	public static Examen getEntityFromDTO(ExamenDTO dto) {
		Examen entity = new Examen();
		entity.setIdExamen(dto.getIdExamen());
		entity.setNombre(dto.getNombre());
		entity.setDescripcion(dto.getDescripcion());
		return entity;
		
	}
	
	
	public static TipoDocumento getEntityFromDTO(TipoDocumentoDTO dto) {
		TipoDocumento entity = new TipoDocumento();
		entity.setIdTipoDocumento(dto.getIdTipoDocumento());
		entity.setNombre(dto.getNombre());
		entity.setDescripcion(dto.getDescripcion());
		return entity;
		
	}
	
	public static ConsultaDTO getDTOFromEntity(Consulta entity) {
		ConsultaDTO dto = new ConsultaDTO();
		dto.setIdCosulta(entity.getIdConsulta());
		dto.setFecha(entity.getFecha());
		dto.setPaciente(getDTOFromEntity(entity.getPaciente()));
		dto.setMedico(getDTOFromEntity(entity.getMedico()));
		dto.setEspecialidad(getDTOFromEntity(entity.getEspecialidad()));
		if(entity.getDetalles() != null) {
			dto.setDetalles(new ArrayList<DetalleConsultaDTO>());
			entity.getDetalles().forEach(d -> dto.getDetalles().add(getDTOFromEntity(d)));			
		}
		return dto;
	}

	public static PacienteDTO getDTOFromEntity(Paciente entity) {
		PacienteDTO dto = new PacienteDTO();
		dto.setApellidos(entity.getApellidos());
		dto.setDireccion(entity.getDireccion());
		dto.setEmail(entity.getEmail());
		dto.setFechaNacimiento(entity.getFechaNacimiento());
		dto.setIdPaciente(entity.getIdPaciente());
		dto.setNombres(entity.getNombres());
		dto.setNumeroDocumento(entity.getNumeroDocumento());
		dto.setTelefono(entity.getTelefono());
		return dto;
	}
	
	public static MedicoDTO getDTOFromEntity(Medico entity) {
		MedicoDTO dto = new MedicoDTO();
		dto.setApellidos(entity.getApellidos());
		dto.setDireccion(entity.getDireccion());
		dto.setEmail(entity.getEmail());
		dto.setFechaNacimiento(entity.getFechaNacimiento());
		dto.setIdMedico(entity.getIdMedico());
		dto.setNombres(entity.getNombres());
		dto.setCMP(entity.getCMP());
		dto.setTelefono(entity.getTelefono());
		return dto;
	}
	
	public static EspecialidadDTO getDTOFromEntity(Especialidad entity) {
		EspecialidadDTO dto = new EspecialidadDTO();
		dto.setIdEspecialidad(entity.getIdEspecialidad());
		dto.setDescripcion(entity.getDescripcion());
		dto.setNombre(entity.getNombre());
		return dto;
	}
	
	public static DetalleConsultaDTO getDTOFromEntity(DetalleConsulta entity) {
		DetalleConsultaDTO dto = new DetalleConsultaDTO();
		dto.setDiagnostico(entity.getDiagnostico());
		dto.setTratamiento(entity.getTratamiento());
		dto.setIdDetalle(entity.getIdDetalle());
		return dto;
	}
	
	public static ExamenDTO getDTOFromEntity(Examen entity) {
		ExamenDTO dto = new ExamenDTO();
		dto.setIdExamen(entity.getIdExamen());
		dto.setNombre(entity.getNombre());
		dto.setDescripcion(entity.getDescripcion());
		return dto;
	}
	
}
