package com.run.api.mapper.impl;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.run.api.entities.Empleado;
import com.run.api.mapper.ImapperEmpleado;
import com.run.api.model.ResponseEmpleadoDto;

@Service
public class MapperEmpleado implements ImapperEmpleado {

	@Override
	public ResponseEmpleadoDto mostrarempleado(Empleado atributos) {
		Date fechaRegistro = new Date();
		ResponseEmpleadoDto mostrarEmpleado = new ResponseEmpleadoDto();
		mostrarEmpleado.setId_Empleado(atributos.getId());
		mostrarEmpleado.setFecha_ingreso(fechaRegistro);
		mostrarEmpleado.setNombre(atributos.getNombre());;
		mostrarEmpleado.setSalario(Integer.parseInt(atributos.getSalario()));
		return mostrarEmpleado;
	}

}
