package com.an.medical.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.an.medical.model.DetalleConsulta;

public interface IDetalleConsultaDAO extends JpaRepository<DetalleConsulta, Integer>{

}
