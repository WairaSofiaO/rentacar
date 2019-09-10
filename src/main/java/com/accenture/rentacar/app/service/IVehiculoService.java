package com.accenture.rentacar.app.service;

import java.util.List;

import com.accenture.rentacar.app.entity.Vehiculo;

public interface IVehiculoService {
	//firma del metodo
	//Como la clase que queremos hacerlo el CRUD Vehiculo, 
	//El Long (tipo de dato de primarykey o el ID)
	//public String nombreDelMetodo();
	
	public Vehiculo guardar(Vehiculo vehiculo);
	public void borrar(Long id);
	public Vehiculo buscarVehiculoPorId(Long id);
	public List<Vehiculo> listarTodos();
	public List<Vehiculo> guardarVarios(Vehiculo[] vehiculos);
	
}
