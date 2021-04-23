package com.run.api.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.run.api.dao.IEmpleadoDao;
import com.run.api.entities.Empleado;
import com.run.api.mapper.impl.MapperEmpleado;
import com.run.api.model.ResponseEmpleadoDto;
import com.run.api.service.IEmpleadoService;

@Service
public class EmpleadoService implements IEmpleadoService {

	private final IEmpleadoDao empleadoDao;
	private final MapperEmpleado mapperEmpleado = new MapperEmpleado();

	@Autowired
	public EmpleadoService(IEmpleadoDao empleadoDao) {
		this.empleadoDao = empleadoDao;
	}

	@Override
	public ResponseEmpleadoDto mostrarEmpleado(Integer IdEmpleado) {
		ResponseEmpleadoDto responseEmpleado = new ResponseEmpleadoDto();
		Optional<Empleado> empleado = empleadoDao.obtenerEmpleado(IdEmpleado);
		responseEmpleado = mapperEmpleado.mostrarempleado(empleado.get());
		return responseEmpleado;
	}

}
