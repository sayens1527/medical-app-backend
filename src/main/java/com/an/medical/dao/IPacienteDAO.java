package com.an.medical.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.an.medical.model.Paciente;

public interface IPacienteDAO extends JpaRepository<Paciente, Integer>{

}
