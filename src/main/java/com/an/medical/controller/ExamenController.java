package com.an.medical.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.an.medical.dto.ExamenDTO;
import com.an.medical.service.IExamenService;

@Controller
@RequestMapping("/examenes")
public class ExamenController {
	
	@Autowired
	IExamenService service;
	
	@PostMapping(consumes="application/json", produces="application/json")
	public ResponseEntity<Object> registrarExamen(@RequestBody ExamenDTO examen){
		return new ResponseEntity(service.registrar(examen),HttpStatus.CREATED);
	}

	@GetMapping(produces="application/json")
	public ResponseEntity<Object> obtenerTdos(){
		List<ExamenDTO> list = service.obtenerTodos();
		return new ResponseEntity(list,HttpStatus.OK);
	}
	
}
