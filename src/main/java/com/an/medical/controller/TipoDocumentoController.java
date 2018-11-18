package com.an.medical.controller;

import com.an.medical.model.TipoDocumento;
import com.an.medical.service.ITipoDocumentoService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tipoDocumentos")
public class TipoDocumentoController {
	
	@Autowired
	ITipoDocumentoService service;
	
	@GetMapping(produces= "application/json")
	public List<TipoDocumento> obtenerTodos(){
		return service.obtenerTodos();
	}

	@PostMapping(consumes="application/json", produces="application/json")
	public TipoDocumento registar(@RequestBody TipoDocumento tipoDocumento) {
		return service.registrar(tipoDocumento);
	}
}
