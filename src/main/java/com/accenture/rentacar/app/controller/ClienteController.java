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

import com.accenture.rentacar.app.entity.Cliente;
import com.accenture.rentacar.app.service.IClienteService;


//Controlador
@RestController
//Definir url para el mapeo en local host
@RequestMapping("/api")
public class ClienteController {
	@Autowired
	public IClienteService clienteService;
	
	@PostMapping("/guardarCliente")
	public Cliente guardar(@RequestBody Cliente cliente) { //se recibe en body de html
		return clienteService.guardar(cliente);
	}
	@PostMapping("/actualizarCliente") //actualizado manual aunque no necesario
	public Cliente actualizar(@RequestBody Cliente cliente) { // lo recibimos en el body de html
		
		Cliente clienteAActualizar = new Cliente();
		Cliente cliActual = clienteService.buscarClientePorId(cliente.getId());
		clienteAActualizar.setId(cliente.getId());
		clienteAActualizar.setCedula(cliente.getCedula());
		clienteAActualizar.setNombre(cliente.getNombre());
		clienteAActualizar.setDireccion(cliente.getDireccion());
		clienteAActualizar.setEmail(cliente.getEmail());
		return clienteService.guardar(clienteAActualizar);
	}
	@DeleteMapping("/cliente/{id}")
	public String borrar(@PathVariable Long id) {
		clienteService.borrar(id);
		return "El Cliente se elimino";
	}
	@GetMapping("/cliente/{id}") // {id} es variable
	public Cliente buscarPorId( @PathVariable Long id) { //recibe el id de la url
		return clienteService.buscarClientePorId(id);
	}
	@GetMapping("/clientes") //Peticion GET
	public List<Cliente> listar(){
		return clienteService.listarTodos();
	}
	
	
	

}
