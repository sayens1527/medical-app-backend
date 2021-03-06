package com.an.medical.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.an.medical.model.Examen;

@Repository
public interface IExamenDAO extends JpaRepository<Examen, Integer>{

}
