package com.accenture.rentacar.app;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.accenture.utilidades.fechas.Fecha;

@SpringBootApplication
public class RentacarApplication {

	public static void main(String[] args) {
		//SpringApplication.run(RentacarApplication.class, args);
		System.out.println("resultado " + Fecha.calcularDias(null, null));
		
		
	
	}

}
