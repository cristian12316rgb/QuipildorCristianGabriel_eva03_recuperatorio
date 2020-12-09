package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.interfaces.Acuatico;

public class Portaviones extends Vehiculo implements Acuatico {
	private Double profundidad=0d;

	Portaviones(Integer cod_Vehiculo, String descripcion) {
		super(cod_Vehiculo, descripcion);
		// TODO Auto-generated constructor stub
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
