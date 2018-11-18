package com.an.medical.model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

@Entity
@Table(name="consulta")
public class Consulta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idConsulta;
	
	@ManyToOne
	@JoinColumn(name="id_medico", nullable=false)
	private Medico medico;
	
	@ManyToOne
	@JoinColumn(name="id_especialidad", nullable=false)
	private Especialidad especialidad;
	
	@ManyToOne
	@JoinColumn(name="id_paciente", nullable=false)
	private Paciente paciente;
	
	@JsonSerialize(using = ToStringSerializer.class)
	@Column(name="fecha", nullable=true)
	private LocalDateTime fecha;
	
	@OneToMany(mappedBy="consulta", cascade = {CascadeType.PERSIST,CascadeType.REMOVE,CascadeType.MERGE}, fetch=FetchType.LAZY, orphanRemoval=true)
	private List<DetalleConsulta> detalles;

	public Integer getIdConsulta() {
		return idConsulta;
	}

	public void setIdConsulta(Integer idConsulta) {
		this.idConsulta = idConsulta;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public Especialidad getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public List<DetalleConsulta> getDetalles() {
		return detalles;
	}

	public void setDetalles(List<DetalleConsulta> detalles) {
		this.detalles = detalles;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idConsulta == null) ? 0 : idConsulta.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Consulta other = (Consulta) obj;
		if (idConsulta == null) {
			if (other.idConsulta != null)
				return false;
		} else if (!idConsulta.equals(other.idConsulta))
			return false;
		return true;
	}
	
	
	
	
}
