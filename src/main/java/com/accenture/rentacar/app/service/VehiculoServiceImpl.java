package com.accenture.rentacar.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accenture.rentacar.app.dao.IVehiculoDao;
import com.accenture.rentacar.app.entity.Vehiculo;

@Service 
class VehiculoServiceImpl implements IVehiculoService {
	
	@Autowired //La instancia de la variable lo maneja sprint boot
	private IVehiculoDao vehiculoDao;
	
	@Override
	public Vehiculo guardar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		return vehiculoDao.save(vehiculo);
	}

	@Override
	public void borrar(Long id) {
		vehiculoDao.deleteById(id);

	}

	@Override
	public Vehiculo buscarVehiculoPorId(Long id) {
		// TODO Auto-generated method stub
		return vehiculoDao.findById(id).orElse(null);
	}

	@Override
	public List<Vehiculo> listarTodos() {
		// TODO Auto-generated method stub
		return (List<Vehiculo>) vehiculoDao.findAll();
	}
	@Override
	public List<Vehiculo> guardarVarios(Vehiculo[] vehiculos){
		List<Vehiculo> retorno = new ArrayList<Vehiculo>();
		
		for(Vehiculo vehiculo : vehiculos) {
			vehiculoDao.save(vehiculo);
		}
		return retorno;
	}

}
