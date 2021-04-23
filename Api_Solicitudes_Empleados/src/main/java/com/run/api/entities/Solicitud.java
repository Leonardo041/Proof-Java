package com.run.api.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the solicitud database table.
 * 
 */
@Entity
@NamedQuery(name = "Solicitud.findAll", query = "SELECT s FROM Solicitud s")
public class Solicitud implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String codigo;

	private String descripcion;

	private String resumen;

	// bi-directional many-to-one association to Empleado
	@ManyToOne
	@JoinColumn(name = "ID_EMPLEADO")
	private Empleado empleado;

	public Solicitud() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getResumen() {
		return this.resumen;
	}

	public void setResumen(String resumen) {
		this.resumen = resumen;
	}

	public Empleado getEmpleado() {
		return this.empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

}