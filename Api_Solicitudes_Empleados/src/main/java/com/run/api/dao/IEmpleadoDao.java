package com.run.api.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.run.api.entities.Empleado;

public interface IEmpleadoDao extends JpaRepository<Empleado, Integer> {
	@Query(value = "SELECT* FROM empleado WHERE empleado.ID = : IDEmpleado", nativeQuery = false)
	public Optional<Empleado> obtenerEmpleado (@Param("IdEmpleado") Integer IdEmpleado);

}
