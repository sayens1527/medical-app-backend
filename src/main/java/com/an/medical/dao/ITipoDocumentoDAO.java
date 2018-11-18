package com.an.medical.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.an.medical.model.TipoDocumento;

public interface ITipoDocumentoDAO extends JpaRepository<TipoDocumento, String>{

}
