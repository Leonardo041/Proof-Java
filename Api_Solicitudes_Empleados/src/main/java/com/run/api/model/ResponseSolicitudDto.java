package com.run.api.model;

import com.run.api.entities.Empleado;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ResponseSolicitudDto {
	private int ID_Solicitud;
	private Empleado Nombre;
	private String Codigo;
	private String Descripcion;
	private String Resumen;

}
