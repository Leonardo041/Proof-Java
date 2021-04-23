package com.run.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.run.api.model.ResponseEmpleadoDto;
import com.run.api.service.impl.EmpleadoService;
import com.run.api.util.Constantes;

@RestController
@RequestMapping(Constantes.EMPLEADO_CONTROLLER)
public class EmpleadoController {
	
	private final EmpleadoService empleadoService;

	@Autowired
	public EmpleadoController(EmpleadoService empleadoService) {
		this.empleadoService = empleadoService;
	}

	@GetMapping(value = "/{IdEmpleado}")
	@ResponseStatus(code = HttpStatus.OK)
	public ResponseEmpleadoDto mostrarEmpleado(@PathVariable("IdEmpleado") Integer IdEmpleado) {
		return empleadoService.mostrarEmpleado(IdEmpleado);
	}

}
