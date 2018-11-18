package com.an.medical.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.an.medical.dto.ConsultaDTO;
import com.an.medical.service.IConsultaService;

@RestController
@RequestMapping("/consultas")
public class ConsultaController {
	
	@Autowired
	IConsultaService consultaService;
	
	@GetMapping(produces="application/json")
	public ResponseEntity<Object> obtenerTodas(){
		List<ConsultaDTO> list= consultaService.obtenerTodos();
		return new ResponseEntity<Object>(list,HttpStatus.OK);
	}

	@GetMapping(value="/{idConsulta}",produces="application/json")
	public ResponseEntity<Object> obtenerPorId(@PathVariable("idConsulta") Integer idConsulta){
		ConsultaDTO consulta= consultaService.obtenerPorId(idConsulta);
		return new ResponseEntity<Object>(consulta,HttpStatus.OK);
	}

	
	@PostMapping(consumes="application/json", produces="application/json")
	public ResponseEntity<Object> registrarConsulta(@RequestBody ConsultaDTO consulta){
		consulta = consultaService.registrar(consulta);
		return new ResponseEntity(consultaService.obtenerPorId(consulta.getIdCosulta()),HttpStatus.CREATED);
	}
	
	@DeleteMapping(value="/{idConsulta}")
	public ResponseEntity<Object> eliminarConsulta(@PathVariable("idConsulta") Integer idConsulta){
		consultaService.eliminar(idConsulta);
		return ResponseEntity.noContent().build();
	}
	

}
