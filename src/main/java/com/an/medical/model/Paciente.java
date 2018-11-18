package com.an.medical.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

@Entity
@Table(name= "paciente")
public class Paciente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idPaciente;
	
	@Column(name="nombres", nullable=false, length=256)
	private String nombres;
	
	@Column(name="apellidos", nullable=false, length=256)
	private String apellidos;
	
	@JsonSerialize(using = ToStringSerializer.class)
	@Column(name="fecha_nacimiento", nullable=true)
	private LocalDateTime fechaNacimiento;
	
	@Column(name="numero_documento", nullable=false, length=20)
	private String numeroDocumento;
	
	@ManyToOne()
	@JoinColumn(name="tipo_documento", nullable=false)
	private TipoDocumento tipoDocumento;
	//@Column(name="tipo_documento", nullable=false, length=3)
	//private String tipoDocumento;
	
	@Column(name="direccion", nullable=true, length=100)
	private String direccion;
	
	@Column(name="telefono", nullable=true, length=100)
	private String telefono;
	
	@Column(name="email", nullable=true, length=100)
	private String email;

	public Integer getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(Integer idPaciente) {
		this.idPaciente = idPaciente;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public LocalDateTime getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	/*public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}*/

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public TipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	
	
	
}
