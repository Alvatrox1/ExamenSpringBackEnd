package com.examen.model;

import java.util.Date;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table( name = "factura" )
@EntityListeners(AuditingEntityListener.class)
public class Factura {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	private Long idFactura;
	
	@Column ( name = "fecha" )
	private Date fecha;
	
	@Column ( name = "monto" )
	private Double monto;
	
	public Factura() {
		// TODO Auto-generated constructor stub
	}

	public Factura(Long idFactura, Date fecha, Double monto) {
		this.idFactura = idFactura;
		this.fecha = fecha;
		this.monto = monto;
	}

	@Override
	public String toString() {
		return "Factura [idFactura=" + idFactura + ", fecha=" + fecha + ", monto=" + monto + "]";
	}

	public Long getIdFactura() {
		return idFactura;
	}

	public void setIdFactura(Long idFactura) {
		this.idFactura = idFactura;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Double getMonto() {
		return monto;
	}

	public void setMonto(Double monto) {
		this.monto = monto;
	}

}
