package com.an.medical.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.an.medical.model.Especialidad;
import com.an.medical.service.IEspecialidadService;

@RestController
@RequestMapping("/especialidades")
public class EspecialidadController {
	
	@Autowired
	IEspecialidadService service;
	
	@GetMapping(produces="application/json")
	public List<Especialidad> obtenerTodas(){
		return service.obtenerTodos();
	}
	
	@PostMapping(consumes="application/json", produces="application/json")
	public Especialidad registrar(@RequestBody Especialidad especialidad) {
		return service.registrar(especialidad);
	}

	
}
