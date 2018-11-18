package com.an.medical.service;

import java.util.List;

public interface ICRUD<T> {
	
	T registrar(T t);
	List<T> obtenerTodos();
	T obtenerPorId(Integer id);
	T actualizar(T t);
	void eliminar(Integer id);

}
