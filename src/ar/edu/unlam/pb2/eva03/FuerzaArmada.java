package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBatalla;
import ar.edu.unlam.pb2.eva03.excepciones.VehiculoIncompatible;
import ar.edu.unlam.pb2.eva03.excepciones.VehiculoInexistente;
import ar.edu.unlam.pb2.eva03.interfaces.Acuatico;
import ar.edu.unlam.pb2.eva03.interfaces.Terrestre;
import ar.edu.unlam.pb2.eva03.interfaces.Volador;

public class FuerzaArmada {
//    private Double latitud;
//    private Double longitud;
//    private String nombre;
//    private TipoDeBatalla tipo;
	private Set<Vehiculo> convoy;
	private Map<String, Batalla> batallas;
	
	FuerzaArmada(){
		this.convoy=new HashSet<>();
		this.batallas=new HashMap<>();
	}
	
	
	public void agregarVehiculo(Vehiculo vehiculo) {
		this.convoy.add(vehiculo);
		
	}


	public Integer getCapacidadDeDefensa() {
		return this.convoy.size();
	}


	public void crearBatalla(String nombre, TipoDeBatalla tipo, Double latitud, Double longitud) {
		
		Batalla nueva=new Batalla(latitud,longitud,tipo);
		
		this.batallas.put(nombre,nueva );
		
	}


	public Batalla getBatalla(String nombre) {
		return this.batallas.get(nombre);
	}


	public Boolean enviarALaBatalla(String clave, Integer cod_vehiculo) throws VehiculoIncompatible, VehiculoInexistente {
		TipoDeBatalla nueva=this.batallas.get(clave).getTipo();
		for(Vehiculo prueba:this.convoy) {
			if(prueba.getCodigo().equals(cod_vehiculo)) {
				
				return this.batallas.get(clave).agregarVehiculosEnLaBatalla(prueba);
				
			}
		}
       throw new VehiculoInexistente("No existe el vehiculo");
				
		
	} 
	
	
	
	
	
	
	

}
