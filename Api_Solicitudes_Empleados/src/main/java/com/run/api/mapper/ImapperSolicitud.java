package com.run.api.mapper;

import com.run.api.entities.Solicitud;
import com.run.api.model.ResponseSolicitudDto;

public interface ImapperSolicitud {
	public ResponseSolicitudDto mostrarsolicitudes(Solicitud atributos);

}
