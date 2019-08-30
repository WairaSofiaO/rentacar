package com.accenture.rentacar.app.entity;

import javax.persistence.Entity;
//@Entity + ctrl space e importamos de javax.persistence
@Entity
public class Vehiculo {
	//Atributos
	private Long id;
	private short modelo;
	private String marca;
	private String placa;
	private String linea;
	private String color;

	//Metodos
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public short getModelo() {
		return modelo;
	}
	public void setModelo(short modelo) {
		this.modelo = modelo;
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
	
	
}
