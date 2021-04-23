package com.run.api.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.run.api.dao.ISolicitudDao;
import com.run.api.entities.Solicitud;
import com.run.api.mapper.impl.MapperSolicitud;
import com.run.api.model.ResponseSolicitudDto;
import com.run.api.service.ISolicitudService;

@Service
public class SolicitudService implements ISolicitudService{
	
	private final ISolicitudDao solicitudDao;
	private final MapperSolicitud mapperSolicitud = new MapperSolicitud();
	
	@Autowired
	public SolicitudService (ISolicitudDao solicitudDao) {
		this.solicitudDao = solicitudDao;
	}

	@Override
	public ResponseSolicitudDto mostrarSolicitud(Integer IdEmpleado) {
		ResponseSolicitudDto mostrarSolicitud = new ResponseSolicitudDto ();
		Optional<Solicitud> solicitud = solicitudDao.obtenerSolicitud(IdEmpleado);
		mostrarSolicitud = mapperSolicitud.mostrarsolicitudes(solicitud.get());
		return null;
	}

}
