package com.examen.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table( name = "persona" )
@EntityListeners(AuditingEntityListener.class)
public class Persona {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	private Long idPersona;
	
	@Column( name = "nombre" )
	@Nonnull
	private String nombre;
	
	@Column ( name = "apellidoPaterno" )
	@Nonnull
	private String apellidoPaterno;
	
	@Column ( name = "apellidoMaterno" )
	private String apellidoMaterno;
	
	@Column ( name = "identificacion" )
	@Nonnull
	private String identificacion;
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}

	public Persona(Long idPersona, String nombre, String apellidoPaterno, String apellidoMaterno, String identificacion) {
		this.idPersona = idPersona;
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.identificacion = identificacion;
	}

	@Override
	public String toString() {
		return "Persona [idPersona=" + idPersona + ", nombre=" + nombre + ", apellidoPaterno=" + apellidoPaterno
				+ ", apellidoMaterno=" + apellidoMaterno + ", identificacion=" + identificacion + "]";
	}

	public Long getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(Long idPersona) {
		this.idPersona = idPersona;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

}
