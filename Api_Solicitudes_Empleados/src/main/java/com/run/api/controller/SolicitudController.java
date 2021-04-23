package com.run.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.run.api.model.ResponseSolicitudDto;
import com.run.api.service.impl.SolicitudService;
import com.run.api.util.Constantes;

@RestController
@RequestMapping(Constantes.SOLICITUD_CONTROLLER)
public class SolicitudController {

	private final SolicitudService solicitudService;

	@Autowired
	public SolicitudController(SolicitudService solicitudService) {
		this.solicitudService = solicitudService;
	}

	@GetMapping(value = "/{IdEmpleado}")
	@ResponseStatus(code = HttpStatus.OK)
	public ResponseSolicitudDto mostrarSolicitud(@PathVariable("IdEmpleado") Integer IdEmpleado) {
		return solicitudService.mostrarSolicitud(IdEmpleado);
	}

}
