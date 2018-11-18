package com.an.medical.dto;

import java.time.LocalDateTime;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

public class MedicoDTO {

	private Integer idMedico;
	private String nombres;
	private String apellidos;
	@JsonSerialize(using = ToStringSerializer.class)
	private LocalDateTime fechaNacimiento;
	private String CMP;
	private String direccion;
	private String telefono;
	private String email;
	
	public Integer getIdMedico() {
		return idMedico;
	}
	public void setIdMedico(Integer idMedico) {
		this.idMedico = idMedico;
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
	public String getCMP() {
		return CMP;
	}
	public void setCMP(String cMP) {
		CMP = cMP;
	}
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

	
}
