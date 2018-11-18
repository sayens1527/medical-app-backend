package com.an.medical.controller;

import com.an.medical.model.*;
import com.an.medical.service.IPacienteService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {
	
	@Autowired
	IPacienteService service;
	
	@GetMapping(produces= "application/json")
	public List<Paciente> obtenerTodos(){
		return service.obtenerTodos();
	}

	@PostMapping(consumes="application/json", produces="application/json")
	public Paciente registar(@RequestBody Paciente paciente) {
		return service.registrar(paciente);
	}
}
