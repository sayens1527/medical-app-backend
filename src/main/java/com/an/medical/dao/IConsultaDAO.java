package com.an.medical.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.an.medical.model.Consulta;

public interface IConsultaDAO extends JpaRepository<Consulta, Integer>{

}
