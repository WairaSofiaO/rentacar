package com.accenture.rentacar.app.dao;

import org.springframework.data.repository.CrudRepository;

import com.accenture.rentacar.app.entity.Vehiculo;

public interface IVehiculoDao extends CrudRepository<Vehiculo, Long>{
	//firma del metodo
	//Como la clase que queremos hacerlo el CRUD Vehiculo, 
	//El Long (tipo de dato de primarykey o el ID)
	//public String nombreDelMetodo();

}
