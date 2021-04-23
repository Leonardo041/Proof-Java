package com.run.api.mapper.impl;

import org.springframework.stereotype.Service;

import com.run.api.entities.Solicitud;
import com.run.api.mapper.ImapperSolicitud;
import com.run.api.model.ResponseSolicitudDto;

@Service
public class MapperSolicitud implements ImapperSolicitud{

	@Override
	public ResponseSolicitudDto mostrarsolicitudes(Solicitud atributos) {
		ResponseSolicitudDto mostrarSolicitud = new ResponseSolicitudDto();
		mostrarSolicitud.setID_Solicitud(atributos.getId());
		mostrarSolicitud.setCodigo(atributos.getDescripcion());
		mostrarSolicitud.setResumen(atributos.getResumen());
		mostrarSolicitud.setNombre(atributos.getEmpleado());
		return mostrarSolicitud;
	}

}
