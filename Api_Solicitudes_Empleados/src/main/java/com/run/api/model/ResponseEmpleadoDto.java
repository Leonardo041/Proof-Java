package com.run.api.model;

import java.util.Date;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ResponseEmpleadoDto {
	private int Id_Empleado;
	private Date Fecha_ingreso;
	private String Nombre;
	private int Salario;

}
