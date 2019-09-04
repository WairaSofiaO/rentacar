package com.accenture.rentacar.app.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

//@Entity + ctrl space e importamos de javax.persistence
@Entity
@Table(name="vehiculos")
public class Vehiculo {
	//Atributos
	
	@Id //Lo vuelve un ID
	@GeneratedValue(strategy = GenerationType.IDENTITY) //IDENTITY: Va usar una columna para el id AUTOINCREMENTADO
	private Long id;
	
	@Column(name="modelo_auto") //Cambia el nombre de la columna modeloAuto
	private short modeloAuto;
	private String marca;
	private String placa;
	private String linea;
	private String color;
	
	//DATE
	//Date + ctrl+ space traer Date, traerlo de JAVA.UTIL
	//El Java.Util es el date de java, necesitamos volverlo
	//del DATE de java.sql, que son diferentes, pero no deja 
	//usarlo inmediatamente por ello se escribe la sig. linea:
	//@Temporal(TemporalType.DATE)
	@Column(name = "fecha_creacion_registro")
	@Temporal(TemporalType.DATE)
	private Date fechaCreacionRegistro;
	
	@PrePersist //antes de guardar, haga: o sea saque el dato
	private void preGuardado() {
		fechaCreacionRegistro = new Date();
		//new Date() guarda la fecha del sistema
	}
	
	//Metodos
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getLinea() {
		return linea;
	}
	public void setLinea(String linea) {
		this.linea = linea;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	public short getModeloAuto() {
		return modeloAuto;
	}

	public void setModeloAuto(short modeloAuto) {
		this.modeloAuto = modeloAuto;
	}

	public Date getFechaCreacionRegistro() {
		return fechaCreacionRegistro;
	}

	public void setFechaCreacionRegistro(Date fechaCreacionRegistro) {
		this.fechaCreacionRegistro = fechaCreacionRegistro;
	}
	
	
}
