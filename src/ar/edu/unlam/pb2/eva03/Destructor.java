package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.interfaces.Acuatico;
import ar.edu.unlam.pb2.eva03.interfaces.Terrestre;

public class Destructor extends Vehiculo implements Acuatico{
	
	private Double profundidad=0d;

	Destructor(Integer cod_Vehiculo, String descripcion) {
		super(cod_Vehiculo, descripcion);
		
	}

	@Override
	public Double getProfundidad() {
		return this.profundidad;
	}

	@Override
	public void setProfundidad(Double nueva) {
		this.profundidad=nueva;
		
	}

	

}
