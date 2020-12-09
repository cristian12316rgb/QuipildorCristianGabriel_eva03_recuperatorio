package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.interfaces.Acuatico;

public class Submarino extends Vehiculo implements Acuatico{
	private Double profundidad=0d;

	Submarino(Integer cod_Vehiculo, String descripcion) {
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
