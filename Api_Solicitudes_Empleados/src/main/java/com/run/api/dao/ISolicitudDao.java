package com.run.api.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.run.api.entities.Solicitud;

public interface ISolicitudDao extends JpaRepository<Solicitud, Integer> {
	@Query(value = "SELECT * FROM empleado INNER JOIN solicitud on empleado.ID = solicitud.:IdEmpleado;", nativeQuery = false)
	public Optional<Solicitud> obtenerSolicitud(@Param("IdEmpleado") Integer IdEmpleado);

}
