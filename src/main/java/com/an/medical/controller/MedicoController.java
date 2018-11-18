package com.an.medical.controller;

import com.an.medical.model.Medico;
import com.an.medical.service.IMedicoService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medicos")
public class MedicoController {
	
	@Autowired
	IMedicoService service;
	
	@GetMapping(produces= "application/json")
	public List<Medico> obtenerTodos(){
		return service.obtenerTodos();
	}

	@PostMapping(consumes="application/json", produces="application/json")
	public Medico registar(@RequestBody Medico medico) {
		return service.registrar(medico);
	}
}
