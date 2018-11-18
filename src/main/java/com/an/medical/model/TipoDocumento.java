package com.an.medical.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tipo_documento")
public class TipoDocumento {
	
	@Id
	@Column(name="id_tipo_documento",length=3)
	private String idTipoDocumento;
	
	@Column(name="nombre", nullable=false, length=100)
	private String nombre;
	
	@Column(name="descripcion", nullable=true, length=256)
	private String descripcion;

	
	public String getIdTipoDocumento() {
		return idTipoDocumento;
	}

	public void setIdTipoDocumento(String idTipoDocumento) {
		this.idTipoDocumento = idTipoDocumento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	

	
}
