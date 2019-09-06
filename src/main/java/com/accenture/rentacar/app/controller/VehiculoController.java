package com.accenture.rentacar.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accenture.rentacar.app.entity.Vehiculo;
import com.accenture.rentacar.app.service.IVehiculoService;

//Volverlo un controlador
@RestController
//Definir una url
@RequestMapping("/api") //para ejecutarlo: localhost:8080/api/vehiculos/id
public class VehiculoController {
	@Autowired
	private IVehiculoService vehiculoService;
	
	@GetMapping("/vehiculo") //Peticion GET
	public List<Vehiculo> listar(){
		return vehiculoService.listarTodos();
	}

	@GetMapping("/vehiculos/{id}") // {id} es variable
	public Vehiculo buscarPorId( @PathVariable Long id) { //recibe el id de la url
		return vehiculoService.buscarVehiculoPorId(id);
	}
	
	@PostMapping("/vehiculos") 
	public Vehiculo guardar(@RequestBody Vehiculo vehiculo) { // lo recibimos en el body de html
		
		return vehiculoService.guardar(vehiculo);
	}
	@PostMapping("/actualizar") //actualizado manual aunque no necesario
	public Vehiculo actualizar(@RequestBody Vehiculo vehiculo) { // lo recibimos en el body de html
		
		Vehiculo vehiAActualizar = new Vehiculo();
		//Vehiculo vehiActual = vehiculoService.buscarVehiculoPorId(vehiculo.getId());
		vehiAActualizar.setId(vehiculo.getId());
		vehiAActualizar.setColor(vehiculo.getColor());
		vehiAActualizar.setLinea(vehiculo.getLinea());
		vehiAActualizar.setMarca(vehiculo.getMarca());
		vehiAActualizar.setModeloAuto(vehiculo.getModeloAuto());
		vehiAActualizar.setPlaca(vehiculo.getPlaca());
		return vehiculoService.guardar(vehiAActualizar);
	}
	@DeleteMapping("/vehiculos/{id}")
	public String borrar(@PathVariable Long id) {
		vehiculoService.borrar(id);
		return "El vehiculo se elimino";
	}
}
