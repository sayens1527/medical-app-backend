package com.an.medical.dto;

import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

public class ConsultaDTO {
	
	private Integer idCosulta;
	private PacienteDTO paciente;
	private MedicoDTO medico;
	private EspecialidadDTO especialidad;
	@JsonSerialize(using = ToStringSerializer.class)
	private LocalDateTime fecha;
	private List<ExamenDTO> examenes;
	private List<DetalleConsultaDTO> detalles;
	
	public Integer getIdCosulta() {
		return idCosulta;
	}
	public void setIdCosulta(Integer idCosulta) {
		this.idCosulta = idCosulta;
	}
	public PacienteDTO getPaciente() {
		return paciente;
	}
	public void setPaciente(PacienteDTO paciente) {
		this.paciente = paciente;
	}
	public MedicoDTO getMedico() {
		return medico;
	}
	public void setMedico(MedicoDTO medico) {
		this.medico = medico;
	}
	public EspecialidadDTO getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(EspecialidadDTO especialidad) {
		this.especialidad = especialidad;
	}
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	public List<ExamenDTO> getExamenes() {
		return examenes;
	}
	public void setExamenes(List<ExamenDTO> examenes) {
		this.examenes = examenes;
	}
	public List<DetalleConsultaDTO> getDetalles() {
		return detalles;
	}
	public void setDetalles(List<DetalleConsultaDTO> detalles) {
		this.detalles = detalles;
	}
	
	
	
}
