package com.run.api.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * The persistent class for the empleado database table.
 * 
 */
@Entity
@NamedQuery(name = "Empleado.findAll", query = "SELECT e FROM Empleado e")
public class Empleado implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Temporal(TemporalType.DATE)
	@Column(name = "FECHA_INGRESO")
	private Date fechaIngreso;

	private String nombre;

	private String salario;

	// bi-directional many-to-one association to Solicitud
	@OneToMany(mappedBy = "empleado")
	private List<Solicitud> solicituds;

	public Empleado() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getFechaIngreso() {
		return this.fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSalario() {
		return this.salario;
	}

	public void setSalario(String salario) {
		this.salario = salario;
	}

	public List<Solicitud> getSolicituds() {
		return this.solicituds;
	}

	public void setSolicituds(List<Solicitud> solicituds) {
		this.solicituds = solicituds;
	}

	public Solicitud addSolicitud(Solicitud solicitud) {
		getSolicituds().add(solicitud);
		solicitud.setEmpleado(this);

		return solicitud;
	}

	public Solicitud removeSolicitud(Solicitud solicitud) {
		getSolicituds().remove(solicitud);
		solicitud.setEmpleado(null);

		return solicitud;
	}

}
