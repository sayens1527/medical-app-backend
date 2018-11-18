package com.an.medical.service;


import com.an.medical.model.TipoDocumento;

public interface ITipoDocumentoService extends ICRUD<TipoDocumento>{

	void eliminar(String id);

}
