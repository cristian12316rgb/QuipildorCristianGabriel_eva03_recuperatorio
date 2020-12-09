package ar.edu.unlam.pb2.eva03;

import java.util.HashSet;
import java.util.Set;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBatalla;
import ar.edu.unlam.pb2.eva03.excepciones.VehiculoIncompatible;
import ar.edu.unlam.pb2.eva03.excepciones.VehiculoInexistente;
import ar.edu.unlam.pb2.eva03.interfaces.Acuatico;
import ar.edu.unlam.pb2.eva03.interfaces.Terrestre;
import ar.edu.unlam.pb2.eva03.interfaces.Volador;

public class Batalla {
	private Double latitud;
	private Double longitud;
	private TipoDeBatalla tipo;
	Set<Vehiculo> vehiculosEnLaBatalla;
	
	
	public Batalla(Double latitud, Double longitud, TipoDeBatalla tipo) {
		this.latitud = latitud;
		this.longitud = longitud;
		this.tipo = tipo;
		this.vehiculosEnLaBatalla = new HashSet<>();
	}


	public Double getLatitud() {
		return latitud;
	}


	public void setLatitud(Double latitud) {
		this.latitud = latitud;
	}


	public Double getLongitud() {
		return longitud;
	}


	public void setLongitud(Double longitud) {
		this.longitud = longitud;
	}


	public TipoDeBatalla getTipo() {
		return tipo;
	}


	public void setTipo(TipoDeBatalla tipo) {
		this.tipo = tipo;
	}
	
	public Boolean agregarVehiculosEnLaBatalla(Vehiculo vehiculo)throws VehiculoIncompatible, VehiculoInexistente {
		
					switch(this.tipo) {
					case TERRESTRE:
						if(vehiculo instanceof Terrestre) {
							return this.vehiculosEnLaBatalla.add(vehiculo);
						}else{
							throw new VehiculoIncompatible("Vehiculo incompatible");
						}
					case AEREA:
						if(vehiculo instanceof Volador) {
							return this.vehiculosEnLaBatalla.add(vehiculo);
						}else {
							throw new VehiculoIncompatible("Vehiculo incompatible");
						}
					case NAVAL:
						if(vehiculo instanceof Acuatico) {
							return this.vehiculosEnLaBatalla.add(vehiculo);
						}else {
							throw new VehiculoIncompatible("Vehiculo incompatible");
						}
					
					}
				
	       throw new VehiculoInexistente("No existe el vehiculo");
	}
	
}
