package com.an.medical.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.an.medical.model.Medico;

public interface IMedicoDAO extends JpaRepository<Medico, Integer>{

}
