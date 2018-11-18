package com.an.medical.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
//@IdClass(ConsultaExamenPK.class)
@Table(name="consulta_examen")
public class ConsultaExamen {
	
	//@Id
	//private Consulta consulta;
	
	//@Id
	//private Examen examen;

	@EmbeddedId
	ConsultaExamenPK consultaExamenPK;

	public ConsultaExamenPK getConsultaExamenPK() {
		return consultaExamenPK;
	}

	public void setConsultaExamenPK(ConsultaExamenPK consultaExamenPK) {
		this.consultaExamenPK = consultaExamenPK;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((consultaExamenPK == null) ? 0 : consultaExamenPK.hashCode());
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
		ConsultaExamen other = (ConsultaExamen) obj;
		if (consultaExamenPK == null) {
			if (other.consultaExamenPK != null)
				return false;
		} else if (!consultaExamenPK.equals(other.consultaExamenPK))
			return false;
		return true;
	}
	
	//public Consulta getConsulta() {
		//return consulta;
	//}

	//public Examen getExamen() {
		//return examen;
	//}

	/*public void setConsulta(Consulta consulta) {
		this.consulta = consulta;
	}

	public void setExamen(Examen examen) {
		this.examen = examen;
	}*/

	
	
}
