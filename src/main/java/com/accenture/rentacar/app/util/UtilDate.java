package com.accenture.rentacar.app.util;

import java.time.DateTimeException;
import java.util.Date;


public class UtilDate {
//Los metodos estaticos son metodos que se reutilizan para no caer en redundancias
//no puede heredar de esta clase si esta esta declarada como public final class UtilDate
	
	
	
	public static final double VALOR_PI= 3.1416;
	public static int calcularDias(Date fechaInicio, Date fechaFin) {
		//
		try {
			//La logica que puede generar errores, lo que quiero controlar
			long diferencia = fechaFin.getTime() - fechaInicio.getTime();
			//getTime tiempo expresado en milisegundos
			Long d = (diferencia / (1000*60*60*24));
			int dias = d.intValue();
			return dias;
		}
		catch (DateTimeException e) { //e es la representacion del error
			//que hacer cuando el error se genere
			
			//System.err.println(e);
			//Para indicar lanzarla hacia atras, que todas las clases vean la excepcion
			throw e;
		}
		catch (Exception e) {
			throw e;
		}
		finally {
			//Asi lo haya ocurrido un error en el catch o haya funcionado en el try, 
			//este siempre se ejecuta
			//CIERRA CONEXION() 
		}
		
	}
}
